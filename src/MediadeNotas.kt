
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Quantas notas deseja inserir? ")
    val qtdNotas = scanner.nextInt()

    var soma = 0.0// variavel onde começa a soma.
//até aqui o codigo pede as notas dos alunos.

for(i in 1..qtdNotas){
    print("Digite a nota $i: ")
    soma += scanner.nextDouble()
}

    println("A soma das notas é: $soma")
}