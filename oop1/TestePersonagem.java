public class TestePersonagem{
    public static void main(String[] args) {
        //1.Construir personagem usando operador de inferência de tipo 
        var p = new Personagem();
        //2. Fazer o personagem agir
        p.atacar(2);
        p.cacar();
        p.comer();
        p.dormir();
    }
}