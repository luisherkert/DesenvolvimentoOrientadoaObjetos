import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
     print("Digite a quantidade de notas??")
    val qtdNotas = scanner.nextInt()

    var soma = 0.0

for (i in 1..qtdNotas) {
    print("Digite a quantidade de notas $i")
    soma += scanner.nextDouble()

}
    val media = soma / qtdNotas
     println("Média do aluno: %.2f".format(media))


    if (media >= 6) {
        println("Aluno Aprovado!!")}

    else{
            println("Aluno Reprovado!!")


    }

}