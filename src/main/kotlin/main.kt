
fun main() {

    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("excited", temperature = 30))



}

fun whatShouldIDoToday(mood:String,
                       weather:String = "sunny",
                       temperature:Int = 24):String
{
    return when
    {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        mood == "tired" && weather == "cloudy" -> "Have a cozy day at home."
        mood == "excited" && temperature > 25 -> "Go to the beach!"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."

    }
}


