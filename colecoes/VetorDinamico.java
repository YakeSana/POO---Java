//generics/ polimorfismo parametrico



public class VetorDinamico <Tipo>{
    //espaco para guardar elementos
    private Tipo [] elementos;

    //quantidade
    private int qtde;

    //limite
    private int cap;

    //construtor, executa quando 'new' é chamado 
    public VetorDinamico(){
        qtde = 0;
        cap = 4;
        elementos = (Tipo[]) new Object[cap];
    }

    public void adicionar(Tipo e){
        if(estaCheio()){
            redimensionar();
        }
        elementos[qtde] = e;
        qtde++;
    }

    //metodo que decide se o vetor esta vazio
    public boolean estaVazio(){
        return qtde == 0;
    }

    public boolean estaCheio(){
        return qtde == cap;
    }

    private void redimensionar(){
        //dobrar a capacidade
        cap = cap *2;
        //alocar um vetor de ints com essa nova capacidade
        Tipo [] aux =(Tipo[]) new Object[cap];
        //fazer um for para copiar todo mundo de elementos para aux
        for(int i = 0; i < qtde; i++){
            aux[i] = elementos[i];
        }
        //ajustar elementos para que ele aponte pante para o vetor apontado por aux
        elementos = aux;
    }

    public String toString(){
        var sb = new StringBuilder("");
        sb.append("Qtde: ").append(qtde).append("\n");
        sb.append("Capacidade: ").append(cap).append("\n");
        if(!estaVazio()){
            sb.append("Itens: ");
            //for each
            for(Tipo e: elementos){
                sb.append(e).append(" ");
            }
        }
        return sb.toString();
    }


}