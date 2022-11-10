package pt.ulusofona.lp2.EmpresaSalarios;

public class Tarefa {
    String nome;
    int mes;
    int tempoExecucao;
    boolean concluida = false;

    public Tarefa(String nome, int mes, int tempoExecucao) {
        this.nome = nome;
        this.mes = mes;
        this.tempoExecucao = tempoExecucao;
    }

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public Tarefa(String nome, int mes) {
        this.nome = nome;
        this.mes = mes;
    }

    boolean terminarTarefa(int nrHoras) {
        this.tempoExecucao = nrHoras;
        this.concluida = true;
        return true;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }
}
