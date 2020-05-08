class Nambas {
    var nums : ArrayList<String>? = arrayListOf()

    fun fillML (){
        for (x in 1..15){
            if(x in 1..15){
                nums?.add("B $x")
            }

            if(x in 16..30){
                nums?.add("I $x")
            }

            if(x in 31..45){
                nums?.add("N $x")
            }

            if(x in 46..60){
                nums?.add("G $x")
            }

            if(x in 61..75){
                nums?.add("O $x")
            }
        }
    }

    fun inic() {
        nums?.clear()
        fillML()
        nums?.shuffle()
    }
}