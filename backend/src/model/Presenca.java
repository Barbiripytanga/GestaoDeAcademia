package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Presenca {

    private Aluno aluno;
    private LocalDateTime dataHora;

    public Presenca(Aluno aluno, LocalDateTime dataHora) {
        this.aluno = aluno;
        this.dataHora = dataHora;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return aluno.getNome() + " | " + dataHora.format(formato);
    }
}
