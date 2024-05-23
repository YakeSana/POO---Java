import javax.swing.JOptionPane;
import java.util.Scanner;
public class CalculoSalarioFuncionario {
    public static void main(String[] args) {
        //1.pedir o número de funcionários
        // var funcionarios = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de funcionários:"));
        // double salario_min = 450;
        //2.fazer um for que executa n vezes
        // for(int i = 1; i<=funcionarios; i++){ 
        //     var horas_trabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de horas trabalhadas:"));
        //     do{
        //         String categoria = JOptionPane.showInputDialog("Insira sua categoria(G ou O): ");
        //         do{
        //             String turno = JOptionPane.showInputDialog("Insira sua categoria(M, V ou N): ");
        //             do {
        //                 System.out.println(turno +"|" +categoria);
        //             } while (turno == "M" || turno =="V" || turno=="N");
        //         }while(categoria == "O"||categoria == "G");
        //     }while(horas_trabalhadas>0);
        // };

        //3. Pegar numero de horas trabalhadas(validar com do while .ter que ser maior que zero)
            //turno(validar com do while)
            //pegar categoria (validar do/while)
        
        //4.Mostrar o valor da hora trabalhar de acordo com a tabela
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de funcionários: ");
        var funcionarios = leitor.nextInt();

        leitor.nextLine();
        System.out.println("Digite sua categoria: ");
        var categoria = leitor.nextLine();
    }
}
