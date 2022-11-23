package pt.ulusofona.lp2.empresaSalarios;

public class ClienteEmpresarial extends Cliente {
    String nomeResponsavel;
    int telefoneResponsavel;

    public ClienteEmpresarial(String nome, int contactoTelefonico, int nif, String nomeResponsavel, int telefoneResponsavel) {
        this.nome = nome;
        this.contactoTelefonico = contactoTelefonico;
        this.nif = nif;
        this.nomeResponsavel = nomeResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String[] obtemInfo(){
        String[] info = new String[2];

        info[0] = this.nome + " | " + this.contactoTelefonico + " | " + this.nif;
        info[1] = this.nomeResponsavel + " | " + this.telefoneResponsavel;
        return info;
    }
}
