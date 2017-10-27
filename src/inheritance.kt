open class Pesawat{
    val sayap: Int = 2

    fun terbang(){
        println("terbang...")
    }

    fun mendarat(){
        println("mendarat")
    }
}

class PesawatTempur : Pesawat(){
    var rudal: Int = 4

    fun manuver(){
        println("manuver...")
    }
}

fun main(args: Array<String>) {
    var boeing = Pesawat()
    var f16 = PesawatTempur()

    boeing.terbang()
    f16.terbang()

    boeing.mendarat()
    f16.mendarat()

    //boeing.manuver() --> ERROR
    f16.manuver()
}