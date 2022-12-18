package edu.Letícia.anatomiadeclasses;
public class ConcatenarNomes {
    
public static void main (String [] args) {
 
    String firstName = "Letícia";
    String lastName = "Rufato";

    String completedName = completedName(firstName, lastName);
    System.out.println(completedName);

}

public static String completedName (String firstName, String lastName) {
    return "Resultado do método: " + firstName.concat(" ").concat(lastName);
}  

}
