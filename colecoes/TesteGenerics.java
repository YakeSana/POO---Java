public class TesteGenerics {
    public static void main(String[] args) {
        VetorDinamico<String> v1 = new VetorDinamico<>();
        v1.adicionar("Xesque");
        //v1.adicionar(2);
        VetorDinamico<Integer> v2 = new VetorDinamico<>();
        v2.adicionar(4);
        //v2.adicionar("aaa");
        VetorDinamico<Double> v3 = new VetorDinamico<>();
        v3.adicionar(4.6);
    }
}
