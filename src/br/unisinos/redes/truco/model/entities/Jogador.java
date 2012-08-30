package br.unisinos.redes.truco.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private List<Carta> cartas;

    public Jogador() {
        this.cartas = new ArrayList<>();
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
}