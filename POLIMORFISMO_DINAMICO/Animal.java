//classe abstract não pode ser instanciada diretamente, pode ser apenas refernciada
public abstract class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }
    //metodo abstract obriga suas classes filhas a implementarem o metodo
    public abstract void fazerBarulho();
}
