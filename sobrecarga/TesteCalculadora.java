public class TesteCalculadora {
    public static void main(String[] args) {
        var calc = new Calculadora();
        calc.somar(1,2);
        calc.somar(1.1f,2.3f);
        calc.somar("2","3");
        calc.somar("2",5);
        calc.somar(5,"2");
        calc.somar(1,2,3);
        
    }
}
