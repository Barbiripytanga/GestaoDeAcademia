package service;

import estrutura.FilaPresencas;
import model.Aluno;
import model.Presenca;

import java.time.LocalDateTime;

public class PresencaService {

    private FilaPresencas presencas;
    private AlunoService alunoService;


    public PresencaService(AlunoService alunoService) {
        this.alunoService = alunoService;
        this.presencas= new FilaPresencas();
    }

    public boolean registrarPresenca(String cpf){
        Aluno aluno = alunoService.buscarAluno(cpf);

        if(aluno==null){
            System.out.println("Aluno nao encontrado. Faca a matricula primeiro");
            return false;
        }

        if (!aluno.isAtivo()) {
            System.out.println("Aluno inativo.");
            return false;
        }

        // TODO: quando o MensalidadeService estiver pronto, avisar aqui se o aluno estiver em atraso.

        presencas.enfileirar(new Presenca(aluno, LocalDateTime.now()));
        System.out.println("Presenca registrada para " + aluno.getNome() + "!");
        return true;
    }

    public void historico(String cpf) {
        Aluno aluno = alunoService.buscarAluno(cpf);

        if (aluno == null) {
            System.out.println("Aluno nao encontrado.");
            return;
        }

        System.out.println("\n===== PRESENCAS DE " + aluno.getNome() + " =====");

        if (presencas.exibirDoAluno(aluno.getCpf()) == 0) {
            System.out.println("Nenhuma presenca registrada.");
        }
    }
}