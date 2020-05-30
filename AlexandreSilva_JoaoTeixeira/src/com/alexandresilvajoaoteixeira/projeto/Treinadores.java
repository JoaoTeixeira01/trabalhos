package com.alexandresilvajoaoteixeira.projeto;

import java.util.Date;

/**
 * A class <strong>Treinadores</strong> disponibliza um conjunto de atributos
 * referentes a cada Treinador.
 * 
 * A class é constituida por 5 atributos referentes a cada Treinador
 * 
 * <pre>
 * {@code int cartaoCidadao
 * String nome
 * Date dataNascimento
 * int contacto
 * String email
 * }
 * </pre>
 * @author Alexandre Silva e João Teixeira
 * @version 1.0
 * @since 31/05/2020
 *
 */


public class Treinadores extends Equipas{
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int cartaoCidadao;
	private String nome;
	private Date dataNascimento;
	private int contacto;
	private String email;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getCartaoCidadao() {
		return cartaoCidadao;
	}
	
	public void setCartaoCidadao(int cartaoCidadao) {
		this.cartaoCidadao = cartaoCidadao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================
   
    // CONSTRUTOR DEFAULT

	public Treinadores() {
		
	}

    // CONSTRUTOR COM PARÂMETROS

	public Treinadores(int cartaoCidadao, String nome, Date dataNascimento, int contacto, String email) {
		super();
		this.cartaoCidadao = cartaoCidadao;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.contacto = contacto;
		this.email = email;
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Treinadores [cartaoCidadao=" + cartaoCidadao + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", contacto=" + contacto + ", email=" + email + "]";
	}

    // ----> equals()
}