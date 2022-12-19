package edu;

public class TiposVariaveis {
    /**
     * @param args
     */
    public static void main(String args[]) {
        //Toda variável é composta tipo de dados + identificação + valor atribuído
        
        //Variáveis inteiras

            int idade = 29;
            String nome = "Letícia";
            int cep = 17800000;
            long cpf = 12345678901L;

            System.out.println("Meu nome é " + nome + " e minha idade é " + idade + " anos");
            System.out.println("Meu CPF é " + cpf);
            System.out.println("Meu CEP é " + cep);

                cep = 18700000;
            
                System.out.println("O CEP do meu trabalho é " + cep);

        //Variáveis Flutuantes

            double salario = 5000.00;
            final double SALARIO_MINIMO = 4500.00; //se alterar o salario minimo dará erro

            System.out.println("Meu salário pretendido é R$" + salario + ", meu salário mínimo aceitável é R$" + SALARIO_MINIMO);
            
            salario = 6000.00;

            System.out.println("Mas o salário ideal seria R$" + salario);

        //Variáveis Booleanas

        boolean ehMaior = true;

        boolean maisVelho = false; 

        boolean irmaoMaisNovo = true;

        System.out.println("Se ehMaior é " + ehMaior + " e maisVelho é " + maisVelho + ", então, o irmão mais novo é maior? Resposta: " + irmaoMaisNovo);
    
    }    
}
