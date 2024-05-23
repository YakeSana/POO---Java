import java.util.ArrayList;
import java.util.List;

public class TesteAnimal {
    public static void main(String[] args) {
        //variáveis polimorficas
        Animal g = new Gato("Coturno");
        Animal a1 = new Gato("Garufirudo");
        Animal a2 = new Cachorro("Buh?");
        Animal a3 = new Lagartixa("Bone");
        
        g.fazerBarulho();
        a1.fazerBarulho();
        a2.fazerBarulho();
        a3.fazerBarulho();
        
        List<Animal> animais = new ArrayList<>();
        animais.add(g);
        animais.add(a1);
        animais.add(a2);
        animais.add(a3);
        animais.add(new Ganso("Fidipu"));

        for(Animal animal:animais){
            animal.fazerBarulho();
        }
    }
    
}
