import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        System.out.println("Digite o valor");
        int resultado = 1;
        int n = leitor.nextInt();

        for(int contador = n ; contador <= 1; contador++){
            resultado = resultado * contador; //resultado *= contador
            System.out.println(resultado);
        };


        leitor.close();
    }
    
}