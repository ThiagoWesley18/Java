package collections.Jedi;


public class IniciadoJedi {
    String nome;
    String especie;
    int anoNascimento;

    IniciadoJedi(){
        this(null,null,0);
    }

    IniciadoJedi(String nome, String especie, int anoNascimento){
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }

    
    public String getAnoNascimento(){
        if(anoNascimento < 0){
            return (anoNascimento*-1) + " ABY";
        }else{
            return anoNascimento + " DBY"; 
        }
    }

    public String getDescricao(){
        return nome + " (especie="+ especie+ ", nascimento="+getAnoNascimento()+")";
    }
}
