package servico;

import Entidades.Cliente;
import repositorioCliente.ClienteRepositorio;

import java.util.ArrayList;

public class ClienteServico {
    private ClienteRepositorio clienteRepositorio;

    public ClienteServico (ArrayList<Cliente> listaCliente) {
        this.clienteRepositorio = new ClienteRepositorio(listaCliente);
    }
    public void cadastrar(Cliente cliente) {
        if(cliente.getNome().isBlank())
            System.out.println("NOME EM BRANCO!");
        else {
            if(cliente.getNome().isEmpty())
                System.out.println("NOME VAZIO!");
            else {
                if(cliente.getNome().length() <= 4)
                    System.out.println("DIGITE SEU NOME COMPLETO!");
                else {
                    if(cliente.getCpf().length() != 11)
                        System.out.println("CPF INCORRETO!");
                    else {
                        if(verificarCpfDuplicado(cliente.getCpf()))
                            System.out.println("CPF DUPLICADO!");
                        else {
                            if(cliente.getDataNascimento().length() != 8)
                                System.out.println("DIGITE A DATA DE NASCIMENTO COM DIA MES E ANO!");
                            else {
                                if(cliente.getEmail().length() <= 15)
                                    System.out.println("DIGITE UM EMAIL VALIDO!");
                                else {
                                    if(verificarEmailDuplicado(cliente.getEmail()))
                                        System.out.println("EMAIL DUPLICADO!");
                                    else {
                                        if(cliente.getTelefone().length() <=10)
                                            System.out.println("DIGITE UM NUMERO DE TELEFONE VALIDO! APENAS NUMEROS!");
                                        else {
                                            if(verificarTelefoneDuplicado(cliente.getTelefone()))
                                                System.out.println("TELEFONE DUPLICADO!");
                                            else {
                                                if(cliente.getCriarSenha().length() < 7)
                                                    System.out.println("SENHA INVALIDA! DIGITE UMA SENHA COM NO MINIMO 8 CARACTERES");
                                                else {
                                                    clienteRepositorio.cadastrar(cliente);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public void atualizar(Cliente cliente) {
        clienteRepositorio.cadastrar(cliente);
    }
    public void deletar(Cliente cliente) {
        clienteRepositorio.deletar(cliente);
    }
    public boolean verificarCpfDuplicado(String cpf) {
        for(Cliente cliente : listar()) {
            if(cliente.getCpf().equals(cpf))
                return true;
        }
        return false;
    }
    public boolean verificarTelefoneDuplicado(String telefone) {
        for(Cliente cliente : listar()) {
            if(cliente.getTelefone().equals(telefone))
                return true;
        }
        return false;
    }
    public boolean verificarEmailDuplicado(String email) {
        for(Cliente cliente : listar()) {
            if(cliente.getEmail().equals(email))
                return true;
        }
        return false;
    }
    public ArrayList<Cliente> listar(){
        return clienteRepositorio.listar();
    }
    public void imprimirClientePf() {

        for(Cliente cliente : clienteRepositorio.listar()) {
            System.out.println("NOME: " + cliente.getNome());
        }
    }
    public void imprimirClienteNovosDadosPf() {
        for(Cliente cliente : clienteRepositorio.listar()) {
            System.out.println("NOME: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("DATA DE NASCIMENTO: " + cliente.getDataNascimento());
            System.out.println("EMAIL: " + cliente.getEmail());
            System.out.println("TELEFONE: " + cliente.getTelefone());
            System.out.println("SENHA: " + cliente.getCriarSenha());
        }
    }
    public void imprimirClienteContaPf() {
        for(Cliente cliente : clienteRepositorio.listar()) {
            System.out.println("NOME: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("DATA DE NASCIMENTO: " + cliente.getDataNascimento());
            System.out.println("EMAIL: " + cliente.getEmail());
            System.out.println("TELEFONE: " + cliente.getTelefone());
            System.out.println("SENHA: " + cliente.getCriarSenha());
        }
    }
}
