package org.example;

public class Loops {
    public static void main(String[] args) {
        Principal exer = new Principal();

//////        exer.Exer01();
//////        exer.Exer02();
////        exer.Exer03();
//        exer.Exer04();
        exer.Exer05();
    }

}

class Principal{

    //Crie um loop for que imprima os números de 1 a 10.
    void Exer01(){
        int num = 11;
        for (int i = 1; i < num; i++) {
            System.out.println(i);
        }
    }

    //Implemente um loop for que conte de 0 a 100 em incrementos de 10.
    void Exer02(){
        for (int i = 0; i <= 100; i+= 10) {
            System.out.println(i);
        }
    }

    //Escreva um loop for que imprima os números pares de 2 a 20.
    void Exer03(){
        int numLimite = 21;
        for (int i = 2; i < numLimite; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    //Crie um loop for que conte de 10 a 0.
    void Exer04(){
        int numUsuario = 0;
        for (int i = 10; i >= numUsuario; i--) {
            System.out.println(i);
        }
    }

    //Implemente um loop for que calcule a soma dos números de 1 a 100.
    void Exer05(){
        int soma = 0;

        // Loop for para somar os números de 1 a 100
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        // Imprime o resultado
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }

}





/*

// FOR
Crie um loop for que imprima os números de 1 a 10.
Implemente um loop for que conte de 0 a 100 em incrementos de 10.
Escreva um loop for que imprima os números pares de 2 a 20.
Crie um loop for que conte de 10 a 0.
Implemente um loop for que calcule a soma dos números de 1 a 100.      x
Escreva um loop for que imprima os quadrados dos números de 1 a 5.
Crie um loop for que imprima os múltiplos de 3 de 3 a 30.
Implemente um loop for que conte de 1 a 100 em incrementos de 5.
Escreva um loop for que imprima os números ímpares de 1 a 15.
Crie um loop for que calcule o fatorial de um número.
Implemente um loop for que imprima os números de 10 a 1 em ordem decrescente.
Escreva um loop for que imprima a tabuada do 7.
Crie um loop for que imprima os números primos de 1 a 20.
Implemente um loop for que calcule a média de uma lista de números.
Escreva um loop for que imprima os elementos de um array de strings.
Crie um loop for que imprima os caracteres de uma string.
Implemente um loop for que percorra uma matriz bidimensional.
Escreva um loop for que encontre o maior elemento em um array de inteiros.
Crie um loop for que conte o número de vogais em uma string.
Implemente um loop for que inverta os elementos de um array.
Escreva um loop for que encontre o menor elemento em uma matriz.
Crie um loop for que imprima os números de Fibonacci até o décimo termo.
Implemente um loop for que calcule o produto de elementos em um array.
Escreva um loop for que imprima os números primos de 1 a 50.
Crie um loop for que substitua todos os elementos negativos de um array por zero.
Implemente um loop for que imprima a soma dos dígitos de um número.
Escreva um loop for que encontre o segundo maior elemento em um array.
Crie um loop for que imprima os números perfeitos de 1 a 100.
Implemente um loop for que encontre a média de cada coluna em uma matriz.
Escreva um loop for que imprima os números de Armstrong de 1 a 1000.
Crie um loop for que faça uma contagem regressiva de 10 a 1.
Implemente um loop for que imprima os números primos entre dois números dados.
Escreva um loop for que imprima a soma dos dígitos de cada número em um array.
Crie um loop for que encontre a soma dos números primos de 1 a 50.
Implemente um loop for que imprima os fatores de um número.
Escreva um loop for que conte o número de palavras em uma frase.
Crie um loop for que encontre a interseção de dois arrays.
Implemente um loop for que imprima os números de 1 a 100, mas substitua múltiplos de 3 por "Fizz" e múltiplos de 5 por "Buzz".
Escreva um loop for que calcule o número de dias em um mês, dado o mês e o ano.
Crie um loop for que imprima a sequência de Collatz para um número.

Exercícios com Loop FOREACH:
Escreva um loop foreach que imprima os elementos de uma lista de strings.
Implemente um loop foreach que calcule a soma dos elementos em um array.
Crie um loop foreach que imprima os números primos de 1 a 20.
Escreva um loop foreach que encontre o maior elemento em uma coleção de números.
Implemente um loop foreach que imprima os caracteres de uma string.
Crie um loop foreach que conte o número de vogais em uma frase.
Escreva um loop foreach que imprima os elementos de um dicionário.
Implemente um loop foreach que multiplique cada elemento em uma lista por 2.
Crie um loop foreach que encontre o segundo menor elemento em um array.
Escreva um loop foreach que imprima os elementos de uma lista de objetos.
Implemente um loop foreach que remova elementos duplicados de uma lista.
Crie um loop foreach que calcule a média dos valores em um dicionário.
Escreva um loop foreach que encontre o índice de um elemento em uma lista.
Implemente um loop foreach que remova elementos pares de uma lista de inteiros.
Crie um loop foreach que imprima os números de Fibonacci até o décimo termo.
Escreva um loop foreach que imprima os elementos de uma matriz bidimensional.
Implemente um loop foreach que encontre a soma dos dígitos de cada número em uma lista.
Crie um loop foreach que ordene uma lista de strings.
Escreva um loop foreach que concatene todos os elementos de uma lista de strings.
Implemente um loop foreach que encontre a mediana de uma lista de números.
Crie um loop foreach que filtre os números pares de uma lista.
Escreva um loop foreach que imprima os elementos de uma pilha.
Implemente um loop foreach que inverta os elementos de uma lista.
Crie um loop foreach que remova elementos de uma lista com base em uma condição.
Escreva um loop foreach que adicione um valor a cada elemento de uma lista.
Implemente um loop foreach que encontre o primeiro elemento em uma lista que satisfaça uma condição.
Crie um loop foreach que calcule a soma dos quadrados dos elementos em uma lista.
Escreva um loop foreach que adicione elementos a um conjunto.
Implemente um loop foreach que agrupe os elementos de uma lista por sua primeira letra.
Crie um loop foreach que verifique se todos os elementos de uma lista são positivos.
Escreva um loop foreach que encontre a diferença simétrica entre duas listas.
Implemente um loop foreach que remova elementos de uma lista com base em outra lista.
Crie um loop foreach que remova elementos nulos de uma lista.
Escreva um loop foreach que adicione um elemento antes de cada elemento em uma lista.
Implemente um loop foreach que verifique se uma lista está ordenada.
Crie um loop foreach que encontre a moda de uma lista de números.
Escreva um loop foreach que remova elementos repetidos de uma lista.
Implemente um loop foreach que some os valores de cada chave em um dicionário.
Crie um loop foreach que converta uma lista de strings para maiúsculas.
Escreva um loop foreach que faça a transposição de uma matriz bidimensional.

*/

// Palavras-chave associadas ao for e foreach em Java:

//for: Palavra-chave principal para iniciar a estrutura de loop for.
//while: Palavra-chave para iniciar a estrutura de loop while.
//do: Palavra-chave para iniciar a estrutura de loop do-while.
//break: Utilizado para interromper a execução de um loop.
//continue: Utilizado para pular a iteração atual e ir para a próxima no loop.
//for-each ou enhanced for: Sintaxe específica para percorrer elementos em um array ou Iterable sem a necessidade de um índice explícito.
//: (dois pontos): Usado na sintaxe do for-each para separar a variável de iteração da coleção.
//int i: Exemplo de declaração de variável de controle em um loop for.
//array.length: Método para obter o comprimento de um array.
//List e ArrayList: Estruturas de dados frequentemente usadas em conjunto com loops para armazenar e manipular conjuntos de elementos.
//Iterator: Interface usada para percorrer coleções.
//Iterable: Interface que representa uma coleção de elementos que podem ser iterados.
//Map: Interface usada para representar coleções chave-valor.
//entrySet(): Método frequentemente usado ao iterar sobre um Map para obter um conjunto de entradas.
//Set: Interface usada para representar conjuntos de elementos únicos.
//length(): Método usado para obter o tamanho de uma string ou coleção.
//charAt(): Método para obter o caractere em uma posição específica em uma string.