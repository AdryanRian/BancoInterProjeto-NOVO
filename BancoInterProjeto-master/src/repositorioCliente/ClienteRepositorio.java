package repositorioCliente;

import Entidades.Cliente;

import java.util.ArrayList;

public class ClienteRepositorio {
    public ArrayList<Cliente> listaCliente;

    public ClienteRepositorio(ArrayList<Cliente> listaCliente){
        this.listaCliente = listaCliente;
    }
    public void cadastrar(Cliente cliente){
        listaCliente.add(cliente);
    }
    public ArrayList<Cliente> listar(){
        return listaCliente;
    }
    public ArrayList<Cliente> listarPorNome(String nome){
        ArrayList<Cliente> listaPorNome = new ArrayList<>();

        for(Cliente cliente : listaCliente){
            if(cliente.getNome().equals(nome))
                listaPorNome.add(cliente);
        }
        return listaPorNome;
    }
    public void atualizar(Cliente cliente, int index){
        listaCliente.add(index, cliente);
    }
    public void deletar(Cliente cliente){
        listaCliente.remove(cliente);
    }
    public void deletar(int indice){
        listaCliente.remove(indice);
    }
}
