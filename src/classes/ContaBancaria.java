package classes;

import java.math.BigDecimal;

public class ContaBancaria {
    //composicao entre ContaBancaria e cliente
    public Cliente cliente;

    public Integer agencia;

    public Integer numeroConta;

    public BigDecimal saldo;

    public String tipoConta;

    public ContaBancaria(Cliente cliente, Integer agencia, Integer numeroConta, BigDecimal saldo, String tipoConta) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void sacar(BigDecimal valor){
                            
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public void depositar(BigDecimal valor){

    }

    public ContaBancaria mostrarDadosConta(){
        return this;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
