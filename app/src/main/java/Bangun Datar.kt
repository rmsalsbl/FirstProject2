// Tugas : Persegi, persegi panjang, jajar genjang, layang - layang,
// trapesium, lingkaran, segitiga, belah ketupat

fun main(){
    persegi(4.0)
    persegiPanjang(panjang = 6.0, lebar = 4.0)
    jajarGenjang(alas = 5.0, tinggi = 8.0)
    layangLayang(diagonal1 = 40.0, diagonal2 = 45.0)
    trapesium(a = 5.0, b = 5.0, tinggi = 8.0)
    lingkaran(radius = 18.0)
    segitiga(alas = 5.0, tinggi = 8.0)
    belahKetupat(diagonal1 = 20.0, diagonal2 = 25.0)
}

fun belahKetupat(diagonal1: Double, diagonal2: Double) {
    val result8 = diagonal1 * diagonal2 /2
    println("Luas Belah Ketupat adalah $result8")
}

fun segitiga(alas: Double, tinggi: Double) {
    val result7 = alas * tinggi /2
    println("Luas Segitiga adalah $result7")
}

fun lingkaran(radius : Double) {
    val result6 = radius * radius
    println("Luas Lingkaran adalah $result6")
}

fun trapesium(a : Double, b : Double, tinggi: Double) {
    val result5 = (a + b) * tinggi /2
    println("Luas Trapesium adalah $result5")
}

fun layangLayang(diagonal1 : Double, diagonal2: Double) {
     val result4 = diagonal1 * diagonal2 /2
    println("Luas Layang - Layang adalah $result4")
}

fun jajarGenjang(alas : Double, tinggi : Double) {
    val result3 = alas * tinggi
    println("Luas Jajar Genjang adalah $result3")
}

fun persegiPanjang(panjang : Double, lebar : Double) {
    val result1 = panjang * lebar
    println("Luas Persegi Panjang adalah $result1")
}

fun persegi(sisi : Double) {
    val result = sisi * sisi
    println("Luas Persegi adalah $result")
}
