package collections.Ensalamento;

import java.util.ArrayList;

public class Ensalamento{
    ArrayList<Sala> salas = new ArrayList<Sala>();
    ArrayList<Turma> turmas = new ArrayList<Turma>();
    ArrayList<TurmaEmSala> ensalamento = new ArrayList<TurmaEmSala>();

    Ensalamento(){}

    public void addSala(Sala sala){
        this.salas.add(sala);
    }

    public void addTurma(Turma turma){
        this.turmas.add(turma);
    }

    public Sala getSala(Turma turma){
        Sala sala = null;
        for (TurmaEmSala element : ensalamento) {
            if(element.turma == turma){
                sala = element.sala;
            } 
        }
        return sala;
    }

    public boolean salaDisponivel(Sala sala, int horario){
        boolean existeSala = true;
        for (TurmaEmSala element : ensalamento){
            if(element.sala == sala){
                if(element.turma.horarios.indexOf(horario) != -1){
                    existeSala = false;
                }
                        
            }
        }
        return existeSala;
    }
    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios){
        boolean existeSala = true;
        for (Integer element : horarios) {
            if(salaDisponivel(sala, element) == false){
                 existeSala = false;
             }
        }
        return existeSala;
    }          
    

    public boolean alocar(Turma turma, Sala sala){
        boolean existeSala = true;
        if((turma.acessivel == sala.acessivel) || (turma.acessivel == false)){
            if(turma.numAlunos <= sala.capacidade){
                if (salaDisponivel(sala, turma.horarios) == false ) {
                   existeSala = false;
                }
                if(existeSala == true){
                    TurmaEmSala novaSala = new TurmaEmSala(turma, sala);
                    ensalamento.add(novaSala);
                }
            }else{
                existeSala = false;
            }
        }else{
            existeSala = false;
        }
        return existeSala;
    }
    public void alocarTodas(){
        for(Turma element : turmas){
            for(Sala elementSala : salas){
                if((element.acessivel == elementSala.acessivel) || (element.acessivel == false)){
                    if(element.numAlunos <= elementSala.capacidade){
                        if(salaDisponivel(elementSala, element.horarios) != false){
                            alocar(element, elementSala);
                            break;
                        }
                    }
                }
            }
        }
    }
    public int getTotalTurmasAlocadas(){
        int turmasAlocadas = 0;
        for(TurmaEmSala element : ensalamento){
            if(element.sala != null){
                turmasAlocadas++;
            }
        }
        return turmasAlocadas;
    }
    public int getTotalEspacoLivre(){
        int espaçoLivre = 0;
        for(TurmaEmSala salas : ensalamento){
            espaçoLivre += salas.sala.capacidade - salas.turma.numAlunos;
        }
        return espaçoLivre;
    }

    public String relatorioResumoEnsalamento(){
        return "Total de Salas: " + salas.size() + "\n" + "Total de Turmas: " + turmas.size() + "\n" +
                "Turmas Alocadas: " + getTotalTurmasAlocadas() + "\n" + "Espaços Livres: " + getTotalEspacoLivre() + "\n";

    }
    public String relatorioTurmasPorSala(){
        String result =  "";
        String turmaString = "";
        
        for(Sala elemetSala : salas){
            for(TurmaEmSala element : ensalamento){
                if(elemetSala == element.sala){
                    turmaString += element.turma.getDescricao() + "\n\n";
                }
            }
            result += "--- " + elemetSala.getDescricao() + " ---\n\n" + turmaString;
            turmaString = "";
        }

        return relatorioResumoEnsalamento()+ "\n" + result;
    }
    public String relatorioSalasPorTurma(){
        String result = "";
        int flag;
         for(Turma element : turmas){
            result += element.getDescricao() + "\n";
            flag = 0;
            for(TurmaEmSala obj : ensalamento){
                if(obj.turma == element){
                    flag = 1;
                    result += "Sala: " + obj.sala.getDescricao() + "\n\n";
                } 
            }
            if(flag == 0){
                result += "Sala: SEM SALA\n\n";
            }
         }
         return relatorioResumoEnsalamento()+ "\n" + result;
    }
}
    


