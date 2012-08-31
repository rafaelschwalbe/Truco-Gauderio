package br.unisinos.redes.truco.model.entities;

import br.unisinos.redes.truco.exceptions.FaltamCartasException;
import br.unisinos.redes.truco.model.enumerations.Naipe;
import java.util.List;
import java.util.ArrayList;

public final class Jogador {

    private static int MAXIMO_CARTAS = 3;
    private List<Carta> cartas;
    private boolean flor;
    private boolean envido;
    private boolean in;

    public Jogador() {
        this.cartas = new ArrayList<>();
        this.setEnvido(false);
        this.setFlor(false);
    }

    public void verificarCartas() throws FaltamCartasException {

        if (this.getCartas().size() != MAXIMO_CARTAS) {
            throw new FaltamCartasException(
                    String.format("A mão do jogador não possui %n cartas", new Object[]{MAXIMO_CARTAS}));

        }
        if (this.verificarFlor()) {
            this.setEnvido(false);
            this.setFlor(true);
        } else {
            if (this.verificarEnvido()) {
                this.setEnvido(true);
                this.setFlor(false);
            }
        }
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public boolean isFlor() {
        return flor;
    }

    public void setFlor(boolean flor) {
        this.flor = flor;
    }

    public boolean isEnvido() {
        return envido;
    }

    public void setEnvido(boolean envido) {
        this.envido = envido;
    }

    private boolean verificarFlor() {
        if (this.getCartas().get(0).getNaipe().equals(this.getCartas().get(1).getNaipe()) && this.getCartas().get(1).getNaipe().equals(this.getCartas().get(2).getNaipe())) {
            return true;
        }
        return false;
    }

    private boolean verificarEnvido() {
        if (this.getCartas().get(0).getNaipe().equals(this.getCartas().get(1).getNaipe()) || this.getCartas().get(1).getNaipe().equals(this.getCartas().get(2).getNaipe()) || this.getCartas().get(0).getNaipe().equals(this.getCartas().get(2).getNaipe())) {
            return true;
        }
        return false;
    }
}