class Cuadricula {

    val bl : Array<Int> = arrayOf(
        1, 2, 3, 4, 5,
        6, 7, 8, 9, 10,
        11, 12, 13, 14, 15
    )

    val il : Array<Int> = arrayOf(
        16, 17, 18, 19, 20,
        21, 22, 23, 24, 25,
        26, 27, 28, 29, 30
    )

    val nl : Array<Int> = arrayOf(
        31, 32, 33, 34, 35,
        36, 37, 38, 39, 40,
        41, 42, 43, 44, 45
    )

    val gl : Array<Int> = arrayOf(
        46, 47, 48, 49, 50,
        51, 52, 53, 54, 55,
        56, 57, 58, 59, 60
    )

    val ol : Array<Int> = arrayOf(
        61, 62, 63, 64, 65,
        66, 67, 68, 69, 70,
        71, 72, 73, 74, 75
    )


    fun r5(columna : Array<Int>) : ArrayList<Int>? {
        var col : ArrayList<Int>? = ArrayList()
        var tarr : ArrayList<Int> = columna.toCollection(ArrayList<Int>())

        for (x in 1..5){
            var index : Int = (1 until (tarr.size)).random()

            col?.add(tarr[index])

            tarr.removeAt(index)
        }

        return col

    }

}