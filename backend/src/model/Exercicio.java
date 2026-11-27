
package model;

public class Exercicio {

    private String nome;
    private int series;
    private int repeticoes;
    private String dia;

    public Exercicio(String nome, int series, int repeticoes, String dia) {
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
        this.dia = dia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return nome + " | " + series + " séries | "
                + repeticoes + " repetições | " + dia;
    }
}
