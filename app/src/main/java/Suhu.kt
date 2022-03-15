import java.util.*

/*Pilihlah skala suhu yang kamu inginkan dengan angka 1, 2, atau 3 !
1. Fahrenheit
2. Kelvin
3. Reamur
Inputkan pilihanmu : */

fun main(){
    val reader = Scanner(System.`in`)
    print("Pilihlah skala suhu yang kamu inginkan dengan angka 1, 2, atau 3 !\n" +
            "1. Fahrenheit\n" +
            "2. Kelvin\n" +
            "3. Reamur\n" +
            "inputkan pilihanmu : ")

    val bil1 = reader.nextInt()

    if (bil1==1) {
        val skalaKonversi = "Farenheit"
        print("Masukkan suhu dalam skala celcius yang ingin kamu konversikan !\n" +
                "Masukkan suhu (celcius) :\n")
        val bil2 = reader.nextInt()
        println("Masukkan Celcius : ")
        val suhuAwal = bil2
        val suhuAkhir = (suhuAwal * 9/5) + 32
        print ("Hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalaKonversi")

    }else if (bil1==2) {
        val skalaKonversi = "Kelvin"
        print("Masukkan suhu dalam skala celcius yang ingin kamu konversikan !\n" +
                "Masukkan suhu (celcius) :\n")
        val bil2 = reader.nextInt()
        println("Masukkan Celcius : ")
        val suhuAwal = bil2
        val suhuAkhir = suhuAwal + 273
        print ("Hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalaKonversi")

    }else {
        val skalaKonversi = "Reamur"
        print("Masukkan suhu dalam skala celcius yang ingin kamu konversikan !\n" +
                "Masukkan suhu (celcius) :\n")
        val bil2 = reader.nextInt()
        println("Masukkan Celcius : ")
        val suhuAwal = bil2
        val suhuAkhir = suhuAwal + 4/5
        print ("Hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalaKonversi")
    }




}
