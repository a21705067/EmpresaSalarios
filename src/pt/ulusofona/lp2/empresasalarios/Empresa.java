package pt.ulusofona.lp2.empresasalarios;

import java.util.ArrayList;

public class Empresa {
    String nome;
    ArrayList<Funcionario> funcionarios;
    ArrayList<Tarefa> tarefas;
    ArrayList<ClienteIndividual> clientesIndividuais;
    ArrayList<ClienteEmpresarial> clientesEmpresariais;
    ArrayList<Cliente> clientes;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
        this.tarefas = new ArrayList<>();
        this.clientesIndividuais = new ArrayList<>();
        this.clientesEmpresariais = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public boolean adicionaFuncionario(Funcionario funcionario) {
        if (this.funcionarios.contains(funcionario)) {
            return false;
        }

        this.funcionarios.add(funcionario);
        return true;
    }

    public boolean adicionaClienteEmpresarial(ClienteEmpresarial cliente) {
        if (this.clientesEmpresariais.contains(cliente)) {
            return false;
        }

        this.clientesEmpresariais.add(cliente);
        this.clientes.add(cliente);
        return true;
    }

    public boolean adicionaClienteIndividual(ClienteIndividual cliente) {
        if (this.clientesIndividuais.contains(cliente)) {
            return false;
        }

        this.clientesIndividuais.add(cliente);
        this.clientes.add(cliente);
        return true;
    }

    public boolean adicionaTarefa(Tarefa tarefa) {
        if (this.tarefas.contains(tarefa)) {
            return false;
        }

        this.tarefas.add(tarefa);
        return true;
    }

    public ArrayList<ClienteIndividual> getClientesIndividuais() {
        return clientesIndividuais;
    }

    public ArrayList<ClienteEmpresarial> getClientesEmpresariais() {
        return clientesEmpresariais;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
