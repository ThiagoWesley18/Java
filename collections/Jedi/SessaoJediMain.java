package collections.Jedi;

public class SessaoJediMain {
    public static void main(String[] args) throws Exception {
        IniciadoJedi iniciado1 = new IniciadoJedi("Katooni", "Tholothian", -23);
        IniciadoJedi iniciado2 = new IniciadoJedi("Byph", "Ithorian", 21);
        IniciadoJedi iniciado3 = new IniciadoJedi("Gungi", "Ithorian", 21);
        IniciadoJedi iniciado4 = new IniciadoJedi("Petro", "Human", 23);
        TreinadorJedi jedi = new TreinadorJedi("Grão-Mestre", "Fae Coven");
        
        SessaoJedi força = new SessaoJedi("Instruções de Uso da Força", jedi);
        força.addIniciado(iniciado1);
        força.addIniciado(iniciado2);
        força.addIniciado(iniciado3);
        força.addIniciado(iniciado4);
        System.out.println(força.getDescricao());
    }
}
