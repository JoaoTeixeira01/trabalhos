package com.alexandresilvajoaoteixeira.projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * A class <strong>Competicoes</strong> disponibliza um conjunto de atributos
 * referentes a cada competicao.
 * 
 * A class é constituida por 8 atributos referentes a cada competicao
 * 
 * <pre>
 * {@code int codigoIdentificador
 * String nome
 * Date dataFundacao
 * String corEquipamento
 * int contacto
 * String email
 * String morada
 * List<Equipas> equipasEscaloes
 * }
 * </pre>
 * @author Alexandre Silva e João Teixeira
 * @version 1.0
 * @since 31/05/2020
 *
 */

public class Competicoes {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codigoIdentificador;
	private String nome;
	private Date dataInicio;
	private Date dataFim;
	private List<Equipas> equipasEscalao = new ArrayList<Equipas>();
	//private List<Clubes> equipasParticipantes;
	private List<Jogos> jogos = new ArrayList<Jogos>();

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getcodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setcodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public List<Equipas> getEquipasEscalao() {
		return equipasEscalao;
	}

	public void setEquipasEscalao(List<Equipas> equipasEscalao) {
		this.equipasEscalao = equipasEscalao;
	}

	//public List<Clubes> getEquipasParticipantes() {
	//	return equipasParticipantes;
	//}

	//public void setEquipasParticipantes(List<Clubes> equipasParticipantes) {
	//	this.equipasParticipantes = equipasParticipantes;
	//}

	public List<Jogos> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogos> jogos) {
		this.jogos = jogos;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================
   
    // CONSTRUTOR DEFAULT

	public Competicoes() {
		
	}

    // CONSTRUTOR COM PARÂMETROS

	public Competicoes(int codigoIdentificador, String nome, Date dataInicio, Date dataFim) {
		super();
		this.codigoIdentificador = codigoIdentificador;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.equipasEscalao = new ArrayList<Equipas>();
		//this.equipasParticipantes = new ArrayList<Clubes>();
		this.jogos = new ArrayList<Jogos>();
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void addEquipa(Equipas equipasEscalao) {
		this.equipasEscalao.add(equipasEscalao);	
	}
	
	public void removeEquipa(int codigo) {
        int equipaRemover = Equipa(codigo);
        if (equipaRemover == -1) {

        } else

        this.equipasEscalao.remove(equipaRemover);
    }

    public void editEquipa(int codigo, Equipas equipasEscalao) {
        int equipaRemover = Equipa(codigo);
        if (equipaRemover == -1) {

        } else

        this.equipasEscalao.set(equipaRemover, equipasEscalao);
    }

    public int Equipa(int codigo) {
        for (int i = 0; i < equipasEscalao.size(); i++) {
            if (equipasEscalao.get(i).getcodigoIdentificador() == codigo)
                return i;
        }
        return -1;
    }
	
	public void addJogo(Jogos jogos) {
		this.jogos.add(jogos);
	}
	
	public void removeJogo(int codigo) {
        int jogoRemover = Jogo(codigo);
        if (jogoRemover == -1) {

        } else

        this.jogos.remove(jogoRemover);
    }

    public void editJogo(int codigo, Jogos jogos) {
        int jogoRemover = Jogo(codigo);
        if (jogoRemover == -1) {

        } else

        this.jogos.set(jogoRemover, jogos);
    }

    public int Jogo(int codigo) {
        for (int i = 0; i < jogos.size(); i++) {
            if (jogos.get(i).getcodigoIdentificador() == codigo)
                return i;
        }
        return -1;
    }
	
	public void numeroEquipas(Equipas equipasEscalao) {
		this.equipasEscalao.size();
	}
	
	public void jogosJornada() {
		
	}
	
    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Competicoes [codigoIdentificador=" + codigoIdentificador + ", nome=" + nome + ", dataInicio=" + dataInicio
				+ ", dataFim=" + dataFim + ", equipasEscalao=" + equipasEscalao + ", jogos=" + jogos + "]";
	}

    // ----> equals()
}