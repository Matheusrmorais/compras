import model.Compras;

import java.util.Scanner;

public class Principal {

   public static void main(String[] args) {

       Compras compras = new Compras();

       compras.setEscolha(1);

       while (compras.getEscolha() != 0) {

           System.out.println("Menu");
           System.out.println("1 - Definir saldo inicial");
           System.out.println("2 - Digite a descrição da compra");
           System.out.println("3 - Digite o valor da compra");
           Scanner input = new Scanner(System.in);
           compras.setEscolha(input.nextInt());


           switch (compras.getEscolha()) {

               case 1:
                   System.out.println("Digite o valor da compra: ");
                   break;
               case 2:
                   System.out.println("teste");
                   break;
           }
       }





    }
}
