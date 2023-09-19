package br.edu.ufam.icomp.lab_excecoes;

public class DistanciaEntrePontosExcedidaException extends RoverCaminhoException {
    public DistanciaEntrePontosExcedidaException(){
        this("Distância máxima entre duas coordenadas vizinhas excedida");
    }
    public DistanciaEntrePontosExcedidaException(String string){
        super(string);
    }

    public String getMessage(){
        return "Distância máxima entre duas coordenadas vizinhas excedida";
    }
}
