package edu.metodos;

public class metodos {
    
        /*Todas as ações das aplicações são consideradas métodos.
        Uma classe é definida por atributos e métodos. 
        Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. 
        Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes. 
        Deve ser nomeado como verbo;
        Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).
        */
    
    public double somar(int num1, int num2){
            //LOGICA - FINALIDADE DO MÉTODO

            num1 = 1;
            num2 = 3;

            return (num1 + num2);
        
        }
        
        public void imprimir(String texto){
            //LOGICA - FINALIDADE DO MÉTODO
            //VOID NÃO PRECISA DO RETURN
            //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
        }
        // throws Exception : indica que o método ao ser utilizado
        // poderá gerar uma exceção
        public double dividir(int dividendo, int divisor) throws Exception{

            dividendo = 10;
            divisor = 2;

            return (dividendo / divisor);
        }

        public double dividir(double dividendo1, double divisor1) throws Exception {
            if(divisor1 == 0) {
              throw new Exception("Nao e permitido fazer uma divisao por zero!");
            }
                dividendo1 = 12;
                divisor1 = 0;
        
            return (dividendo1 / divisor1);
        }
        
    }
    

