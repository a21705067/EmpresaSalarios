package pt.ulusofona.lp2.empresasalarios;

public class Tarefa {
    String nome;
    String mes;
    int tempoExecucao;
    boolean concluida = false;

    public Tarefa(String nome, String mes, int tempoExecucao) {
        this.nome = nome;
        this.mes = mes;
        this.tempoExecucao = tempoExecucao;
        this.concluida = true;
    }

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public Tarefa(String nome, String mes) {
        this.nome = nome;
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNome() {
        return nome;
    }

    boolean terminarTarefa(int nrHoras) {
        this.tempoExecucao = nrHoras;
        this.concluida = true;
        return true;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(int tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }
}
