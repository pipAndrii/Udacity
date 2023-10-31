package Buildings

open class BaseBuildingMaterial() {
    open val numberNeeded: Int = 1
}


class Wood():BaseBuildingMaterial()
{
    override val numberNeeded:Int = 4
}

class Brick():BaseBuildingMaterial()
{
    override val numberNeeded:Int = 8
}

class Building<out T:BaseBuildingMaterial>(val buildingMaterial:T)
{
    val baseMaterialsNeeded: Int = 100
    var actualMaterialsNeeded:Int = baseMaterialsNeeded *  buildingMaterial.numberNeeded


}
