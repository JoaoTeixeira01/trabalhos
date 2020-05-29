package projeto;

import java.util.List;
import java.util.ArrayList;

public class Equipas extends Clubes{
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codigoIdentificador;
	private String nome;
	private String escalao;
	private List<Jogadores> jogadores;
	private List<Treinadores> treinadores;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(int codigoIdentificador) {
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