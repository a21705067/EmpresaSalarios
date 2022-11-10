package pt.ulusofona.lp2.EmpresaSalarios;

import java.util.ArrayList;

public class Funcionario {
    int id;
    String nome;
    int salarioBase;
    ArrayList<Tarefa> tarefas;

    public Funcionario(int id, String nome, int salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tarefas = new ArrayList<>();
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public boolean adicionaTarefa(Tarefa tarefa) {
        if (this.tarefas.contains(tarefa)) {
            return false;
        }
        this.tarefas.add(tarefa);
        return true;
    }

    public int calculaSalario(Tarefa tarefa) {
        int bonus = 0, horas = 0, salario = 0;

        if (tarefas.size() == 0) {
            return salarioBase;
        } else {
            for (Tarefa task : tarefas) {
                horas += task.getTempoExecucao();
            }
        }

        if (tarefas.size() > 10 && horas < 50) {
            bonus = tarefas.size() - 5;
        }

        return salarioBase + 2 * horas + bonus;
    }
}
