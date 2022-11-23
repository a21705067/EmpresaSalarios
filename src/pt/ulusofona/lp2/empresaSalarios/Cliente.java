package pt.ulusofona.lp2.empresaSalarios;

public abstract class Cliente {
    String nome;
    int contactoTelefonico;
    int nif;

    abstract String[] obtemInfo();
}
