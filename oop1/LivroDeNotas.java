public class LivroDeNotas{
    String nomeDisciplina;
    void recepcionarUsuario(){
        System.out.println("Bem vindo ao livro de notas de "+ nomeDisciplina+".");
    }
    static int ano = 2024;
    //construtor
    
    
    LivroDeNotas(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        System.out.println("Construindo o livro de "+nomeDisciplina);
    }

    //metodo de classe
    static void exibirAno(String nomeDisciplina){
        System.out.println(ano);
        System.out.println(nomeDisciplina);
    }
}