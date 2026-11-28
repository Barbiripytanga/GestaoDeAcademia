
package estrutura;

import model.Exercicio;

public class ListaExercicios {

    private NoExercicio inicio;

    public ListaExercicios() {
        inicio = null;
    }

    public void adicionar(Exercicio exercicio) {

        NoExercicio novo = new NoExercicio(exercicio);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        NoExercicio atual = inicio;

        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        atual.setProximo(novo);
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void exibir() {

        NoExercicio atual = inicio;

        while (atual != null) {
            System.out.println(atual.getExercicio());
            atual = atual.getProximo();
        }
    }
}
