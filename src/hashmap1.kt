fun main(args: Array<String>) {
    var map=HashMap<String,String>()
    map.put("nama_depan","muchammad")
    map.put("nama_tengah","eka")
    map.put("nama_belakang","prasetyo")
    println(map.get("nama_depan"))

    map.put("nama_tengah","teknik informatika")
    for (k in map.keys){
        println(k + " " + map.get(k))
    }
}