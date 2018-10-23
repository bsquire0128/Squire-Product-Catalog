#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Oct 18 14:20:13 2018

@author: bsquire1271
@script: Colorizes 
"""
import xml.etree.ElementTree as ET
import argparse


class GraphMe:
    filepath = '/path/to/folder/'
    tree = []
    inputfile = ''
    outputfile = ''
    output = ''
    visual_dict={'Node1':{'id':'node1_id','color':'#ff6666','shape':'ellipse'},
            'Node2':{'id':'node2_id','color':'#fff666','shape':'ellipse'}
            }
    def __init__(self, args):
        self.args = args
        self.inputfile = args.filename
        self.visual_dict = args.visual_dict
    def colorfile(self):
        self.outputfile = self.inputfile + '_colored' 
        
def main():
    args = init()
    g = GraphMe(args)
    pipeline = [parse_tree,update_root_ns,update_children_nodes,clean_output,writetofile]
    for fun in pipeline:
        g = fun(g)
    
    
def init():
    parser = argparse.ArgumentParser(description = 'Python Script to colorize graphml file')
    parser.add_argument('filename',type = str, help = 'filename of graphml file without extension (no .graphml part)')
    parser.add_argument('visual_dict',type=str, help = "dictionary object with format {'Node1':{'id':'node1id','color':'#ff6666','shape':'ellipse'}}"
    return parser.parse_args()

def parse_tree(graphme):
    graphme.tree = ET.parse(graphme.filepath+graphme.inputfile+'.graphml')
    return graphme

def update_root_ns(graphme):
    tree = graphme.tree
    vdict = graphme.visual_dict
    root = tree.getroot()
    root.attrib['{http://graphml.graphdrawing.org/xmlns}y'] ="http://www.yworks.com/xml/graphml"
    root.attrib['{http://graphml.graphdrawing.org/xmlns}x'] ="http://www.yworks.com/xml/yfiles-common/markup/2.0"
    root.attrib['{http://graphml.graphdrawing.org/xmlns}java'] ="http://www.yworks.com/xml/yfiles-common/1.0/java"
    root.attrib['{http://graphml.graphdrawing.org/xmlns}sys'] ="http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0"
    root.attrib['{http://graphml.graphdrawing.org/xmlns}yed'] ="http://www.yworks.com/xml/yed/3"
    elem = ET.Element('key',attrib={'for':'node','id':'description','attr.name':'description','attr.type':'string'})
    root.insert(0,elem)
    for k,v in vdict.items():
        elem = ET.Element('key',attrib={'for':'node','id':v['id'],'yfiles.type':'nodegraphics'})
        elem.text = '\n'
        root.insert(0,elem)
    graphme.tree = tree
    return graphme

def update_children_nodes(graphme):
    tree = graphme.tree
    vdict = graphme.visual_dict
    root = tree.getroot()
    for child in root[-1].getchildren():
        if 'node' in child.tag:
            for node_type,node_visual in vdict.items():
                if node_type in child.attrib['labels']:
                    des_elem = ET.Element('{http://graphml.graphdrawing.org/xmlns}data',attrib ={'key':'description'})
                    des_elem.text = node_type
                    child.insert(2,des_elem)
                    for gchild in child.getchildren():
                        if gchild.attrib['key'] == node_visual['id']:
                            sub_shape_elem = ET.Element('{http://www.yworks.com/xml/graphml}ShapeNode')
                            comp_shape_elem0 = ET.Element('{http://www.yworks.com/xml/graphml}Geometry',attrib={'height':'50.0','width':'50.0'})
                            comp_shape_elem1 = ET.Element('{http://www.yworks.com/xml/graphml}Fill',attrib={'color':node_visual['color'],'transparent':'false'})
                            comp_shape_elem2 = ET.Element('{http://www.yworks.com/xml/graphml}NodeLabel',attrib={'alignment':'center','autoSizePolicy':'content','fontFamily':'Droid Sans Mono','fontSize':'14','fontStyle':'bold','hasBackgroundColor':'false','hasLineColor':'false','height':'17.96875','modelName':'custom','textColor':'#000000','visible':'true'})
                            comp_shape_elem2.text = gchild.text
                            gchild.text = ''
                            comp_shape_elem3 = ET.Element('{http://www.yworks.com/xml/graphml}Shape',attrib={'type':node_visual['shape']})
                            sub_shape_elem.insert(0,comp_shape_elem0)
                            sub_shape_elem.insert(1,comp_shape_elem1)                    
                            sub_shape_elem.insert(2,comp_shape_elem2)
                            sub_shape_elem.insert(3,comp_shape_elem3)
                            gchild.insert(0,sub_shape_elem)
    graphme.tree = tree
    return graphme

def clean_output(graphme):
    """
    Hacky namespace cleaning 
    """
    root = graphme.tree.getroot()
    string = ET.tostring(root).decode('utf-8')
    replce = string[116:506].replace('ns0:','xmlns:')
    string = string[:116]+replce +string[506:]
    string = string.replace('ns0:','')
    string = string.replace(':ns0','')
    string = '<?xml version="1.0" encoding="UTF-8" standalone="no"?>\n'+ string
    graphme.output = string
    return graphme
    
def writetofile(graphme):
    graphme.colorfile()
    with open(graphme.filepath+graphme.outputfile+'.graphml', 'w') as f:
        f.write(graphme.output)
        
if __name__=='__main__':
    main()    
                        
                
        
        
    
