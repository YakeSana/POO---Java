public class Personagem{
    //4 partes: tipo retorno, nome, a lista de parâmetros e o corpo
    void cacar(){
        System.out.println("Caçando...");
    }

    void comer(){
        System.out.println("Comendo...");

    }

    void dormir(){
        System.out.println("Dormindo...");
    }

    void atacar(int forca){
        System.out.printf("Atacando com %d de força", forca);
    }
}