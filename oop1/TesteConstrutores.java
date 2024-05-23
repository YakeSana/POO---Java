public class TesteConstrutores {
    public static void main(String[] args) {
        var livro = new LivroDeNotas("POO");
        livro.nomeDisciplina = "POO";
        livro.recepcionarUsuario();
        LivroDeNotas.exibirAno("POO");
    }
}
