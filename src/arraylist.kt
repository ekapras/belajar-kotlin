fun main(args: Array<String>) {
    var arraylist=ArrayList<String>()
    arraylist.add("eka")
    arraylist.add("prasetyo")
    arraylist.add("teknik informatika")

    println("first name : " + arraylist.get(0))

    println("all element by object")
    for (item in arraylist){
        println (item)
    }
}