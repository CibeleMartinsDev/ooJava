package reescritaMetodos;

import classes.Cliente;
import classes.ContaBancaria;

import java.math.BigDecimal;

public class ContaEspecial extends ContaBancaria {

    public BigDecimal limite = BigDecimal.valueOf(1500.25);

    public ContaEspecial(Cliente cliente, Integer agencia, Integer numeroConta, BigDecimal saldo, String tipo) {
        super(cliente, agencia, numeroConta, saldo, tipo);
    }


    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    //pode ser usada a anotacao @Override na reescrita de métodos
    public void sacar(BigDecimal valor, ContaBancaria contaBancaria){

       while (!contaBancaria.getSaldo().equals(BigDecimal.valueOf(-1500.25))){
            super.sacar(valor);
       }

       if (contaBancaria.getSaldo().equals(BigDecimal.valueOf(-1500.25))) {
            System.out.print("Você atingiu o limite da Conta Especial. Não há mais como sacar.");
       }
    }
}
