package pt.ulusofona.lp2.empresasalarios;

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

    static ArrayList<String> obterRelatorioSalarios(Empresa emp, String mes) {
        ArrayList<String> relatorio = new ArrayList<>();

        relatorio.add("Relatório de Salários - mês de " + mes);
        for (Funcionario func : emp.getFuncionarios()) {
            relatorio.add(func.getNome() + " - " + func.calculaSalario(mes));
        }

        return relatorio;
    }

    static ArrayList<String> obterRelatorioDetalhado(Empresa emp, String mes) {
        ArrayList<String> relatorio = new ArrayList<>();

        relatorio.add("Relatório detalhado - mês de " + mes);
        for (Funcionario func : emp.getFuncionarios()) {
            relatorio.add("  " + func.getNome() + " - " + func.calculaSalario(mes));
            if (func.getTarefas().size() == 0) {
                relatorio.add("    Sem tarefas");
            } else {
                for (Tarefa tarefa : func.getTarefas()) {
                    relatorio.add("    " + tarefa.getNome() + " (" + tarefa.getTempoExecucao() + ")");
                }
            }
        }

        return relatorio;
    }

    static Empresa obterUmaEmpresa() {
        Empresa empresa = new Empresa("Cenas");
        Tarefa tarefa1 = new Tarefa("Faz nestum");
        Tarefa tarefa2 = new Tarefa("Faz cerelac");
        Tarefa tarefa3 = new Tarefa("Faz miluvit");
        Funcionario func1 = new Gestor("Tiago", 550);
        Funcionario func2 = new Tarefeiro("Vera");
        Funcionario func3 = new Tecnico("Bruno", 700);
        ClienteEmpresarial clie1 = new ClienteEmpresarial("Cliente A", 123, 500000001,"Zé",123);
        ClienteIndividual clie2 = new ClienteIndividual("Cliente B", 321, 100000001);

        func1.adicionaTarefa(tarefa1);
        func2.adicionaTarefa(tarefa2);
        func3.adicionaTarefa(tarefa3);
        empresa.adicionaFuncionario(func1);
        empresa.adicionaFuncionario(func2);
        empresa.adicionaFuncionario(func3);
        empresa.adicionaTarefa(tarefa1);
        empresa.adicionaTarefa(tarefa2);
        empresa.adicionaTarefa(tarefa3);
        empresa.adicionaClienteEmpresarial(clie1);
        empresa.adicionaClienteIndividual(clie2);

        return empresa;
    }

    static void registarCliente(Empresa emp, ClienteEmpresarial cliente) {
        emp.adicionaClienteEmpresarial(cliente);
    }

    static void registarCliente(Empresa emp, ClienteIndividual cliente) {
        emp.adicionaClienteIndividual(cliente);
    }

    static void registarEncomenda(Empresa empresa, ClienteEmpresarial cliente, Tarefa t)  {
    }

    static void registarEncomenda(Empresa empresa, ClienteIndividual cliente, Tarefa t) {

    }

    static ArrayList<ClienteEmpresarial> getClientesEmpresariais(Empresa empresa) {
        return empresa.getClientesEmpresariais();
    }

    static ArrayList<ClienteIndividual> getClientesIndividuais(Empresa empresa) {
        return empresa.getClientesIndividuais();
    }

    static ArrayList<String> obterListaClientes(Empresa emp) {
        ArrayList<String> clientes = new ArrayList<>();

        clientes.add("Lista de Clientes");

        for (Cliente cliente : emp.getClientes()) {
            clientes.add(cliente.getNome() + " | " + cliente.getContactoTelefonico() + " | " + cliente.getContactoTelefonico());
        }
        return null;
    }

    static ArrayList<String> relatorioEncomendasMensais(Empresa e, String mes) {
        return null;
    }

    public static void main(String[] args) {
        Empresa empresa = obterUmaEmpresa();
        ArrayList<Funcionario> funcionarios = empresa.getFuncionarios();
        ArrayList<String> relatorio, relatorio1;
        int i = 1;

        for (Funcionario func : funcionarios) {
            Tarefa tarefa = new Tarefa("Cenas"+i, "Agosto");
            func.tarefas.add(tarefa);
            tarefa.setTempoExecucao(i);
            i++;
        }

        relatorio = obterRelatorioSalarios(empresa, "Agosto");
        relatorio1 = obterRelatorioDetalhado(empresa, "Agosto");

        System.out.println(relatorio1);

    }
}
