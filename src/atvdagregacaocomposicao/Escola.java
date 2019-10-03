
package atvdagregacaocomposicao;

import java.util.ArrayList;
import java.util.List;


public class Escola {
    private String nome;
    private List<Turma> Turma=new ArrayList<Turma>();
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
     
    public void addTurma(Turma t){
        Turma.add(t);
    }
    
    public void exibirTurma(){
        for(Turma t1 : this.Turma){
            System.out.println("Escola: "+this.nome+
                    ", Nome da turma: "+t1.getNomeTurma());
        }
    }
}
