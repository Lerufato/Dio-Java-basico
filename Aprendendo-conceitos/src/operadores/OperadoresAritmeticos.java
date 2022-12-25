package operadores;

public class OperadoresAritmeticos {

    public static void main(String args[]) {
    
        //Operadores de atribuição - Representado pelo símbolo de igualdade "="
        //Operadores aritiméticos - adição "+",subtração "-",multiplicação "*", divisão "/" e módulo (resto da divisão) "%"
        
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 19 % 3;
        double resultado = (10 * 7) + (20/4);

        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subtração);
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);
        System.out.println("O resto da divisão é: " + modulo);
        System.out.println("O resultado da junção é: " + resultado);
        

        //Concatenação - quando utiliza "+" com textos, é uma concatenação

        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
}
}
