// escolher projeto
fun main(){

    var progect:Boolean = true

    while (progect == true){
        print("Projetos:\n" +
                "'Nome do Carro Fusca' -1\n" +
                "'Nome do Usuario' -2\n" +
                "'Nome e Idade' -3\n" +
                "'Calcular Area' -4\n" +

                "Digite um Progeto: ")
        var select = readln().toInt()
        println()

        if (select == 1){
            fusca()
        }
        else if (select == 2){
            nomeUser()
        }
        else if (select == 3){
            nameage()
        }
        else if (select == 4){
            calcular()
        }

        //continuar ou encerrar o programa
        print("Continuar? (S/N): ")
        var continuar = readln().toLowerCase()
        if (continuar == "n"){
            progect = false
        }
    }

}

//Nome do carro Fusca
fun fusca(){

    var nome_do_carro:String = "'Fusca'"
    println(nome_do_carro)
    println()

}

//Nome do Usuario
fun nomeUser(){

    print("Digite seu nome: ")
    var nomeUser = readln().toString()

    println("Olá $nomeUser!")
    println()
}

//Nome e Idade
fun nameage(){

    print("Digite seu nome: ")
    var nomeUser = readln().toString()

    print("Digite sea idade: ")
    var idade = readln().toInt()

    println("Olá $nomeUser, você tem $idade anos de idade.")
    println()

}


//Calcular Area
fun calcular(){

    var progect:Boolean = true

    while (progect == true){
        print("Formas Geometricas:\n" +
                "'Reangulo' -1\n" +
                "'Quadrado' -2\n" +
                "'Losango' -3\n" +
                "'Trapezio' -4\n" +
                "'Paralelogramo' -5\n" +
                "'Triangulo' -6\n" +
                "'Circulo' -7\n" +

                "Digite uma Forma: ")
        var select = readln().toInt()
        println()

        if (select == 1){
            retangulo()
        }
        else if (select == 2){
            quadrado()
        }
        else if (select == 3){
            losango()
        }
        else if (select == 4){
            trapezio()
        }
        else if (select == 5){
            Paralelogramo()
        }
        else if (select == 6){
            triangulo()
        }
        else if (select == 7){
            circulo()
        }

        //continuar ou encerrar o programa
        print("Continuar na 'Calcular Area'? (S/N): ")
        var continuar = readln().toLowerCase()
        if (continuar == "n"){
            progect = false
        }
    }

}
fun retangulo(){

    println("Retangulo")
    print("Digite o tamanho da Base: ")
    var base = readln().toDouble()

    print("Digite o tamanho da Altura: ")
    var altura = readln().toDouble()

    var area = base * altura

    println("O tamanho da Area é: $area ")
    println()

}
fun quadrado(){

    println("Quadrado")
    print("Digite o tamanho do lado: ")
    var lado = readln().toDouble()

    var area = lado * lado

    println("O tamanho da Area é: $area ")
    println()

}
fun losango(){

    println("Losango")
    print("Digite o tamanho da Diagonal Maior: ")
    var dA = readln().toDouble()

    print("Digite o tamanho da Diagonal Menor: ")
    var dB = readln().toDouble()
    while (dB > dA){
        print("Numero invalido!\nDigite o tamanho da Base Menor: ")
        dB = readln().toDouble()
    }

    var area = (dA * dB) / 2

    println("O tamanho da Area é: $area ")
    println()

}
fun trapezio(){

    println("Trapezio")
    print("Digite o tamanho da Base Maior: ")
    var bA = readln().toDouble()

    print("Digite o tamanho da Base Menor: ")
    var bB = readln().toDouble()
    while (bB > bA){
        print("Numero invalido!\nDigite o tamanho da Base Menor: ")
        bB = readln().toDouble()
    }


    print("Digite a Altura: ")
    var h = readln().toDouble()

    var area = ((bA + bB) * h) / 2

    println("O tamanho da Area é: $area ")
    println()

}
fun Paralelogramo(){

    println("Paralelogramo")
    print("Digite o tamanho da Base: ")
    var base = readln().toDouble()

    print("Digite o tamanho da Altura: ")
    var altura = readln().toDouble()

    var area = base * altura

    println("O tamanho da Area é: $area ")
    println()

}
fun triangulo(){

    println("Triangulo")
    print("Digite o tamanho da Base: ")
    var base = readln().toDouble()

    print("Digite o tamanho da Altura: ")
    var altura = readln().toDouble()

    var area = base * altura / 2

    println("O tamanho da Area é: $area ")
    println()

}
fun circulo(){

    println("Circulo")
    print("Digite o tamanho do Raio: ")
    var r = readln().toDouble()

    var area = 3.14 * (r * r)

    println("O tamanho da Area é: $area ")
    println()

}
//Bizury