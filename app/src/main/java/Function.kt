/* Cetak 5 baris sapaan denagn menyebut nama
* contoh : Halo selamat pagi Salsa
* 1 x pagi, 5 x siang, 3 x sore, 1 x malam, 1 x pagi, 2 x goodbye*/

fun main(){
    val name = "salsa"
    morning(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    evening(name)
    evening(name)
    evening(name)
    night(name)
    morning(name)
    goodbye(name)
    goodbye(name)
}
fun morning(name : String){
    println(" Halo selamat pagi ${name}")
}
fun afternoon(name : String){
    println("Halo selamat siang ${name}")
}
fun evening(name : String){
    println("Halo selamat sore ${name}")
}
fun night(name : String){
    println("Halo selamat malam ${name}")
}
fun goodbye(name : String){
    println("Halo sampai jumpa ${name}")
}
