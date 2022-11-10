package pt.ulusofona.lp2.EmpresaSalarios;

import java.util.ArrayList;

public class Empresa {
    String nome;
    ArrayList<Funcionario> funcionarios;
    ArrayList<Tarefa> tarefas;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
        this.tarefas = new ArrayList<>();
    }

    public boolean adicionaFuncionario(Funcionario funcionario) {
        if (this.funcionarios.contains(funcionario)) {
            return false;
        }

        this.funcionarios.add(funcionario);
        return true;
    }

    public boolean adicionaTarefa(Tarefa tarefa) {
        if (this.tarefas.contains(tarefa)) {
            return false;
        }

        this.tarefas.add(tarefa);
        return true;
    }
}
