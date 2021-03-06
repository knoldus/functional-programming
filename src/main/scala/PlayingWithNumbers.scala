import scala.util.control.Breaks.{break, breakable}

/**
  * Find double of first even number greater than 3
  * using traditional approach
  */
object PlayingWithNumbers extends App {

  val numbers = List(1, 2, 3, 5, 4, 6, 7, 8, 9, 10)

  def computeImperatively(numbers: List[Int]): Int = {
    var result = 0
    breakable {
      for(num <- numbers){
        if (Utility.findNumberGreaterThan3(num) && Utility.findEvenNumber(num)) {
          result = Utility.doubleTheValue(num)
          break
        }
      }
    }
    result
  }

  val doubleOfFirstEvenGreaterThan3 = computeImperatively(numbers)
  println(s"Result : $doubleOfFirstEvenGreaterThan3")
}
