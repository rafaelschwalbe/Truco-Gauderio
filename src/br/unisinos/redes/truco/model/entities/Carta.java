package br.unisinos.redes.truco.model.entities;

import br.unisinos.redes.truco.model.enumeration.Valor;

public abstract class Carta {

    private Valor numero;

    public Valor getNumero() {
        return numero;
    }

    public void setNumero(Valor numero) {
        this.numero = numero;
    }
}