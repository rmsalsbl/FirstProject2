fun main(){
    val bil1   = 3
    val bil2   = 5
    val radius = 18
    val p      = 6
    val sisi   = 4
    val l      = 4
    val a      = 5
    val t      = 8
    val d1     = 40
    val d2     = 45
    val b      = 5
// Tugas : Persegi, persegi panjang, jajar genjang, layang - layang,
// trapesium, lingkaran, segitiga, belah ketupat
    //Penjumlahan
    val result1 = bil1 + bil2
    //Pengurangan
    val result2 = bil2 - bil1
    //Perkalian
    val result3 = bil1 * bil2
    //Pembagian
    val result4 : Double = bil2.toDouble() / bil1.toDouble()
    //Lingkaran
    val luas_lingkaran : Double = 3.14 * (radius.toDouble() * radius.toDouble())
    //Persegi
    val luas_persegi = sisi * sisi
    //Persegi Panjang
    val luas_persegi_panjang = p * l
    //Jajar genjang
    val luas_jajar_genjang = a * t
    //Layang - layang
    val luas_layang_layang = d1 * d2 /2
    //Trapesium
    val luas_trapesium = (a + b) * t /2
    //Segitiga
    val luas_segitiga = a * t /2
    //Belah ketupat
    val luas_belah_ketupat = d1 * d2 /2
    println("Hasil operasi aritmatika antara bilangan 1 dan 2" +
            " adalah sbb\nPenjumlahan $result1 \nPengurangan $result2 " +
            "\nperkalian $result3 \nPembagian $result4 " +
            "\nLuas Lingkaran $luas_lingkaran \nLuas pesegi $luas_persegi " +
            "\nLuas persegi panjang $luas_persegi_panjang " +
            "\nLuas jajar genjang $luas_jajar_genjang \nLuas layang - layang " +
            "$luas_layang_layang \nLuas trapesium $luas_trapesium \nLuas segitiga " +
            "$luas_segitiga \nLuas belah ketupat $luas_belah_ketupat")
}