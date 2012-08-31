package br.unisinos.redes.truco.model.entities;

import br.unisinos.redes.truco.exceptions.FaltamCartasException;
import br.unisinos.redes.truco.model.enumerations.Naipe;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class JogadorTest {

    private ArrayList<Carta> cartasFlor;
    private ArrayList<Carta> cartasEnvido;
    private ArrayList<Carta> cartasAMenos;

    @Before
    public void setUp() {

        cartasFlor = new ArrayList<>();
        cartasEnvido = new ArrayList<>();
        cartasAMenos = new ArrayList<>();

        Carta c1 = new Carta();
        Carta c2 = new Carta();
        Carta c3 = new Carta();
        Carta c4 = new Carta();

        c1.setNaipe(Naipe.COPAS);
        c2.setNaipe(Naipe.COPAS);
        c3.setNaipe(Naipe.COPAS);
        c4.setNaipe(Naipe.OUROS);

        cartasFlor.add(c1);
        cartasFlor.add(c2);
        cartasFlor.add(c3);

        cartasEnvido.add(c3);
        cartasEnvido.add(c4);
        cartasEnvido.add(c1);

        cartasAMenos.add(c4);
        cartasAMenos.add(c2);



    }

    /**
     * Test of verificarCartas method, of class Jogador.
     */
    @Test
    public void testVerificarCartas() throws Exception {
        System.out.println("Testando resultado do método verificarCartas");
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogador jogador3 = new Jogador();

        jogador1.setCartas(cartasFlor);
        jogador2.setCartas(cartasEnvido);
        jogador3.setCartas(cartasAMenos);
        jogador1.verificarCartas();      

        
        assertTrue(jogador1.isFlor());
        assertFalse(jogador1.isEnvido());
        System.out.println("Testando flor");
        
        jogador2.verificarCartas();   
        assertFalse(jogador2.isFlor());
        assertTrue(jogador2.isEnvido());
        
        System.out.println("Testando envido");
        
         try {
            jogador3.verificarCartas();
            fail("Deveria Informar uma exception de cartas insuficientes");
        } catch (FaltamCartasException expectedException) {            
            System.out.println("Testando exception de falta de cartas");
        }

    }
}
