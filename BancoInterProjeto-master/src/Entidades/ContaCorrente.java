package Entidades;

import Interfaces.PessoaFisica;
import Interfaces.PessoaJuridica;

public class ContaCorrente extends Cliente implements PessoaJuridica, PessoaFisica {
    private int senha;
    private double saldo;

    public boolean depositar (double valor){
        this.saldo += valor;
        return true;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean transferir(double valor, long chave){
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("\nTransferência realizada com sucesso! Saldo atual: " + getSaldo());
            System.out.println("\n *** Comprovante *** \n\nValor enviado: " + valor + "\nRecebedor: \n" + chave);
            return true;
        }
        System.out.println("\nSaldo Insuficiente");
        return false;
    }


    @Override
    public void VerificarCnpj() {

    }

    @Override
    public void nomeDaEmpresa() {

    }
}
