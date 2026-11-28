
package service;

import model.Aluno;
import model.Exercicio;
import model.FichaTreino;
import estrutura.ListaAlunos;

public class AlunoService {

    private ListaAlunos alunos;

    public AlunoService() {
        alunos = new ListaAlunos();
    }

    
    public boolean matricular(Aluno aluno) {

        if (aluno == null) {
            System.out.println("Aluno inválido.");
            return false;
        }

        if (campoVazio(aluno.getNome())
                || campoVazio(aluno.getCpf())
                || campoVazio(aluno.getTelefone())
                || campoVazio(aluno.getPlano())) {

            System.out.println("Preencha todos os campos.");
            return false;
        }

        if (buscarAluno(aluno.getCpf()) != null) {
            System.out.println("CPF já cadastrado.");
            return false;
        }

        alunos.adicionar(aluno);

        System.out.println("Aluno matriculado com sucesso!");
        return true;
    }

    
    public Aluno buscarAluno(String cpf) {

        if (campoVazio(cpf)) {
            return null;
        }

        return alunos.buscarPorCpf(cpf.trim());
    }

   
    public boolean montarFicha(Aluno aluno, Exercicio[] exercicios) {

        if (aluno == null || exercicios == null
                || exercicios.length == 0) {
            System.out.println("Aluno ou exercícios inválidos.");
            return false;
        }

        Aluno cadastrado = buscarAluno(aluno.getCpf());

        if (cadastrado == null) {
            System.out.println("Aluno não cadastrado.");
            return false;
        }

        FichaTreino ficha = new FichaTreino(cadastrado);

        for (int i = 0; i < exercicios.length; i++) {

            Exercicio exercicio = exercicios[i];

            if (exercicio == null
                    || campoVazio(exercicio.getNome())
                    || campoVazio(exercicio.getDia())
                    || exercicio.getSeries() <= 0
                    || exercicio.getRepeticoes() <= 0) {

                System.out.println("Exercício inválido.");
                return false;
            }

            ficha.adicionarExercicio(exercicio);
        }

        cadastrado.setFichaTreino(ficha);

        System.out.println("Ficha de treino montada com sucesso!");
        return true;
    }

    
    public FichaTreino verFicha(Aluno aluno) {

        if (aluno == null) {
            System.out.println("Aluno inválido.");
            return null;
        }

        Aluno cadastrado = buscarAluno(aluno.getCpf());

        if (cadastrado == null
                || cadastrado.getFichaTreino() == null) {

            System.out.println("Ficha de treino não encontrada.");
            return null;
        }

        cadastrado.getFichaTreino().exibirFicha();

        return cadastrado.getFichaTreino();
    }

    private boolean campoVazio(String valor) {
        return valor == null || valor.trim().isEmpty();
    }

    public void listarAlunos() {
        alunos.exibir();
    }
}
