package com.projeto;

public class Pedido {
    private double valorTotal;

    public Pedido() {
        this.valorTotal = 0;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double novoValor) {
        this.valorTotal = novoValor;
    }
}
