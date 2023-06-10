package GerenciementoAlunoProfessores;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Escola() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado à escola.");
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        System.out.println("Aluno " + aluno.getNome() + " removido da escola.");
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor " + professor.getNome() + " adicionado à escola.");
    }

    public void removerProfessor(Professor professor) {
        professores.remove(professor);
        System.out.println("Professor " + professor.getNome() + " removido da escola.");
    }
}

