package br.unisinos.redes.truco.model.entities;

import java.util.List;

public class Jogo {

    private Baralho baralho;
    private List<Jogador> jogadores;

    public Baralho getBaralho() {
        return baralho;
    }

    public void setBaralho(Baralho baralho) {
        this.baralho = baralho;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}