import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    print("Masukan luas meter persegi : ")
    val luasSawah = reader.nextInt()

    if(luasSawah < 100){
        val harga = luasSawah * 100000
        print("Harga yang harus dibayar Rp$harga")
    }else if(luasSawah >= 100 && luasSawah < 500){
        val harga = luasSawah * 100000
        val diskon = harga * 2/100
        if(diskon >= 500000){
            val finalHarga = harga - 500000
            print("Harga yang harus dibayar adalah sejumlah Rp$finalHarga")
        }
    }else if(luasSawah >= 500 && luasSawah < 1000){
        val harga = luasSawah * 100000
        val diskon = harga * 5/100
        if(diskon >= 500000){
            val finalHarga = harga - 500000
            print("Harga yang harus dibayar adalah sejumlah Rp$finalHarga")
        }
    }else if(luasSawah >= 1000 && luasSawah < 4000){
        val harga = luasSawah * 100000
        val diskon = harga * 12/100
        if(diskon >= 500000){
            val finalHarga = harga - 500000
            print("Harga yang harus dibayar adalah sejumlah Rp$finalHarga")
        }
    }else{
        val harga = luasSawah * 100000
        val diskon = harga * 25/100
        if(diskon >= 500000){
            val finalHarga = harga - 500000
            print("Harga yang harus dibayar adalah sejumlah Rp$finalHarga")
    }
}
}
