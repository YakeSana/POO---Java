public class Pessoa {
    private String nome;
    private int idade;
    

    public Pessoa(String nome,int idade){
        this.idade= idade;
        this.nome = nome;
        //this(nome);
        //this.idade = idade;
    }

    public Pessoa(String nome){
        //this.nome = nome;
        this(nome,0);
    }

    public Pessoa(int idade){
        this(null,idade);
    }

    public Pessoa(){
        
    }


    //construtor padrão(lista de parametros vazio)
    //public Pessoa(){
    //    System.out.println("P");
    //}
}
