package repositorioContaCorrente;

import Entidades.ContaCorrente;

import java.util.ArrayList;

public class ContaCorrenteRepositorio {
    public ArrayList<ContaCorrente> listaContaCorrente;

    public ContaCorrenteRepositorio(ArrayList<ContaCorrente> listaContaCorrente){
        this.listaContaCorrente = listaContaCorrente;
    }
    public void cadastrar(ContaCorrente contaCorrente){
        listaContaCorrente.add(contaCorrente);
    }
    public ArrayList<ContaCorrente> listar(){
        return listaContaCorrente;
    }
}
