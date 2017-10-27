fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"muchammad")
    map.put(2,"eka")
    map.put(33,"prasetyo")
    println(map.get(33))

    map.put(33,"teknik informatka")
    for (k in map.keys){
        println(map.get(k))
    }
}