
fun main() {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(spices.sortedBy { it.length })
    println(spices.filter { it[0] == 'c' && it[it.length-1] == 'e' })
    println(spices.take(3).filter { it[0] == 'c' })
}




