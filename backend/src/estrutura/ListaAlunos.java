
package estrutura;

import model.Aluno;

public class ListaAlunos {

    private NoAluno inicio;

    public ListaAlunos() {
        inicio = null;
    }

    public void adicionar(Aluno aluno) {

        NoAluno novo = new NoAluno(aluno);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        NoAluno atual = inicio;

        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        atual.setProximo(novo);
    }

    public Aluno buscarPorCpf(String cpf) {

        NoAluno atual = inicio;

        while (atual != null) {

            if (atual.getAluno().getCpf().equals(cpf)) {
                return atual.getAluno();
            }

            atual = atual.getProximo();
        }

        return null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void exibir() {

        NoAluno atual = inicio;

        while (atual != null) {
            System.out.println(atual.getAluno());
            atual = atual.getProximo();
        }
    }
}
