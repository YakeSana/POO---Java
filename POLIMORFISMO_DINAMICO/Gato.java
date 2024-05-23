public class Gato extends Animal {

    public Gato(String nome){
        super(nome);

    }

    @Override // Checha se o metodo a seguir é uma sobreposição válida
    public void fazerBarulho(){
        System.out.println("Miau");
    }
}
