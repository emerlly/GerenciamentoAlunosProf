package GerenciementoAlunoProfessores;

public class Professor extends Pessoa {
    public Professor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    public void ministrarAula(String disciplina) {
        System.out.println("Professor " + getNome() + " está ministrando aula de " + disciplina);
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


