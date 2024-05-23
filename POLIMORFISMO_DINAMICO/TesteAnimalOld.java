public class TesteAnimalOld {
    public static void main(String[] args) {
        AnimalOld cachorro = new AnimalOld("Garfield", 1);
        AnimalOld gato = new AnimalOld("BrTits", 0);
        AnimalOld lagartixa = new AnimalOld("Bonnie",2);
        cachorro.fazerBarulho();
        gato.fazerBarulho();
        lagartixa.fazerBarulho();
    }
}
