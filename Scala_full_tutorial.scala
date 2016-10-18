/** Author: Ben Squire 
  *Video: Derek Banas 
  *Date: 10/17/16
  *This is a tutorial about the Language Scala from start to finish. 
  *It contains examples of many different data type.
  *Shows examples of functional programming.
  *The walkthrough can be found at the Youtube link below
  *https://www.youtube.com/watch?v=DzFt0YkZo8M
*/

object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0 

		while(i <= 10){
			println(i)
			i += 1
		}
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		do {
			println(i)
			i += 1
		}while(i <=20) 
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		for (i <- 1 to 10)
			println(i)
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

		for (i <- o until randLetters.length)
			println(randLetters(i))
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		val aList = List(1,2,3,4,5)

		for (i <- aList)
			println("List items " + i)
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0
		var evenList = for { i <- 1 to 20
			if (i % 2) == 0
			} yield i

		for (i <- evenList)
			println(i)
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0
		for (i <- 1 to 5; j <- 6 to 10){
			println("i: " + i)
			println("j: "  + j)
		}
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		def printPrimes(){
			val primeList = List(1,2,3,5,7,11)
			for (i <- primeList){
				if (i == 11){
					return
				}
				if (i != 1) {
					println(i)
				}
			}
		}
		printPrimes
	}
}

import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
		var numberGuess = 0
		do{
			print("Guess a number ")
			numberGuess = readLine.toInt

		} while( numberGuess != 15)

		printf("You guessed  the secret number %d\n",15)
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		val name = "Ben"
		val age = 24
		val weight = 185.5

		println(s"Hello $name")
		println(f"I am ${age +1} and weigh $weight%.2f")	
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		val name = "Ben"
		val age = 24
		val weight = 185.5

		println(s"Hello $name")
		println(f"I am ${age +1} and weigh $weight%.2f")
		printf("'%5d'\n", 5)
		printf("'%-5d'\n", 5)
		printf("'%05d'\n", 5)
		printf("'%.5f'\n", 3.14)
		printf("'%-5s'\n", "hi")	
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var randSent = "I saw a dragon fly by"

		println("String length : " + randSent.length)
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var randSent = "I saw a dragon fly by"

		println(randSent.concat(" and explode"))
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var randSent = "I saw a dragon fly by"

		println("Are strings equal " + "I saw a dragon".equals(randSent))
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var randSent = "I saw a dragon fly by"

		println("dragon starts at index " + 
			 randSent.indexOf("dragon"))
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		var randSent = "I saw a dragon fly by"

		val randSentArray = randSent.toArray

		for (v <- randSentArray)
			println(v)
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		
		// def funcNae (param1:dataType, param2:dataType) : returnType = {
		//		function body
		// 		return valuetoReturn	
		// }	
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		
		def getSum(num1 : Int = 1, num2 : Int = 1) : Int = {
			return num1 + num2
		}
		println("5 + 4 = "+ getSum(5,4))
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		
		def getSum(num1 : Int = 1, num2 : Int = 1) : Int = {
			 num1 + num2
		}
		println("5 + 4 = "+ getSum(5,4))
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		
		def getSum(num1 : Int = 1, num2 : Int = 1) : Int = {
			num1 + num2
		}
		println("5 + 4 = "+ getSum(num2 = 5,num1 = 4))
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		
		def sayHi() : Unit = {
			println("Hi how are you?")
		}
		sayHi
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		
		def getSum(args: Int*)  : Int = {
			var sum : Int = 0
			for (num <- args) {
				sum += num
			}
			sum
		}
		println("Get Sum " + getSum(1,2,3,4,5,6,7))
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		
		def factorial(num : BigInt) : BigInt = {
			if (num <= 1)
				1
			else
				num * factorial(num-1)
		}
		println("Factorial of 4 = " + factorial(4))
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		val favNums = new Array[Int](20)
		val friends = Array("Bob", "Tom")
		friends(0) = "Sue"
		println("Best Friends " + friends(0))
		val friends2 = ArrayBuffer[String]()
		friends2.insert(0,"Phil")
		friends2 += "Mark"
		friends2 ++= Array("Suzye", "Paul")
		friends2.insert(1,"Mike", "Sally", "Sam", "Mary", "Sue")
		friends2.remove(1,2)
		var friend : String = "  "
		for (friend <- friends2)
			println(friend)
	}
}

