import kotlin.random.Random

fun main() {

var spices = listOf(
    Spice("Cayenne", "spicy"),
    Spice("Paprika", "mild"),
    Spice("Cumin", "medium"),
    Spice("Black Pepper", "spicy"),
    Spice("Ginger", "mild"),
    Spice("Ginger2", "not spice")
)
spices[0].makeSalt()
    for (i in spices)
    {
        i.print()
    }
}
