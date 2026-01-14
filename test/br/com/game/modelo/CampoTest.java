package br.com.game.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions; // Importa a CLASSE inteira - uso:Assertions.assertTrue(10 > 2);
import static org.junit.jupiter.api.Assertions.assertTrue;
//import path;: Importa classes ou pacotes.
//import static path;: Importa membros estáticos (métodos e variáveis) de uma classe, permitindo seu uso direto.
public class CampoTest {
    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testeVizinhoDistanciaRealEsquerda() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.addVizinho(vizinho);
        assertTrue(resultado);

    }


}
