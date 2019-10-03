
package atvdagregacaocomposicao;


public class Alunos {
    private String codAluno;
    private String nomeAluno;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double notaFinal;
    private double notaFinalF;
    
    public void setCodAluno(String codAluno){
        this.codAluno = codAluno;
    }
    
    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }
    
    public String getCodAluno(){return this.codAluno;}
    public String getNomeAluno(){return this.nomeAluno;}
    
    
    public void setNotas(double nota1,double nota2, double nota3, double nota4 ){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }


    public void NotaFinal(){
        this.notaFinal = (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
    }
    
    
    public String exibirSituacao(){
        if(this.notaFinal>=7){
        return "O aluno "+this.nomeAluno+
                " com código "+this.codAluno+
                " Está com a média de "+this.notaFinal+
                "E esta aprovado";
        }
        else{
        return  "O aluno "+this.nomeAluno+
                " com código "+this.codAluno+
                " Está com a média de "+this.notaFinal+
                "E esta reprovado"; 
        }
    }
}
