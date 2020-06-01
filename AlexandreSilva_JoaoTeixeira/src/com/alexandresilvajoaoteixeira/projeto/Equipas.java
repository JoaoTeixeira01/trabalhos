package com.alexandresilvajoaoteixeira.projeto;

import java.util.List;
import java.util.ArrayList;

/**
 * A class <strong>Equipas</strong> disponibliza um conjunto de atributos
 * referentes a cada equipa.
 * 
 * A class é constituida por 5 atributos referentes a cada equipa
 * 
 * <pre>
 * {@code int codigoIdentificador
 * String nome
 * String escalao
 * List<Jogadores> jogadores = new ArrayList<Jogadores>()
 * List<Treinadores> treinadores = new ArrayList<Treinadores>()
 * }
 * </pre>
 * @author Alexandre Silva e João Teixeira
 * @version 1.0
 * @since 31/05/2020
 *
 */

public class Equipas extends Clubes{
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codigoIdentificador;
	private String nome;
	private String escalao;
	private List<Jogadores> jogadores = new ArrayList<Jogadores>();
	private List<Treinadores> treinadores = new ArrayList<Treinadores>();

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getcodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdent(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEscalao() {
		return escalao;
	}
	
	public void setEscalao(String escalao) {
		this.escalao = escalao;
	}
	
	public List<Jogadores> getJogadores() {
		return jogadores;
	}
	
	public void setJogadores(List<Jogadores> jogadores) {
		this.jogadores = jogadores;
	}
	
	public List<Treinadores> getTreinadores() {
		return treinadores;
	}
	
	public void setTreinadores(List<Treinadores> treinadores) {
		this.treinadores = treinadores;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================
   
    // CONSTRUTOR DEFAULT

	public Equipas() {
		
	}

    // CONSTRUTOR COM PARÂMETROS

	public Equipas(int codigoIdentificador, String nome, String escalao) {
		super();
		this.codigoIdentificador = codigoIdentificador;
		this.nome = nome;
		this.escalao = escalao;
		this.jogadores = new ArrayList<Jogadores>();
		this.treinadores = new ArrayList<Treinadores>();
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void addJogadores(Jogadores jogadores) {
		this.jogadores.add(jogadores);
	}
	
	public void removeJogadores(int codigo) {
        int jogadorRemover = Jogadores(codigo);
        if (jogadorRemover == -1) {

        } else

        this.jogadores.remove(jogadorRemover);
    }

    public void editJogadores(int codigo, Jogadores jogador) {
        int jogadorRemover = Jogadores(codigo);
        if (jogadorRemover == -1) {

        } else

        this.jogadores.set(jogadorRemover, jogador);
    }

    public int Jogadores(int codigo) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getCartaoCidadao() == codigo)
                return i;
        }
        return -1;
    }
	
	public void addTreinadores(Treinadores treinadores) {
		this.treinadores.add(treinadores);
	}
	
	public void removeTreinadores(int codigo) {
        int treinadorRemover = Treinadores(codigo);
        if (treinadorRemover == -1) {

        } else

        this.treinadores.remove(treinadorRemover);
    }

    public void editTreinadores(int codigo, Treinadores treinadores) {
        int treinadorRemover = Treinadores(codigo);
        if (treinadorRemover == -1) {

        } else

        this.treinadores.set(treinadorRemover, treinadores);
    }

    public int Treinadores(int codigo) {
        for (int i = 0; i < treinadores.size(); i++) {
            if (treinadores.get(i).getCartaoCidadao() == codigo)
                return i;
        }
        return -1;
    }
	
	@Override
	public void numeroJogadores(Jogadores jogadores) {
		this.jogadores.size();
	}
	
	@Override
	public void numeroTreinadores(Treinadores treinadores) {
		this.treinadores.size();
	}
	
	public void ordenarJogadores(Jogadores jogadores) {
		
	}
	
    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Equipas [codigoIdentificador=" + codigoIdentificador + ", nome=" + nome + ", escalao=" + escalao + ", jogadores="
				+ jogadores + ", treinadores=" + treinadores + "]";
	}

    // ----> equals()
}