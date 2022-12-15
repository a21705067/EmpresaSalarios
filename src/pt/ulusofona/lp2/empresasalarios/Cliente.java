package pt.ulusofona.lp2.empresasalarios;

public abstract class Cliente {
    String nome;
    int contactoTelefonico;
    int nif;

    abstract String[] obtemInfo();

    public String getNome() {
        return nome;
    }

    public int getContactoTelefonico() {
        return contactoTelefonico;
    }

    public int getNif() {
        return nif;
    }
}

