package estrutura;

import model.Presenca;

public class NoPresenca {

    private Presenca presenca;
    private NoPresenca proximo;

    public NoPresenca(Presenca presenca) {
        this.presenca = presenca;
        this.proximo = null;
    }

    public Presenca getPresenca() {
        return presenca;
    }

    public NoPresenca getProximo() {
        return proximo;
    }

    public void setProximo(NoPresenca proximo) {
        this.proximo = proximo;
    }
}
