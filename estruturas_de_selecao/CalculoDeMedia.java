import javax.swing.JOptionPane;

public class CalculoDeMedia {
    public static void main(String[] args) {
        //while
        // Ctrl + , / Wrap on / Inlay hints
        int numeroAlunos = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de alunos."));
        //while (contador <= numeroAlunos ) {
        for( int contador = 1; contador <= numeroAlunos; contador = contador + 1){
            
            var nota1 = Double.parseDouble(
                JOptionPane.showInputDialog("Prof, Digite a nota 1")
                );
            var nota2 = Double.parseDouble(
                JOptionPane.showInputDialog("Prof, Digite a nota 2")
                );
            var resultado = (nota1 + nota2)/2;
            if(resultado >= 6){
                JOptionPane.showMessageDialog(
                null, "A média das notas do " +contador+"º aluno é "+resultado+", Aprovado");
            }
            else {
                JOptionPane.showMessageDialog(
                null, "A média das notas do " +contador+"º aluno é "+resultado+", Reprovado");
            };
        }
            //contador++; // contador = contador + 1  
        //}
        
    }
    
}