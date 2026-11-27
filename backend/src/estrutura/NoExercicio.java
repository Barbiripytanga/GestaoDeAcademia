
package estrutura;

import model.Exercicio;

public class NoExercicio {

    private Exercicio exercicio;
    private NoExercicio proximo;

    public NoExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
        this.proximo = null;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public NoExercicio getProximo() {
        return proximo;
    }

    public void setProximo(NoExercicio proximo) {
        this.proximo = proximo;
    }
}
