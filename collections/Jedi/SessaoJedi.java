package collections.Jedi; // NOSONAR
import java.util.ArrayList;

public class SessaoJedi { // NOSONAR
    String nome; // NOSONAR
    TreinadorJedi treinador; // NOSONAR
    ArrayList<IniciadoJedi> iniciados = new ArrayList<IniciadoJedi>(); // NOSONAR

    SessaoJedi(String nome, TreinadorJedi treinador) { // NOSONAR
        this.treinador = treinador; // NOSONAR
        this.nome = nome; // NOSONAR
    }

    public void addIniciado(IniciadoJedi iniciado) { // NOSONAR
        boolean exists = false;
        for (IniciadoJedi i : iniciados) {
            if (i.nome.equals(iniciado.nome)) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            iniciados.add(iniciado); // NOSONAR
        }
    }

    public IniciadoJedi getIniciado(String nome) { // NOSONAR
        IniciadoJedi var = null;
        for (IniciadoJedi iniciado : iniciados) { // NOSONAR
            if (iniciado.nome.equalsIgnoreCase(nome)) { // NOSONAR
                var = iniciado; // NOSONAR
            }
        }
        return var;
    }

    public double getMediaAnoNascimento() { // NOSONAR
        double media = 0;
        int soma = 0;
        for (IniciadoJedi iniciado : iniciados) { // NOSONAR
            soma += iniciado.anoNascimento; // NOSONAR
        }
        media = (double) soma / (double) iniciados.size(); // NOSONAR
        return media;
    }

    public String getDescricao() { // NOSONAR
        String descIniciado = "";
        int indice = 0; // NOSONAR
        for (IniciadoJedi iniciado : iniciados) { // NOSONAR
            indice++; // NOSONAR
            descIniciado += "  - Iniciado " + indice + ": " + iniciado.getDescricao() + "\n"; // NOSONAR
        }
        return "--> SESSÃO " + nome + " (Treinador: " + treinador.getDescricao() + ")" + "\n" + descIniciado; // NOSONAR
    }
}
