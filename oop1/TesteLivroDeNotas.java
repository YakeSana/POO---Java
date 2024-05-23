public class TesteLivroDeNotas{
    public static void main(String[] args) {
        var meuLivro = new LivroDeNotas("Poo");
        meuLivro.nomeDisciplina = "POO";
        meuLivro.recepcionarUsuario();
        var meuLivro2 = new LivroDeNotas("Moo");
        meuLivro2.nomeDisciplina ="MOO";
        meuLivro2.recepcionarUsuario();
    } 
}