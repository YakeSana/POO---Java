public class AnimalOld {
    private String nome;
    private int tipo;
    public AnimalOld(String nome,int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    
    //1:gato
    //2:cachorro
    //3:lagartixa
    public void fazerBarulho(){
        if (tipo==1)
            System.out.println("Miau");
        else if(tipo == 2)
            System.out.println("WanWan");
        else if(tipo == 3)
            System.out.println("TssSss");
    }
}

