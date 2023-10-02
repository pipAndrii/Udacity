
fun main() {


    canAddFish(10.0, listOf(3,3,3))
    canAddFish(8.0, listOf(2,2,2), hasDecoration = false)
    canAddFish(9.0, listOf(1,1,3), currentFishSize = 3)
    canAddFish(10.0, listOf(), currentFishSize = 7)


}
fun canAddFish(size:Double = 2.0,listFish:List<Int>,hasDecoration:Boolean = true, currentFishSize:Int = 0): Boolean
{
    var sizeWithDecoration = size
    var listFishMutable:MutableList<Int> = listFish.toMutableList()
    if (hasDecoration == true)
    {
         sizeWithDecoration = size - size / 5
    }
    listFishMutable.add(currentFishSize)
    if(sizeWithDecoration < listFishMutable.sum())
    {
        println("false")
        return false
    }
    else
        println("true")
        return true
}


