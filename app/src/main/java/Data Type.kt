/*Data Type
Variable : 1. Immutable -> yang tidak bisa diubah (val)
            2. Muttable -> bisa diubah (var)

       1. Huruf >1 -> String
       2. Character 1 -> Char
       3. Angka : 1. ,, Decimal -> Double
                  2. Bilangan bulat -> Int
                  3. Decimal digitnya banyak -> Float
       4. Boolean (1/0, benar dan salah)

 */
fun main(){
    val text: String = "Salsabila"
    val number = text.length
    print("Nama ku $text,\nJumlah Karakternya adalah ${text.length}" +
            ",\nJika dibalik menjadi ${text.reversed()} ")
}
