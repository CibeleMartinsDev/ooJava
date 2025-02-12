package heranca;

import classes.Funcionario;

public class Gerente extends Funcionario {

    public String senha;

    public Integer tempoEmpresa;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(Integer tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }
}
