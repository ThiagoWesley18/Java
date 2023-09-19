package collections.Ensalamento;

public class EnsalamentoMain {
    public static void main(String[] args) throws Exception {
        Sala sala = new Sala(6, 101, 50, true);
        Sala sala1 = new Sala(6, 102, 100, true);
        Sala sala2 = new Sala(6, 203, 50, false);
        Sala sala3 = new Sala(6, 204, 100, true);
        Turma turma = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, false);
        Turma turma1 = new Turma("Técnicas de Programação", "Horácio Fernandes", 50, false);
        Turma turma2 = new Turma("Laboratório de Programação C", "Edson Nascimento", 25, true);
        Turma turma3 = new Turma("Redes de Computadores", "Edjair Souza", 70, true);
        Ensalamento ensalamento = new Ensalamento();
        turma.addHorario(1);
        turma.addHorario(15);
        turma.addHorario(29);

        turma1.addHorario(11);
        turma1.addHorario(25);
        turma1.addHorario(32);

        turma2.addHorario(1);
        turma2.addHorario(15);
        turma2.addHorario(29);

        turma3.addHorario(2);
        turma3.addHorario(16);

        ensalamento.addSala(sala);
        ensalamento.addSala(sala1);
        ensalamento.addSala(sala2);
        ensalamento.addSala(sala3);
        ensalamento.addTurma(turma);
        ensalamento.addTurma(turma1);
        ensalamento.addTurma(turma2);
        ensalamento.addTurma(turma3);

        
        ensalamento.alocarTodas();
        
        System.out.println(ensalamento.getTotalTurmasAlocadas());
        System.out.println(ensalamento.getTotalEspacoLivre());
        System.out.println(ensalamento.relatorioTurmasPorSala());
        System.out.println(ensalamento.relatorioSalasPorTurma());
        
        
    }
}
