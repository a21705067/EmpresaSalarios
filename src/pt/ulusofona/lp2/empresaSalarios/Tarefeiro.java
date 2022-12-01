package pt.ulusofona.lp2.empresaSalarios;

public class Tarefeiro extends Funcionario {
    int salarioBase;

    public Tarefeiro(String nome) {
        super(nome);
        this.salarioBase = 505;
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
