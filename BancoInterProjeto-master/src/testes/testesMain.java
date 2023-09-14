package testes;

import Entidades.Cliente;
import Entidades.ContaCorrente;

import java.util.Scanner;


public class testesMain {
    public static void main(String[] args) {
        ContaCorrente cliente = new ContaCorrente();
        Scanner scan = new Scanner(System.in);
        System.out.println("*** MENU INÍCIADO ***");


        int loop1 = 1;
        while (loop1 == 1) {

            System.out.println("\n 1 - Deposito\n 2 - Transferir\n 3 - Ver Saldo " +
                    "\n 4 - Sair \nDigite a opção desejada:");

            int opcao1 = scan.nextInt();

            switch (opcao1) {
                case 1:
                    System.out.println("\n Como deseja depositar: \n 1 - Gerar Chave Pix\n 2 - Gerar Boleto" +
                            "\n 3 - Voltar ao menu anterior");
                    int subloop1 = scan.nextInt();


                    if (subloop1 == 1) {
                        System.out.println("\n Valor do deposito: ");
                        cliente.depositar(scan.nextDouble());
                        System.out.println("\nChave pix aleatória: xxxxxxxxxxxxxxxx");
                        break;
                    } else if (subloop1 == 2) {
                        System.out.println("\n Valor do deposito: ");
                        cliente.depositar(scan.nextDouble());
                        System.out.println("\nCódigo do boleto: xxxxxxxxxxxxxxxxx");
                        break;
                    } else {
                        break;
                    }

                case 2:

                    System.out.println("\n Para quem deseja transferir(CPF/CNPJ ou Chave Pix): ");
                    long i = scan.nextLong();
                    System.out.println("\n Valor da transferência: ");
                    cliente.transferir(scan.nextDouble(), i);
                    System.out.println("Transferência efetuada!");
                    break;

                case 3:
                    System.out.println("Saldo atual: " + cliente.getSaldo());
                    break;
                case 4:
                    System.out.println("Fim do sistema.");
                    loop1++;
                    break;
            }


        }


    }
}
