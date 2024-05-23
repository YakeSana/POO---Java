//import java.util.Scanner;
public class PodeDirigir {
    public static void main(String[] args) {
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        var idade = leitor.nextShort();
        // if (idade >= 18)
        //     System.out.println("Parabéns, você pode dirigir");
        // else
        //     System.out.println("Evita Dog");
        System.out.println(idade >= 18 ? "Sim" : "Evita Dog");


        leitor.close();
    }
    
}
