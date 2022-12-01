package pt.ulusofona.lp2.empresasalarios;

public abstract class Cliente {
    String nome;
    int contactoTelefonico;
    int nif;

    abstract String[] obtemInfo();
}
