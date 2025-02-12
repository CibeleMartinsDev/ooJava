package classes;

public class Cliente {

    public String nome;

    public String cpf;

    public String rg;

    public String email;

    public String endereco;

    public String numeroTelefone;

    public Cliente(String cpf, String email, String endereco, String nome, String numeroTelefone, String rg) {
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
