package terminaleargumentos;


public class Argumentos {
    /*Quando executamos uma classe, que contenha o método main, 
    o mesmo permite que passemos um array [] de argumentos, do tipo String. */
    public static void main(String[] args) {
        //os argumentos (arrays) começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " m ");
    }
    /*
    No Prompt de comando:
    C:\Workspace\Java\Dio-Project-Java-basico\Aprendendo-conceitos\bin>java Argumentos Leticia Rufato 29 1.74
    Ola, me chamo Leticia Rufato
    Tenho 29 anos
    Minha altura é 1.74 m 
    */
    
    /*
    Outra forma é usando a própria IDE:
    Abrir "run", "adicionar configurações"
    Abrirá um arquivo .jason
    Adicionar as informações como args 
         "args": [
                "Leticia",
                "Rufato",
                "29",
                "1.74"
            ] 
    E por fim executar no arquivo Java
    */
}
