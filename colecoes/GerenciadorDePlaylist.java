import java.util.*;

import javax.swing.JOptionPane;
public class GerenciadorDePlaylist {
    public static void main(String[] args) {
        
        List <Musica> musicas = new ArrayList<>();
        String menu = "0-Sair\n1-Cadastrar\n2-Avaliar\n3-Listar";
        int op;
        do{
            op = Integer.parseInt(
                JOptionPane.showInputDialog(menu)
            );
            switch(op){
                case(1):{
                    var entrada = JOptionPane.showInputDialog(null,"Insira o título da música");
                    Musica mus = new Musica();
                    mus.setTitulo(entrada);

                    if(!musicas.contains(mus)){
                        musicas.add(mus);
                        JOptionPane.showMessageDialog(null,"Música adicionada com sucesso.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Música já existe.");
                    }
                    break;
                }

                case(2):{
                    var titulo = JOptionPane.showInputDialog("");
                    Musica musica = new Musica();
                    musica.setTitulo(titulo);
                    var indice = musicas.indexOf(musica);
                    int avaliacao;
                    if(indice>=0){
                        do{
                            avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Avalie a música."));     
                        }while(avaliacao<1||avaliacao>5);
                        musicas.get(indice).getAvaliacoes().add(avaliacao);
                        JOptionPane.showMessageDialog(null,"Avaliação Salva." );
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Música não existe.");
                    }
                    break;

                }

                case(3):{
                    if(!musicas.isEmpty()){
                        var sb = new StringBuilder("");
                        for (var musica:musicas){
                            sb.append(musica)
                            .append("\n")
                            .append("---------")
                            .append("\n");
                        }
                    }
                }


            }
            
    
    
        }while(op != 0);
    }
}
