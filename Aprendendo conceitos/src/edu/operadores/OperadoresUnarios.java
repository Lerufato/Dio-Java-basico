package edu.operadores;

public class OperadoresUnarios {
    public static void main(String args[]) {
    /*Operadores unários são aplicados junto com um outro operador aritmético para fazer trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.
    (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
    (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
    (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
    (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
    (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.*/

    //Inverter valores
    
        int numero = 5;
		
        System.out.println(- numero); //Imprimindo o numero negativo
        System.out.println(numero); //Número continua positivo, para transformar em negativo, tem que atribuir

        numero = -numero;

        System.out.println(numero); //Número foi invertido

    //Incrementar o número em mais 1 número

        numero ++;

        System.out.println(numero); //Número recebeu 1, então fica -4

        System.out.println(++ numero); //Dessa forma também há incremento do numero

        System.out.println(numero); //Número recebeu 1, então fica -3

        System.out.println(-- numero); //Decrementar em 1 o número, assim volta a ser -4

        System.out.println(numero ++); //Não vai imprimir o incremento, pois está depois de numero, porém houve o incremento

        System.out.println(numero); //Número foi incrementado, fica -3


    //Negar uma expressão booleana

        boolean verdadeiro = true;

        System.out.println(!verdadeiro); //Imprime o valor invertido, porém não muda a variável booleana

        System.out.println(verdadeiro); //Variavel continua sendo true

        verdadeiro = !verdadeiro;

        System.out.println(verdadeiro); //Agora sim a variável foi invertida, passando a ser false

    }
    
}