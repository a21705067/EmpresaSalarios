package pt.ulusofona.lp2.empresasalarios;

public class Gestor extends Funcionario {
    int salarioBase;

    public Gestor(String nome, int salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    public int calculaSalario(String mes) {
        return salarioBase + tarefas.size() * 2;
    }
}
