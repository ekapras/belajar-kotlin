fun main(args: Array<String>) {
    var arrayint = Array<Int>(5){0}
    arrayint[3]=55
    println("array[3]" + arrayint[3])

    println("all element by object")
    for (element in arrayint){
        println(element)
    }

    println("all element bt index")
    for (index in 0..4) {
        println(arrayint[index])
    }

    var arraystr =Array<String> (4) {""}
    for (index in 0..3){
        print("arraystr [$index]=")
        arraystr[index] = readLine()!!

    }
    for (index in 0..3){
        println("arraystr [$index]=" + arraystr[index])
    }
}