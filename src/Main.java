import classes.Cliente;
import classes.ContaBancaria;
import reescritaMetodos.ContaEspecial;
import reescritaMetodos.ContaPoupanca;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //incluir dados de contas de clientes
        //cria os clientes
        Cliente clientePessoaFisica = new Cliente(
                "233.809.677.09",
                "marcosvalentim@gmail.com",
                "Rua das Flores, 169",
                "Marcos Valentim",
                "11 97885643",
                "30.205.371.-60"
        );

        Cliente clientePessoaJuridica = new Cliente(
                "433.222.677.010",
                "jonassilva@gmail.com",
                "Rua Herval, 200",
                "Jonas Silva",
                "11 99663343",
                "40.999.099.-00"
        );
        //cria contas bancarias com os clientes
        ContaBancaria contaBancariaPF = new ContaBancaria(clientePessoaFisica, 73460, 45550, new BigDecimal("150000.56"), "PF");
        ContaBancaria contaBancariaPJ = new ContaBancaria(clientePessoaJuridica, 566899, 20048, new BigDecimal("88500.56"), "PJ");
        ContaBancaria[] contasBancarias;
        contasBancarias = new ContaBancaria[6];
        contasBancarias[0] = contaBancariaPF;
        contasBancarias[1] = contaBancariaPJ;

        //instancia as contas especiais e poupanca sem dados
        ContaEspecial contaEspecialPFisica = new ContaEspecial(null, 0,0,new BigDecimal(0), "");
        ContaPoupanca contaPoupancaPFisica = new ContaPoupanca(null, 0,0,new BigDecimal(0), "");
        ContaEspecial contaEspecialPJuridica = new ContaEspecial(null, 0,0,new BigDecimal(0), "");
        ContaPoupanca contaPoupancaPJuridica = new ContaPoupanca(null, 0,0,new BigDecimal(0), "");
        //instancia novamente com dados as contas especiais e poupanca
        //poderia ter feito com getter e setter
        for(int i = 0; i <= 1; i++){
            if(contasBancarias[i].getTipoConta().equalsIgnoreCase("PF")){
                contaEspecialPFisica = new ContaEspecial(clientePessoaFisica, 73460, 45550, new BigDecimal("5000"), "EspecialPF");
                contaPoupancaPFisica = new ContaPoupanca(clientePessoaFisica, 73460, 45550, new BigDecimal("150000.56"), "PoupancaPF");
            }else {
                contaEspecialPJuridica = new ContaEspecial(clientePessoaJuridica, 566899, 20048, new BigDecimal("5000"), "EspecialPJ");
                contaPoupancaPJuridica = new ContaPoupanca(clientePessoaJuridica, 566899, 20048, new BigDecimal("88500.56"), "PoupancaPJ");
            }
        }
        //Add demais contas bancárias ao array
        contasBancarias[2] = contaEspecialPFisica;
        contasBancarias[3] = contaPoupancaPFisica;
        contasBancarias[4] = contaEspecialPJuridica;
        contasBancarias[5] = contaPoupancaPJuridica;
        //sacar um determinado valor das suas contas
        contaBancariaPJ.sacar(new BigDecimal("1000"));
        //depositar um determinado valor em suas contas
        contaBancariaPJ.depositar(new BigDecimal("500"));
        //Mostrar o novo saldo do cliente que possui conta poupanca a partir da taxa de rendiemnto
        System.out.print("Esses é o novo saldo da conta bancaria PJ após o saque e o depósito: ");
        System.out.print(contaBancariaPJ.mostrarDadosConta());
        //Mostrar dados das contas dos clientes
        System.out.print("Esses são os dados das contas dos clientes: ");
        System.out.print(Arrays.toString(contasBancarias));

    }
}