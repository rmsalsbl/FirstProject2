import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    print("Masukan bilangan : ")
    val number = reader.nextInt()

    if (number < 0){
        print("Negative")
    }else{
        print("Positive")
    }


}