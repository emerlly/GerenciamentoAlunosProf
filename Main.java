package GerenciementoAlunoProfessores;


public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Aluno a = new Aluno("Eme", "Rua a,150", "99999");
        Aluno b = new Aluno("Pedro", "Rua x, 450", "888888");
        
        Professor nome = new Professor("Joao", "Rua j, 12", "333333");
        escola.adicionarAluno(a);
        escola.adicionarAluno(b);
        escola.adicionarProfessor(nome);
        
        System.out.println("\nRemover aluno / Professor:");
        escola.removerAluno(a);
        escola.removerProfessor(nome);
        
    }
}