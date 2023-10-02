import kotlin.random.Random

fun main() {

   var n: Int = 0
   var rollDice: (Int) -> Int = {
      println("Enter dice sides: ")
       n = readLine()?.toIntOrNull() ?: 0
      if (it > 0) {
         Random.nextInt(1, it + 1)
      } else {
         0
      }
   }

   gamePlay(n, rollDice)
}

fun gamePlay(n: Int, operation: (Int) -> Int) {
   val op = operation(n).toString()
   println(op)
}
