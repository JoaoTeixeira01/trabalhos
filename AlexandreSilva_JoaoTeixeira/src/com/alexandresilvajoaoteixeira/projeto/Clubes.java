package com.alexandresilvajoaoteixeira.projeto;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * A class <strong>Clubes</strong> disponibliza um conjunto de atributos
 * referentes a cada clube.
 * 
 * A class é constituida por 8 atributos referentes a cada clube
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

public class Clubes extends Competicoes{
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codigoIdentificador;
	private String nome;
	private Date dataFundacao;
	private String corEquipamento;
	private int contacto;
	private String email;
	private String morada;
	private List<Equipas> equipasEscaloes;

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
	
	public Date getDataFundacao() {
		return dataFundacao;
	}
	
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	public String getCorEquipamento() {
		return corEquipamento;
	}
	
	public void setCorEquipamento(String corEquipamento) {
		this.corEquipamento = corEquipamento;
	}
	
	public int getContacto() {
		return contacto;
	}
	
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMorada() {
		return morada;
	}
	
	public void setMorada(String morada) {
		this.morada = morada;
	}
	
	public List<Equipas> getEquipasEscaloes() {
		return equipasEscaloes;
	}
	
	public void setEquipasEscaloes(List<Equipas> equipasEscaloes) {
		this.equipasEscaloes = equipasEscaloes;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================
   
    // CONSTRUTOR DEFAULT

	public Clubes() {
		
	}

    // CONSTRUTOR COM PARÂMETROS

	public Clubes(int codigoIdentificador, String nome, Date dataFundacao, String corEquipamento, int contacto, String email,
			String morada) {
		super();
		this.codigoIdentificador = codigoIdentificador;
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.corEquipamento = corEquipamento;
		this.contacto = contacto;
		this.email = email;
		this.morada = morada;
		this.equipasEscaloes = new ArrayList<Equipas>();
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	//add e remove nas equipas
	public void addEquipa(Equipas equipasEscaloes) {
		this.equipasEscaloes.add(equipasEscaloes);
	}
	
	public void removeEquipa(int codigo) {
        int equipaRemover = Equipa(codigo);
        if (equipaRemover == -1) {

        } else

        this.equipasEscaloes.remove(equipaRemover);
    }

    public void editEquipa(int codigo, Equipas equipasEscaloes) {
        int equipaRemover = Equipa(codigo);
        if (equipaRemover == -1) {

        } else

        this.equipasEscaloes.set(equipaRemover, equipasEscaloes);
    }

    public int Equipa(int codigo) {
        for (int i = 0; i < equipasEscaloes.size(); i++) {
            if (equipasEscaloes.get(i).getcodigoIdentificador() == codigo)
                return i;
        }
        return -1;
    }
    
	//numero de jogadores e treinadores no clube
	public void numeroJogadores(Jogadores jogadores) {
		
	}
	
	public void numeroTreinadores(Treinadores Treinadores) {
		
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Clubes [codigoIdentificador=" + codigoIdentificador + ", nome=" + nome + ", dataFundacao=" + dataFundacao
				+ ", corEquipamento=" + corEquipamento + ", contacto=" + contacto + ", email=" + email + ", morada="
				+ morada + ", equipasEscaloes=" + equipasEscaloes + "]";
	}

    // ----> equals()
}