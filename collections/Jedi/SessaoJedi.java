package collections.Jedi;
import java.util.ArrayList;

public class SessaoJedi {
    String nome;
    TreinadorJedi treinador;
    ArrayList<IniciadoJedi> iniciados = new ArrayList<IniciadoJedi>();

    SessaoJedi(String nome, TreinadorJedi treinador){
        this.treinador = treinador;
        this.nome = nome;
    }

    
    
    public void addIniciado(IniciadoJedi iniciado){
        if(iniciados.indexOf(iniciado.nome) == -1){
            iniciados.add(iniciado);
        }
    }

    public IniciadoJedi getIniciado(String nome){
        IniciadoJedi var = null;
        for(IniciadoJedi iniciado: iniciados){
            if(iniciado.nome.equalsIgnoreCase(nome)){
                var = iniciado;
            }
        }
        return var;
    }

    public double getMediaAnoNascimento(){
        double media = 0;
        int soma = 0;
         for(IniciadoJedi iniciado: iniciados){
            soma += iniciado.anoNascimento;
         }
         media = (double)soma / (double)iniciados.size();
         return media;
    }

    public String getDescricao(){
        String descIniciado = "";
        int indice = 0;
        for(IniciadoJedi iniciado: iniciados){
            indice++;
            descIniciado +="  - Iniciado "+ indice + ": " + iniciado.getDescricao() + "\n";
         }
        return "--> SESSÃO " + nome + " (Treinador: " + treinador.getDescricao() + ")" + "\n" + descIniciado;

    }
}
