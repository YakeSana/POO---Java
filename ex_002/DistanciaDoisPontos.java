import java.util.*;
public class DistanciaDoisPontos {
    public static void main(String... args){
        //declaraçao de variaveis
        float pontox1,pontoy1,pontox2,pontoy2;
        float resultado;
        Scanner leitor = new Scanner(System.in);

        //entrada
        System.out.println("Digite o valor de x1");
        pontox1 = leitor.nextFloat();

        System.out.println("Digite o valor de y1");
        pontoy1 = leitor.nextFloat();

        System.out.println("Digite o valor de x2");
        pontox2 = leitor.nextFloat();

        System.out.println("Digite o valor de y2");
        pontoy2 = leitor.nextFloat();

        //processamento
        resultado = (float) Math.sqrt((pontox2 - pontox1)*(pontox2 - pontox1) + Math.pow(pontoy2 - pontoy1, 2));
        

        //saida
        System.out.println("A distância entre p1("+pontox1+", "+pontoy1+") e p2(" +pontox2+", "+pontoy2+") é:"+ resultado);
        System.out.printf(
            "A distância entre p1(%.1f,%.1f) e p2(%.1f,%.1f) é:%.1f",
            pontox1,pontoy1,pontox2,pontoy2,resultado
        );
    } 
}