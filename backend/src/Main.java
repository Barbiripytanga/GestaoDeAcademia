import model.Aluno;
import model.Exercicio;
import service.AlunoService;
import service.PresencaService;

import java.util.Scanner;

public class Main {

    private static Scanner teclado = new Scanner(System.in);
    private static int proximoId = 1;

    public static void main(String[] args) {

        AlunoService alunoService = new AlunoService();
        PresencaService presencaService = new PresencaService(alunoService);

        int opcao;

        do {
            System.out.println("\n===== GESTAO DE ACADEMIA =====");
            System.out.println("1 - Matricular aluno");
            System.out.println("2 - Montar ficha de treino");
            System.out.println("3 - Ver ficha de treino");
            System.out.println("4 - Registrar presenca");
            System.out.println("5 - Historico de presenca");
            System.out.println("6 - Listar alunos");
            // aqui entram as opcoes de mensalidade
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    matricular(alunoService);
                    break;
                case 2:
                    montarFicha(alunoService);
                    break;
                case 3:
                    System.out.print("CPF do aluno: ");
                    Aluno aluno = alunoService.buscarAluno(teclado.nextLine());
                    alunoService.verFicha(aluno);
                    break;
                case 4:
                    System.out.print("CPF do aluno: ");
                    presencaService.registrarPresenca(teclado.nextLine());
                    break;
                case 5:
                    System.out.print("CPF do aluno: ");
                    presencaService.historico(teclado.nextLine());
                    break;
                case 6:
                    alunoService.listarAlunos();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }

    private static void matricular(AlunoService alunoService) {
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("CPF: ");
        String cpf = teclado.nextLine();
        System.out.print("Telefone: ");
        String telefone = teclado.nextLine();
        System.out.print("Plano: ");
        String plano = teclado.nextLine();

        Aluno aluno = new Aluno(proximoId, nome, cpf, telefone, plano, true);

        if (alunoService.matricular(aluno)) {
            proximoId++;
        }
    }

    private static void montarFicha(AlunoService alunoService) {
        System.out.print("CPF do aluno: ");
        Aluno aluno = alunoService.buscarAluno(teclado.nextLine());

        if (aluno == null) {
            System.out.println("Aluno nao encontrado.");
            return;
        }

        System.out.print("Quantos exercicios? ");
        int qtd = lerInteiro();

        if (qtd <= 0) {
            System.out.println("Quantidade invalida.");
            return;
        }

        Exercicio[] exercicios = new Exercicio[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Exercicio " + (i + 1));
            System.out.print("  Nome: ");
            String nome = teclado.nextLine();
            System.out.print("  Series: ");
            int series = lerInteiro();
            System.out.print("  Repeticoes: ");
            int repeticoes = lerInteiro();
            System.out.print("  Dia da semana: ");
            String dia = teclado.nextLine();

            exercicios[i] = new Exercicio(nome, series, repeticoes, dia);
        }

        alunoService.montarFicha(aluno, exercicios);
    }

    // Le uma linha e converte para numero. Se nao for numero, devolve -1.
    private static int lerInteiro() {
        try {
            return Integer.parseInt(teclado.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}