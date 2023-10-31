import Buildings.Brick
import Buildings.Building
import Buildings.Wood
import kotlin.random.Random

fun main() {


    var wood = Wood()
var w = Building<Wood>(wood)
    println(w.baseMaterialsNeeded)
    println(w.actualMaterialsNeeded)
}
