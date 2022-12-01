package pt.ulusofona.lp2.empresaSalarios;

public class Tecnico extends Funcionario {
    int salarioBase;

    public Tecnico(String nome, int salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    public int calculaSalario(String mes) {
        return salarioBase;
    }
}
