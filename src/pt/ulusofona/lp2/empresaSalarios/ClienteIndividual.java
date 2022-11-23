package pt.ulusofona.lp2.empresaSalarios;

public class ClienteIndividual extends Cliente {

    public ClienteIndividual(String nome, int contactoTelefonico, int nif) {
        this.nome = nome;
        this.contactoTelefonico = contactoTelefonico;
        this.nif = nif;
    }

    public String[] obtemInfo() {
        String[] info = new String[1];

        info[0] = this.nome + " | " + this.contactoTelefonico + " | " + this.nif;
        return info;
    }
}
