package threads;

public class GoogleMain extends Thread{
    String palavra = null;
    ListaInvertida lista;

    public GoogleMain(ListaInvertida lista){
        this.lista = lista;
        this.start();
    }
    public GoogleMain(String palavra , ListaInvertida lista){
        this.palavra = palavra;
        this.lista = lista;
        this.start();
    } 

    public void run(){
        if(palavra != null){
            System.out.println(lista.busca(palavra));
        }else{
            System.out.println(lista.toString());
        }
    }

    public static void main(String[] args) {
        ListaInvertida lista = new ListaInvertida();
        

        lista.insere("force", "document1.txt");
        lista.insere("force", "document2.txt");
        lista.insere("force", "document3.txt");
        lista.insere("always", "document1.txt");
        lista.insere("one", "document3.txt");
        lista.insere("is", "document2.txt");
        lista.insere("is", "document3.txt");
        lista.insere("be", "document1.txt");
        lista.insere("will", "document1.txt");
        lista.insere("you", "document1.txt");
        lista.insere("you", "document2.txt");
        lista.insere("the", "document1.txt");
        lista.insere("the", "document2.txt");
        lista.insere("the", "document3.txt");
        lista.insere("remember", "document1.txt");
        lista.insere("this", "document3.txt");
        lista.insere("strong", "document2.txt");
        lista.insere("strong", "document3.txt");
        lista.insere("with", "document1.txt");
        lista.insere("with", "document2.txt");
        lista.insere("with", "document3.txt");
        
        new GoogleMain("this", lista);
        new GoogleMain("force", lista);
        new GoogleMain("the", lista);
        new GoogleMain(lista);
        

    }
    
}
