
package atvdagregacaocomposicao;

import java.util.ArrayList;
import java.util.List;


public class Turma {
    private String nomeTurma;
    private List<Alunos> Alunos=new ArrayList<Alunos>();
    
    public void setNomeTurma(String nomeTurma){
        this.nomeTurma = nomeTurma;
    }
    public String getNomeTurma(){return this.nomeTurma;}
    
    public void addAluno(Alunos a){
        Alunos.add(a);
    }
    
    public void exibirAlunos(){
        for(Alunos a1 : this.Alunos){
            System.out.println(
                    "Turma: "+this.nomeTurma+
                    ", nome do aluno: "+a1.getNomeAluno()+
                    ", codigo do aluno: "+a1.getCodAluno());
        }
    }
    
}
