/* nama, nilai1, nilai2, nilai3, nilai4
* */
fun main(){
    raport("salsa", "A", "B", "B+", "B")
}
fun raport(name: String, uiux: String, web: String, android: String, comthink: String){
    println("Nilai semester 1 dari siswi atas nama ${name}," +
            "adalah sebagai berikut \nui/ux ${uiux}\nWeb ${web}\n" +
            "Android ${android}\nComthink ${comthink}" )
}