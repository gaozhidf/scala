import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter
import scala.collection.mutable.Stack
 
class ExampleSpecGWTBAA extends FeatureSpec with GivenWhenThen with BeforeAndAfter {
 
  var stack: Stack[Int] = _

  before {
    stack = new Stack[Int]
  }

  var abc = 3
  
  feature("The user can pop an element off the top of the stack") {
 
    info("As a programmer")
    info("I want to be able to pop items off the stack")
    info("So that I can get them in last-in-first-out order")

    
    println("ddd")
    scenario("pop is invoked on a non-empty stack") {
 
      given("a non-empty stack")
      println(abc)
      println("a1")
      stack.push(1)
      stack.push(2)
      val oldSize = stack.size
      
      when("when pop is invoked on the stack")
      println(abc)
      println("a2")
      val result = stack.pop()
 
      then("the most recently pushed element should be returned")
      println(abc)
      assert(result === 2)
 
      and("the stack should have one less item than before")
      assert(stack.size === oldSize - 1)
      println(abc)
      println("a3")
      abc = 1
    }
    
    println("eee")
    scenario("pop is invoked on an empty stack") {
 
      given("an empty stack")
      println(abc)
      println("b1")
      when("when pop is invoked on the stack")
      println(abc)
      println("b2")
      then("NoSuchElementException should be thrown")
      intercept[NoSuchElementException] {
        stack.pop()
      }
 
      and("the stack should still be empty")
      assert(stack.isEmpty)
      println(abc)
      println("b3")
      abc = 2
    }
    
    println("fff")
  }
}