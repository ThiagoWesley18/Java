package threads;

import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
   private Hashtable<String, LinkedList<String>> tabela;

    public ListaInvertida(){
        tabela = new Hashtable<>();
    }

    public boolean insere(String palavra, String documento){
        LinkedList<String> lista;
        if (tabela.get(palavra) == null){
            lista = new LinkedList<>();
            lista.addLast(documento);
            tabela.put(palavra,lista);
            return true;
        }else{
            lista = tabela.get(palavra);
            if (lista != null){
                if(lista.contains(documento) == false){
                    lista.addLast(documento);
                    tabela.put(palavra,lista);
                    return true;
                }else
                    return false;
            }else
                return false;
        }
    }

    public LinkedList<String> busca(String palavra){
        return tabela.get(palavra);
    }
    public String toString(){
        return tabela.toString();
    }
}
