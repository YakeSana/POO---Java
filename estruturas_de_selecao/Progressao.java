import javax.swing.JOptionPane;

public class Progressao {
    public static void main(String[] args) {
        
        var n = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));
        for(var fat = n; fat >= 1;fat--){
           fat = fat * n;
           double e = 1/fat;

            System.out.println(e);
        };
        
    }
}
