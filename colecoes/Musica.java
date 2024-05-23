import java.util.*;
public class Musica {
    private String titulo;
    private List <Integer> avaliacoes;

    public Musica(){
        avaliacoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Integer> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Integer> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean equals(Object o){
        //downcasting
        Musica m = (Musica) o;
        return this.titulo.equals(m.getTitulo());
    }

    public String toString(){
        var sb = new StringBuilder("");
        sb.append("Título: ").append(titulo).append("\n");
        if(!avaliacoes.isEmpty()){
            sb.append("Histórico de avaliações: ").append("\n");
            for(var avaliacao: avaliacoes){
                sb.append(avaliacao).append("");
            
            }
        }
        return sb.toString();
    }
}
