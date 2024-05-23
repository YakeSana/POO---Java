import javax.swing.JOptionPane;
public class SomaDeDoisNumeros {
    public static void main(String args []){

        //declaração de variáveis
        double num1;
        double num2;
        double res;

        //entrada
        //classe empacotadora(wrapper)
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        
        
        //processamento
        res = num1 + num2;
        //saida
        JOptionPane.showMessageDialog(null, res);
    }
}