object ScalaTutorial {
	def main(args: Array[String]){
		val favNums = new Array[Int](20)
		val friends = Array("Bob", "Tom")
		friends(0) = "Sue"
		println("Best Friends " + friends(0))
		val friends2 = ArrayBuffer[String]()
		friends2.insert(0,"Phil")
		friends2 += "Mark"
		friends2 ++= Array("Suzye", "Paul")
		friends2.insert(1,"Mike", "Sally", "Sam", "Mary", "Sue")
		friends2.remove(1,2)
		var friend : String = "  "
		for (friend <- friends2)
			println(friend)
		for (j <- 0 to (favNums.length -1)){
			favNums(j) = j
			println(favNums(j))
		}
		val favNumsTimes2 = for(num <-favNums) yield 2 * num
		favNumsTimes2.foreach(println)
		var favNumsDiv4 = for(num <- favNums if num % 4 == 0 ) yield num
		favNumsDiv4.foreach(println)
		var multTable = Array.ofDim[Int](10,10)
		for (i <- 0 to 9){
			for (j <- 0 to 9){
				multTable(i)(j) = i * j
			}
		}
		for (i <- 0 to 9){
			for (j <- 0 to 9){
				printf("%d : %d = %d\n",i,j,multTable(i)(j))
			}
		}
		println("Sum : " + favNums.sum)
		println("Min : " + favNums.min)
		println("Max : " + favNums.max)
		val sortedNums = favNums.sortWith(_>_)
		println(sortedNums.deep.mkString(", "))
	}
}
/**Map( )  <-- Not Mutable!
  *create a map of key value pairs of pattern k -> v
  *if map contains key "Manager" then:
  *collection.mutable.Map() is mutable
  *for loop can iterate over maps as k,v pairs
  */
object ScalaTutorial {
	def main(args: Array[String]){
		val employees = Map("Manager" -> "Bob Smith", 
			"Secretary" ->"Sue Brown")
		if (employees.contains("Manager"))
			printf("Manager : %s\n", employees("Manager"))

		val customers = collection.mutable.Map(100 -> "Paul Smith", 
			101 -> "Sally Smith")
		printf("Cust 1 : %s\n", customers(100))
		customers(100) = "Tom Marks"
		customers(102) = "Megan Swift"
		for ((k,v) <- customers){
			printf("%d : %s\n ", k, v)
		}
	}
}
/**Tuples 
  *how to access indices in a tuple with ._#
  *iterate through a tuple using a for each method
  *print a tuple as a string using .toString method
  */
object ScalaTutorial {
	def main(args: Array[String]){
		var tupleMarge = (103, "Marge Simpson", 10.25)
		printf("%s owes us $%.2f\n",tupleMarge._2,tupleMarge._3)
		tupleMarge.productIterator.foreach{ i => println(i)}
		println(tupleMarge.toString)
	}
}
/**The below script shows how to use getter setter style scala
  *It also defines class variables
  *Class variables have methods, and constructors
  */
import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
		val rover = new Animal
		rover.setName("Rover")
		rover.setSound("Woof")
		printf("%s says %s\n", rover.getName,rover.getSound)

		val whiskers = new Animal("Whiskers", "Meow")
		println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}\n")
		println(whiskers.toString)

	} // END OF MAIN

	class Animal(var name: String, var sound: String){
	  this.setName(name)
	  val id = Animal.newIdNum

	  def getName() : String = name
	  def getSound() : String = sound	 
	  def setName(name : String){
	  	if(!(name.matches(".*\\d+.*")))
	  		this.name = name
	  	else
	  		this.name = "No Name"
	  } 
	  def setSound(sound: String){
	  	this.sound = sound
	  }
	  def this(name: String){
	  		this("No Name", "No Sound")
	  		this.setName(name)
	  }
	  def this(){
	  		this("No Name", "No Sound")
	  }
	  override def toString() : String = {
	  	return "%s with the id %d says %s".format(this.name,this.id,this.sound)
	  }
	}

	object Animal {
		private var idNumber = 0
		private def newIdNum = { idNumber += 1; idNumber }
	}

}

