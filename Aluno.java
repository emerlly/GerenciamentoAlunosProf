package GerenciementoAlunoProfessores;

public class Aluno extends Pessoa {
    public Aluno(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    public void matricularDisciplina(String disciplina) {
        System.out.println("Aluno " + getNome() + " matriculou-se na disciplina " + disciplina);
    }

	@Override
	public void matricularDisciplina() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ministrarAula() {
		// TODO Auto-generated method stub
		
	}
}

