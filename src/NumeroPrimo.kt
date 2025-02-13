import java.util.*

fun main(){

    print("Digite o numero: ")
    val numero = readln().toInt()

    if (ehPrimo(numero)){
        println("$numero é um numero primo")
    }else{
        println("$numero Não é um numero primo")
    }


}

fun ehPrimo(n:Int): Boolean {

    if (n<2) return false

    for (i in 2 until n){

    }
    return true
}
