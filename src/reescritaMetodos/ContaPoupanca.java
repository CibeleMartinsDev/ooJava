package reescritaMetodos;

import classes.Cliente;
import classes.ContaBancaria;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {


    Integer diaDeRendimento;

    public ContaPoupanca(Cliente cliente, Integer agencia, Integer numeroConta, BigDecimal saldo, String tipo) {
        super(cliente, agencia, numeroConta, saldo, tipo);
    }

    //pode ser usada a anotacao @Override na reescrita de métodos
    public void sacar(BigDecimal valor, ContaBancaria contaBancaria) {

    }

    public void calcularNovoSaldo(Float taxa){

    }
}
