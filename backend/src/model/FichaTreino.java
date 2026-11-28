
package model;

import estrutura.ListaExercicios;

public class FichaTreino {

    private Aluno aluno;
    private ListaExercicios exercicios;

    public FichaTreino(Aluno aluno) {
        this.aluno = aluno;
        this.exercicios = new ListaExercicios();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public ListaExercicios getExercicios() {
        return exercicios;
    }

    public void adicionarExercicio(Exercicio exercicio) {
        exercicios.adicionar(exercicio);
    }

    public void exibirFicha() {
        System.out.println("\n===== FICHA DE TREINO =====");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());

        if (exercicios.estaVazia()) {
            System.out.println("Nenhum exercício cadastrado.");
            return;
        }

        exercicios.exibir();
    }
}
