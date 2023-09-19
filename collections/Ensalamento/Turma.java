package collections.Ensalamento;

import java.util.ArrayList;
import java.util.Hashtable;

public class Turma {
    String nome;
    String professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios = new ArrayList<Integer>();

    Turma(){
        this(null,null,0,false);
    }

    Turma(String nome, String professor, int numAlunos, boolean acessivel){
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
    }

    public void addHorario(int horario){
        horarios.add(horario);
    }
    public String getHorariosString(){
        Integer chave = 0;
        String texto = "";
        Hashtable<Integer,Integer> linha = new Hashtable<Integer,Integer>();
        Hashtable<Integer,String> coluna = new Hashtable<Integer,String>();
        String[] dia = {"segunda", "terça", "quarta", "quinta", "sexta"};
        Integer[] hora = {8,10,12,14,16,18,20};
        int[][] aula = {{1,8,15,22,29} ,{2,9,16,23,30}, {3,10,17,24,31}, {4,11,18,25,32}, 
                        {5,12,19,26,33}, {6,13,20,27,34}, {7,14,21,28,35}};

        for(int j = 0;j < aula[0].length; j++){
            for(int i = 0; i< aula.length; i++){
                chave++;
                linha.put(chave,hora[i]);
                coluna.put(chave,dia[j]);
            }
        }
        Integer ultimo = 0;
        for(Integer ultimoLista : horarios){
            ultimo = ultimoLista;
        }
        for(Integer horario : horarios){
            if(horario != ultimo){
                texto += coluna.get(horario) +" "+  linha.get(horario) + "hs, ";
            }else{
                texto += coluna.get(horario) +" "+  linha.get(horario) + "hs";
            }
        }
        return texto;
    }

    public String getDescricao(){
        String acesso;
        if(acessivel == true){
            acesso = "sim";
        }else{
            acesso = "não";
        }

        return "Turma: " + nome + "\n" + "Professor: "+ professor+ "\n" +"Número de Alunos: " + numAlunos + "\n" +
                "Horário: " + getHorariosString() + "\n" + "Acessível: " + acesso;
    }
    
}
