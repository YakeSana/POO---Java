import java.util.Scanner;
public class IfESuasVariacoes{
    public static void main(String[] args) {
        //inferência de tipo, existe desde o Java 10, é feito pelo compilador
        //declaração de variaveis
        var leitor = new Scanner(System.in); 
        System.out.println("Qual a nota?");
        var nota = leitor.nextDouble();
        final int VALOR_MINIMO = 0, VALOR_MAXIMO = 10;
        // if(nota >= 6){
        //     System.out.println("Aprovado");
        //     System.out.println("Gap");
        
        // }
        // else{
        //     System.out.println("Abismo, F total");
        // }
        if(nota >= VALOR_MINIMO && nota <= VALOR_MAXIMO){
            if(nota >= 9){
                System.out.println("A");
                System.out.println("Parabéns, bosta");
            }
            else if(nota >= 8){
                System.out.println("B");
            }
            else if(nota >= 7){
                System.out.println("C"); 
            }
            else{
                System.out.println("Abismo, F total");
            }
        }
        else System.out.println("Nota Inválida");

        leitor.close();
    }
}