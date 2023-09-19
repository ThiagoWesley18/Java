package br.edu.ufam.icomp.lab_excecoes;

public class TamanhoMaximoExcedidoException extends RoverCaminhoException {
    public TamanhoMaximoExcedidoException(){
        this("Quantidade máxima de coordenadas excedida");
    }
    public TamanhoMaximoExcedidoException(String string){
        super(string);
    }

    public String getMessage(){
        return "Quantidade máxima de coordenadas excedida";
    }
}
