package operadores;

public class OperadoresRelacionais {
    public static void main(String args[]) {
    
    /*Operadores relacionais avalian a relação entre duas ou mais variáreis ou expressões. Retorna-se um valor booleano
    == Quando desejamos verificar se uma variável é IGUAL A outra.
    != Quando desejamos verificar se uma variável é DIFERENTE da outra.
    > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
    >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
    < Quando desejamos verificar se uma variável é MENOR QUE outra.
    <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra. */

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

            System.out.println("número um é igual a número 2? " + simNao);

            simNao = numero1 != numero2;

            System.out.println("número um é diferente de número 2? " + simNao);
            
            simNao = numero1 > numero2;

            System.out.println("número um é maior que número 2? " + simNao);

            simNao = numero1 >= numero2;

            System.out.println("número um é maior ou igual a número 2? " + simNao);

            simNao = numero1 < numero2;

            System.out.println("número um é menor que número 2? " + simNao);

            simNao = numero1 <= numero2;

            System.out.println("número um é menor ou igual a número 2? " + simNao);

        if(numero1 < numero2) //se a expressão é verdadeira, a mensagem será impressa, caso contrário nada acontece
            System.out.println("número 1 é o menor");

        if(numero1 == numero2)
            System.out.println("os números são iguais");
        
        if(numero1 > numero2)
            System.out.println("número 1 é o maior");

    //Textos

    String nome1 = "Letícia";
    String nome2 = "Maria";

    System.out.println(nome1.equals(nome2)); //para texto recomenda-se o uso do equals

    nome2 = "Letícia";

    System.out.println(nome1.equals(nome2));

    }
}
