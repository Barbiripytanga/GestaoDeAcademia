package estrutura;

import model.Presenca;

public class FilaPresencas {

    private NoPresenca inicio;
    private NoPresenca fim;
    private int tamanho;

    public FilaPresencas(){

    }

    public void enfileirar(Presenca presenca){
NoPresenca novo= new NoPresenca(presenca);

    if(fim==null){// fila vazia: o novo é o primeiro e o último
    inicio=novo;
    }else{// liga o último atual no novo
    fim.setProximo(novo);
    } // o novo passa a ser o último
        fim = novo;
        tamanho++;
    }


    // Sai pelo INÍCIO da fila
    public Presenca desenfileirar() {
    if(inicio==null){
    return null;
        }
        // guarda quem vai sair
        Presenca removida = inicio.getPresenca();

        // o segundo da fila vira o primeiro
        inicio = inicio.getProximo();

        // se a fila esvaziou, o fim tambem precisa ficar vazio
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return removida;}


    public boolean estaVazia() {
        return inicio == null;
    }


    // Mostra as presenças de um aluno e devolve quantas encontrou
    public int exibirDoAluno(String cpf) {
        int encontradas = 0;
        NoPresenca atual = inicio;

        while (atual != null) {
            if (atual.getPresenca().getAluno().getCpf().equals(cpf)) {
                System.out.println(atual.getPresenca());
                encontradas++;
            }
            atual = atual.getProximo();
        }

        return encontradas;
    }
}
