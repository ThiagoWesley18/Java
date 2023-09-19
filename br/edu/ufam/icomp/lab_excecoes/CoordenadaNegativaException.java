package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaNegativaException extends RoverCoordenadaException{
    

    public CoordenadaNegativaException(){
        this("Coordenada com valor negativo");
    }
    public CoordenadaNegativaException(String string){
        super(string);
    }

    public String getMessage(){
        return "Coordenada com valor negativo";
    }
}
