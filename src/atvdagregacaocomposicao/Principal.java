
package atvdagregacaocomposicao;


public class Principal {


    public static void main(String[] args) {
        Escola e = new Escola();
        Turma t1 = new Turma();
        Turma t2 = new Turma();
        Alunos a1 = new Alunos();
        Alunos a2 = new Alunos();
        Alunos a3 = new Alunos();
        Alunos a4 = new Alunos();
        Alunos a5 = new Alunos();
        
        e.setNome("Recanto do Rock funckeiro Machado de Bocage");
        
        t1.setNomeTurma("Turma ç");
        t2.setNomeTurma("Turma sa");//sa significa sua mãe
        
        a1.setNomeAluno("Gordolfo");
        a1.setCodAluno("200");
        a2.setNomeAluno("Enzo");
        a2.setCodAluno("2018");
        a3.setNomeAluno("Valentina");
        a3.setCodAluno("2118");
        a4.setNomeAluno("Josuke");
        a4.setCodAluno("2016");
        a5.setNomeAluno("Fernanda");
        a5.setCodAluno("19");
        a1.setNotas(10, 10, 9, 8);
        a2.setNotas(9, 10, 9, 8);
        a3.setNotas(5, 10, 9, 8);
        a4.setNotas(3, 8, 9, 8);
        a5.setNotas(6, 10, 9, 8);
        
        e.addTurma(t1);
        e.addTurma(t2);
        
        t1.addAluno(a5);
        t1.addAluno(a4);
        t1.addAluno(a1);
        t2.addAluno(a2);
        t2.addAluno(a3);
        
        e.exibirTurma();
        
        t1.exibirAlunos();
        t2.exibirAlunos();
    }
    
}
