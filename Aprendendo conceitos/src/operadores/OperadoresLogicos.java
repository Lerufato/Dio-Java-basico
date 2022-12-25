package operadores;

public class OperadoresLogicos {
    public static void main(String args[]) {
    /*Operadores lógicos é o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões. 
    Tem as seguintes representações:
    &&  Operador Lógico "E"
    || Operador Lógico "OU" */

        boolean condicao1=true;

        boolean condicao2=false;

            if(condicao1 && condicao2){
            System.out.println("Os dois valores são verdadeiros");
            }

            if(condicao1 || condicao2){            
            System.out.println("Um dos valores é verdadeiro ");
            }

        condicao2 = true;

            if(condicao1 && condicao2){                
            System.out.println("Os dois valores são verdadeiros ");
            }
            
            if(condicao1 || condicao2){
            
            System.out.println("Um dos valores é verdadeiro ");
            }
    }
}
