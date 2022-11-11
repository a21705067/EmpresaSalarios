package pt.ulusofona.lp2.empresaSalarios;

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
        this.salarioBase = 505;
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

    public int calculaSalario(String mes) {
        int bonus = 0, horas = 0, salario = 0, totalTarefas = 0;

        if (tarefas.size() == 0) {
            return salarioBase;
        } else {
            for (Tarefa task : tarefas) {
                if (task.getMes() == mes) {
                    totalTarefas++;
                    horas += task.getTempoExecucao();
                }
            }
        }

        if (tarefas.size() > 10 && horas < 50) {
            bonus = totalTarefas - 5;
        }

        return salarioBase + 2 * horas + bonus;
    }
}
