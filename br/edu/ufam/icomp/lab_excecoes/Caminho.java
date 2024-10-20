package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
    private Coordenada[] caminho;
    private int tamanho;

    public Caminho(int maxTam){
        this.tamanho = maxTam;
        caminho = new Coordenada[maxTam];
    }

    public int tamanho(){
        int cont = 0;
        for (Coordenada coordenada : caminho) {
            if(coordenada != null) cont++;
        }
        return cont;
    }

    public void addCoordenada(Coordenada coordenada)throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException{
        if(tamanho() == tamanho) throw new TamanhoMaximoExcedidoException();
        
        if(tamanho() == 0){
            caminho[0] = coordenada;
        }else{ 
            if( caminho[tamanho()-1].distancia(coordenada) > 15) throw new DistanciaEntrePontosExcedidaException();
            caminho[tamanho()] = coordenada;
        }
    }

    public void reset(){
        for (int i = 0; i < caminho.length; i++) {
            caminho[i] = null;
        }
        tamanho = 0;
    }

    public String toString(){
        StringBuilder pontos = new StringBuilder(String.format("Dados do caminho:\n  - Quantidade de pontos: %d\n", tamanho()));
        pontos.append("  - Pontos:\n");
        if (tamanho() != 0) {
            for (int i=0; i<tamanho(); i++) {
                pontos.append(String.format("    -> %s\n", caminho[i].toString()));
            }
        }
        return pontos.toString();
    }
}
