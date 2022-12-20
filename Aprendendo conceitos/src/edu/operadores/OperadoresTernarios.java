package edu.operadores;

public class OperadoresTernarios {
    public static void main(String args[]) {
    /*Operador de condição ternária serve para escolher um dentre dois ou mais valores
    É representado pelos símbolos "?" e ":"  
    Utilizado na seguinte estrutura de sintaxe: 
    <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>*/
    
    int a, b;

        a = 5;
        b = 6;

    String resultado = (a==b) ? "true" : "false";

    System.out.println(resultado);

      // Mesmo exemplo utilizando IF/ELSE

    if(a==b)
        resultado = "verdadeiro";
    else
        resultado = "falso";

    System.out.println(resultado);

    //Exemplo igualando os valores das variáveis
        
        a = 6;
        b = 6;
        
        String resultado1 = (a==b) ? "true" : "false";

        System.out.println(resultado1);

        int resultado2 = (a==b) ? 1 : 0; //usando variável int, ou seja, retorna a condição em termos de número

        System.out.println(resultado2);  


    }
    
}
