package br.com.game.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private final int linha;
    private final int coluna;

    private boolean minado = false;
    private boolean aberto = false;
    private boolean marcado = false;
    private List<Campo> vizinhos = new ArrayList<>();//auto relacionamento no bd. 1,n. private para garantir que tenha o encapsulamento, responsabilidade do campo

    //vizinho? distancia abs de 1 ou 2(na diagonal)
    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    boolean addVizinho(Campo vizinho) {
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;//Para que seja diagonal, ambas as linhas e colunas devem ser diferentes.

        int deltaLinha = Math.abs(linha - vizinho.linha);//quanto uma linha está distante da outra
        int deltaColuna = Math.abs(coluna - vizinho.coluna);

        int deltaGeral = deltaLinha + deltaColuna;
        if (deltaGeral == 1 && !diagonal) {//vizinho está adjacente(direita, esquerda, acima ou abaixo).
            vizinhos.add(vizinho);
            return true;
        } else if (deltaGeral == 2 && diagonal) {
            vizinhos.add(vizinho);
            return true;
        }
        return false;
    }
}
