package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
    private int posX, posY, digito;

    public Coordenada(int posX, int posY, int digito)throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException{

        if( (posX < 0) || (posY < 0) ) throw new CoordenadaNegativaException();

        if (posX >= 30000 ){
            throw new CoordenadaForaDosLimitesException();
        }else if ( posY >= 30000 ){
            throw new CoordenadaForaDosLimitesException();
        } 
        
        if( ((posX + posY) % 10) != digito ) throw new DigitoInvalidoException();
        if ( (digito < 0) && (digito > 9) ) throw new DigitoInvalidoException();

        this.posX = posX;
        this.posY = posY;
        this.digito = digito;
    }

    public int getPosX(){
        return posX;
    }
    public int getPosY(){
        return posY;
    }

    public double distancia(Coordenada coordenada){
        return Math.sqrt(Math.pow(this.posX - coordenada.getPosX(),2) + Math.pow(this.posY - coordenada.getPosY(),2));
    }

    public String toString(){
        return posX + ", " + posY;
    }
}
