package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main(String[] args){
        try {
            Caminho caminho = new Caminho(2);
            Coordenada c1  = new Coordenada(5, 10, 5); 
            Coordenada c2  = new Coordenada(10, 15, 5);
            
            caminho.addCoordenada(c1);
            caminho.addCoordenada(c2);
            System.out.println(caminho);
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
