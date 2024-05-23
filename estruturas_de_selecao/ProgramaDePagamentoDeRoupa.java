import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Byte.parseByte;
import static javax.swing.JOptionPane.showMessageDialog;

public class ProgramaDePagamentoDeRoupa {
    public static void main(String[] args) {
        // declaracao de variaveis
        double valor;
        byte opcao;

        // entrada
        valor = parseDouble(showInputDialog("Digite o valor"));
        opcao = parseByte(showInputDialog("0-A vista \n1-Cartao \n2-Crediario"));
        // processamento
        // saida
        switch (opcao) {
            case 0: {
                showMessageDialog(null, "Valor a vista: " + valor * 0.9);
                break;
            }
            case 1: {
                byte parcelas = parseByte(showInputDialog("Número de Parcelas: "));
                showMessageDialog(null, "Valor da parcela: " + valor / parcelas);
                break;
            }
            case 2: {
                byte parcelas = parseByte(showInputDialog("Número de Parcelas: "));
                showMessageDialog(null, "Valor da parcela: " + valor * 1.1 / parcelas);
                break;
            }
            default: {
                showMessageDialog(null, "Insira um valor válido");
                break;
            }

        }

    }
}