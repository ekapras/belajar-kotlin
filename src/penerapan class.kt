class Mobil{
    var mesin=1
    var roda=4
    var body=1

    fun maju(){
        println("Maju...")
    }

    fun mundur(){
        println("Mundur...")
    }

    fun belok(){
        println("belok...")
    }
}

fun main(args: Array<String>) {
    var avanza=Mobil()
    avanza.maju()
    avanza.mundur()
    avanza.belok()

    println("mesin : " + avanza.mesin)
    println("body : " + avanza.body)
    println("belok : " + avanza.belok())
}