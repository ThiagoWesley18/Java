package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
    public static void main(String[] args) {
        Celular celular1 = new Celular(1,10,10000000);
        Celular celular2 = new Celular(1,9,10000001);
        CarroLuxuoso carro1 = new CarroLuxuoso("ABC123");
        CarroLuxuoso carro2 = new CarroLuxuoso("DEF456");
        
        Localizavel[] vetorLocalizaveis = {celular1,celular2,carro1,carro2};

        for(int i = 0; i < vetorLocalizaveis.length; i++){
            System.out.println(vetorLocalizaveis[i].getPosicao());
        }
    }
}
