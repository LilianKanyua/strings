fun main(){
    var volume=findVolume(12,15,16)
    println(volume)

    fullName("Abigael", "Awuor")
}
fun findVolume(height: Int, width: Int, length: Int) : Int{
    var volume= height*width*length
    return volume
}
fun fullName(bapName: String, lastName: String) {
    println(bapName +" " + lastName)
}
