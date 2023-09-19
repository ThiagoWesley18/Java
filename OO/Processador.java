package OO;

public class Processador {
        String marca;
        String modelo;
        double velocidade;
        int numNucleos;

        Processador(String marca, String modelo, double velocidade, int numNucleos){
            this.marca = marca;
            this.modelo = modelo;
            this.velocidade = velocidade;
            this.numNucleos = numNucleos;

        }
        Processador(){
            this(null,null,0.0,0);
        }

        
        /** 
         * @return double
         */
        public double getVelocidadeParalela(){
            return this.velocidade * this.numNucleos;
        }
        public String getDescricao(){
            return "Processador: marca=" + marca + ", modelo=" + modelo + ", velocidade=" +velocidade+"GHz,"+ "numNucleos=" +numNucleos+ ", velocidadeParalela=" + getVelocidadeParalela()+"GHz.";
        }

}


