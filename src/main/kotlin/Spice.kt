


abstract class Spice(){









    class Curry(var name:String ="spice",
                var spiciness:String = "mild"){
        var heat:Int
            get() {

                return when(spiciness)
                {
                    "not spice" -> 0
                    "medium" -> 2
                    "mild" -> 5
                    "spicy" -> 10
                    else -> -1
                }
            }
            set(value){}





        fun makeSalt()
        {
            println("Salt is added")
        }
        fun print()
        {
            println("spice is ${this.name}   " +
                    "heat is ${this.spiciness} - ${this.heat} ")
        }
    }
}