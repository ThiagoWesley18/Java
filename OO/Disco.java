package OO;

public class Disco {
    String marca;
    String tipo;
    double capacidade;
    int rpm;

    Disco(){
        this(null,null,0.0,0);
    }
    Disco(String marca, String tipo, double capacidade, int rpm){
        this.marca = marca;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.rpm = rpm;
    }

    
    /** 
     * @return String
     */
    public String getDescricao(){
        return "Disco: marca="+marca+ ", tipo="+tipo+", capacidade="+capacidade+"GB" + ", rpm="+rpm+"rpm.";
    }
}
