package collections.Ensalamento;

public class Sala {
    int bloco;
    int sala;
    int capacidade;
    boolean acessivel;

    Sala(){
        this(0, 0, 0, false);
    }

    Sala(int bloco, int sala, int capacidade, boolean acessivel){
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }
    
    public String getDescricao(){
        String acesso;
        if(acessivel == true){
            acesso = "acessível";
        }else{
            acesso = "não acessível";
        }
        return "Bloco "+ bloco +", Sala " + sala + " (" + capacidade +" lugares, "+ acesso + ")";
    }
}
