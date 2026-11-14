package model;

import java.util.ArrayList;
import java.util.List;

public class Compras {
    private double saldo;
    private String descricao;
    private double valorCompra;
    private int escolha;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }



    @Override
    public String toString() {
        return "\n\nDescrição: " + getDescricao() + "\nValor compra: " + getValorCompra() ;
    }
}
