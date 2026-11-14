package Calculos;

import model.Compras;

public class Calculo extends Compras {
    private double valor;


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void saldo(double valorAdicionado) {
        if(valorAdicionado < 0){
            System.out.println("Aplicativo não aceita valores negativos");
        } else {
            setSaldo(getSaldo() + valorAdicionado);
        }
    }
}
