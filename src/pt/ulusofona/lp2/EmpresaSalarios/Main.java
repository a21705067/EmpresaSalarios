package pt.ulusofona.lp2.EmpresaSalarios;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    static void contratar(Empresa empresa, Funcionario func) {
        empresa.adicionaFuncionario(func);
    }

    static void associarTarefa(Empresa e, Funcionario f, Tarefa t, String mes) {
        for (Funcionario func : e.getFuncionarios()) {
            if (func.equals(f)) {
                func.tarefas.add(t);
                t.setMes(mes);
            }
        }
    }

    static ArrayList<Funcionario> getFuncionarios(Empresa empresa) {
        return empresa.getFuncionarios();
    }

    static ArrayList<Tarefa> getTarefas(Empresa empresa) {
        return empresa.getTarefas();
    }

    ArrayList<String> obterRelatorioSalarios(Empresa emp, String mes) {
        ArrayList<String> relatorio = new ArrayList<>();

        relatorio.add("----------------------------------------");
        relatorio.add("Relatório de Salários - mês de " + mes);
        for (Funcionario func : emp.getFuncionarios()) {
            relatorio.add(func.getNome() + " - " + func.calculaSalario(mes));
        }
        relatorio.add("----------------------------------------");

        return relatorio;
    }

    static void obterRelatorioDetalhado(Empresa emp, String mes) {
        System.out.println("----------------------------------------");
        System.out.println("Relatório detalhado - mês de " + mes);
        for (Funcionario func : emp.getFuncionarios()) {
            System.out.println("  " + func.getNome() + " - " + func.calculaSalario(mes));
            if (func.getTarefas().size() == 0) {
                System.out.println("    Sem tarefas");
            }
            for (Tarefa tarefa : func.getTarefas()) {
                System.out.println("    " + tarefa.getNome() + " (" + tarefa.getTempoExecucao() + ")");
            }
        }
        System.out.println("----------------------------------------");
    }

    static Empresa obterUmaEmpresa() {
        Empresa empresa = new Empresa("Cenas");
        Tarefa tarefa1 = new Tarefa("Faz nestum");
        Tarefa tarefa2 = new Tarefa("Faz cerelac");
        Tarefa tarefa3 = new Tarefa("Faz miluvit");
        Funcionario func1 = new Funcionario("Tiago");
        Funcionario func2 = new Funcionario("Vera");
        Funcionario func3 = new Funcionario("Bruno");

        func1.adicionaTarefa(tarefa1);
        func2.adicionaTarefa(tarefa2);
        func3.adicionaTarefa(tarefa3);
        empresa.adicionaFuncionario(func1);
        empresa.adicionaFuncionario(func2);
        empresa.adicionaFuncionario(func3);
        empresa.adicionaTarefa(tarefa1);
        empresa.adicionaTarefa(tarefa2);
        empresa.adicionaTarefa(tarefa3);

        return empresa;
    }

    public static void main(String[] args) {

    }
}
