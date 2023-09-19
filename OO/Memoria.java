package OO;

public class Memoria{
    String marca;
    String tipo;
    double tamanho;
    double velocidade;
    int numPentes;

    Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes){
        this.marca = marca;
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.numPentes = numPentes;
        this.tamanho = tamanho;

    }
    Memoria(){
        this(null,null,0.0,0.0,0);
    }

    
    /** 
     * @return double
     */
    public double getTamanhoTotal(){
        return this.tamanho * this.numPentes;
    }
    public double getVelocidadeParalela(){
        return this.velocidade * this.numPentes;
    }
    public String getDescricao(){
        return "Memoria: marca=" + marca + ", tipo=" + tipo + ", tamanho="+ tamanho + "GB" +", velocidade=" +velocidade+"GHz"+ ", numPentes=" +numPentes+ ", tamanhoTotal="+getTamanhoTotal()+"GB" +", velocidadeParalela=" + getVelocidadeParalela()+"GHz.";
    }
}
