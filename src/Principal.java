import Calculos.Calculo;
import model.Compras;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {

   public static void main(String[] args) {

       Compras compras = new Compras();

       compras.setEscolha(1);
       Calculo calculo = new Calculo();
       List<Compras> listaCompras = new ArrayList<>();
       Scanner input = new Scanner(System.in);

       // Loop até a escolha for 0
       while (compras.getEscolha() != 0) {

           System.out.println("================================================");

           System.out.println("Menu");
           System.out.println("1 - Definir saldo inicial");
           System.out.println("2 - Digite a descrição da compra e valor");
           System.out.println("3 - Visualizar compras");
           System.out.println("4 - Consultar saldo");
           System.out.println("0 - Sair");

           System.out.println("================================================");

           compras.setEscolha(input.nextInt());


           switch (compras.getEscolha()) {

               case 1:
                   System.out.println("Digite o valor da compra: ");
                   calculo.setValor(input.nextDouble());
                   calculo.saldo(calculo.getValor());

                   System.out.println("Saldo atual: " + calculo.getSaldo());
                   break;
               case 2:
                   Compras compraLista = new Compras();


                   System.out.println("Descrição Compra: ");
                   input.nextLine();
                   compraLista.setDescricao(input.nextLine());

                   System.out.println("Valor compra: ");
                   compraLista.setValorCompra(input.nextDouble());

                   System.out.println(calculo.getSaldo());
                   System.out.println(compraLista.getValorCompra());

                   if (compraLista.getValorCompra() > calculo.getSaldo()) {
                       System.out.println("Saldo insuficiente");
                   } else {

                       listaCompras.add(compraLista);
                       System.out.println("Compra realizada com sucesso!");

                   }
                   calculo.setValor(calculo.getSaldo() - calculo.getValorCompra());
                   System.out.println("Saldo atual: " + calculo.getSaldo());
                   break;

                   case 3:

                       listaCompras.sort(Comparator.comparing(Compras::getValorCompra).reversed());
                       System.out.println("Lista de compras: " + listaCompras);
                       System.out.println("teste");
                       break;
           }
       }



    }
}
