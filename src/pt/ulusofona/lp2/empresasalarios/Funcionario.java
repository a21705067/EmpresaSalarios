package pt.ulusofona.lp2.empresasalarios;

import java.util.ArrayList;

public abstract class Funcionario {
    String nome;
    ArrayList<Tarefa> tarefas;

    public Funcionario(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public boolean adicionaTarefa(Tarefa tarefa) {
        if (this.tarefas.contains(tarefa)) {
            return false;
        }
        this.tarefas.add(tarefa);
        return true;
    }

    abstract int calculaSalario(String mes);
}
