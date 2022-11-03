package pt.ulusofona.lp2.EmpresaSalarios;

public class Tarefa {
    String nome;
    int mes;
    int tempoExecucao;

    public Tarefa(String nome, int mes, int tempoExecucao) {
        this.nome = nome;
        this.mes = mes;
        this.tempoExecucao = tempoExecucao;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }
}
