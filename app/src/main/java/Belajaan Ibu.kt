import java.util.*

/* Ibu beli belajaan di supermarket
400.000 -> diskon 4 %
800.000 -> diskon 9 %
1.600.000 -> diskon 19 %
2.000.000 -> diskon 25 %
3.000.000 -> diskon 40 %
total uang yang harus dibayar */

fun main(){
    val reader = Scanner(System.`in`)
    print("Masukan jumlah uang =")
    val price = reader.nextInt()
    val resultDiskon : Int
    val finalPrice : Int
    if(price >= 400000 && price < 800000){
         resultDiskon = 400000 * 4 /100
         finalPrice = price - resultDiskon
        print("Maka total bayar adalah $finalPrice")
    }else if(price >= 800000 && price < 1600000){
         resultDiskon = 800000 * 9 /100
         finalPrice = price - resultDiskon
        print("Maka total bayar adalah $finalPrice")
    }else if(price >= 1600000 && price < 2000000){
         resultDiskon = 1600000 * 19 /100
         finalPrice = price - resultDiskon
        print("Maka total bayar adalah $finalPrice")
    }else if(price >= 2000000 && price < 3000000){
         resultDiskon = 2000000 * 25 /100
         finalPrice = price - resultDiskon
        print("Maka total bayar adalah $finalPrice")
    }else{
         resultDiskon = 3000000 * 40 /100
         finalPrice = price - resultDiskon
        print("Maka total bayar adalah $finalPrice")

    }

}