import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
		val rover = new Animal
		rover.setName("Rover")
		rover.setSound("Woof")
		printf("%s says %s\n", rover.getName,rover.getSound)

		val whiskers = new Animal("Whiskers", "Meow")
		println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}\n")
		println(whiskers.toString)

		val spike = new Dog("Spike", "Woof", "Grrrr")
		spike.setName("Spike")
		println(spike)

	} // END OF MAIN
	abstract class Mammal(val name: String){
		va moveSpeed : Double

		def move : String
	}

	class Wolf(name: String) extends Mammal(name){
		var moveSpeed = 35.0

		def move = "The wolf %s runs %.2f mph".format(this.name,this.moveSpeed)
	}

	class Animal(var name: String, var sound: String){
	  this.setName(name)
	  val id = Animal.newIdNum

	  def getName() : String = name
	  def getSound() : String = sound	 
	  def setName(name : String){
	  	if(!(name.matches(".*\\d+.*")))
	  		this.name = name
	  	else
	  		this.name = "No Name"
	  } 
	  def setSound(sound: String){
	  	this.sound = sound
	  }
	  def this(name: String){
	  		this("No Name", "No Sound")
	  		this.setName(name)
	  }
	  def this(){
	  		this("No Name", "No Sound")
	  }
	  override def toString() : String = {
	  	return "%s with the id %d says %s".format(this.name,this.id,this.sound)
	  }
	}

	object Animal {
		private var idNumber = 0
		private def newIdNum = { idNumber += 1; idNumber }
	}
	// New Class which inhereits from last class Animal
	class Dog (name: String, sound: String, growl: String) extends Animal(name, sound){
		// Default constructor (if no frow)
		def this(name: String, sound: String){
			this("No Name",sound, "No Growl")
			this.setName(name)
		}

		def this(name: String){
			this("No Name","No Sound", "No Growl")
			this.setName(name)
		}
		def this(){
			this("No Name","No Sound", "No Growl")
		}
		override def toString() : String = {
	  	return "%s with the id %d says %s".format(this.name,this.id,this.growl)
	  	}
	}

}// END of ScalaTutorial

def main(args: Array[String]){
		val fang = new Wolf("Fang")
		fang.moveSpeed = 36.0 
		println(fang.move)

	} // END OF MAIN

def main(args: Array[String]){
		val fang = new Wolf("Fang")
		fang.moveSpeed = 36.0 
		println(fang.move)

	} // END OF MAIN
	abstract class Mammal(val name: String){
		var moveSpeed : Double

		def move : String
	}
/** 
  *Demo of traits (a.k.a methods)	
  *when defining the class note the extends syntax
  */
 object ScalaTutorial {
	def main(args: Array[String]){
		val superman = new Superhero("Superman")
		println(superman.fly)
		println(superman.hitByBullet)
		println(superman.ricochet(2500))
	} // END OF MAIN

	trait Flyable {
		def fly : String
	}

	trait BulletProof{
		def hitByBullet : String

		def ricochet(startSpeed : Double) : String = {
			"The Bullet ricochets at a speed of %.1f ft/sec".format(startSpeed *.75)
		}
	}
	class Superhero(val name : String) extends Flyable with BulletProof{
		def fly = "%s flys through the air".format(this.name)

		def hitByBullet = "The bullet bounces off the %s".format(this.name)
	}
}// END of ScalaTutorial

object ScalaTutorial {
	def main(args: Array[String]){
		val log10Func = log10 _

		println(log10Func(1000))
	} // END OF MAIN
}// END of ScalaTutorial

def main(args: Array[String]){
		val log10Func = log10 _

		println(log10Func(1000))

		List(1000.0,10000.0).map(log10Func).foreach(println)

		List(1,2,3,4,5).map((x : Int) => x *50).foreach(println)

		List(1,2,3,4,5).filter(_ % 2 ==0).foreach(println)
	} // END OF MAIN

object ScalaTutorial {
	def main(args: Array[String]){
		val log10Func = log10 _

		def times3(num : Int) = num * 3
		def times4(num : Int) = num * 4

		def multIt(func : (Int) => Double, num : Int){
			func(num)
		}

		printf("3 * 100 = %.1f\n", multIt(times3,100))
	} // END OF MAIN
}// END of ScalaTutorial

object ScalaTutorial {
	def main(args: Array[String]){
		
		val writer = new PrintWriter("test.txt")
		writer.write("Just some random text\nSome more random text\nSome more and more")
		writer.close()
		
		val textFromFile = Source.fromFile("test.txt","UTF-8")

		val lineIterator = textFromFile.getLines

		for (line <- lineIterator){
			println(line)
		}
		textFromFile.close()

	} // END OF MAIN
}// END of ScalaTutorial

object ScalaTutorial {
	def main(args: Array[String]){
		def divideNums(num1 : Int, num2 : Int) = try 
		{
			(num1 / num2)
		}catch {
			case ex : java.lang.ArithmeticException => "Can't Divide by zero"
		}finally{
			// clean up after exception
		}
		println("3 / 0 = " + divideNums(3,0))

	} // END OF MAIN
}// END of ScalaTutorial