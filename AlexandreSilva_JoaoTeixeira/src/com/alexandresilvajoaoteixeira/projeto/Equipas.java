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
	
	public void removeJOgadores(Jogadores jogadores) {
		
	}
	
	public void addTreinadores(Treinadores treinadores) {
		this.treinadores.add(treinadores);
	}
	
	public void removeTreinadores(Treinadores treinadores) {
		
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