package Entidades;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    protected long cpf;
    private int AnodeNascimento;
    private long Rg;
    private String endereco;
    private int idade;
    private List<ContaCorrente> listaConta = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getAnodeNascimento() {
        return AnodeNascimento;
    }

    public void setAnodeNascimento(int anodeNascimento) {
        AnodeNascimento = anodeNascimento;
    }

    public long getRg() {
        return Rg;
    }

    public void setRg(long rg) {
        Rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
