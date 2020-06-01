package com.alexandresilvajoaoteixeira.projeto;

import java.util.Date;

/**
 * A class <strong>Arbitros</strong> disponibliza um conjunto de atributos
 * referentes a cada arbitro.
 * 
 * A class é constituida por 5 atributos referentes a cada arbitro
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

public class Arbitros extends Jogos{
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

	public Arbitros() {
		
	}

    // CONSTRUTOR COM PARÂMETROS

	public Arbitros(int cartaoCidadao, String nome, Date dataNascimento, int contacto, String email) {
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

	public void Arbitroinfo() {
		System.out.println(this.cartaoCidadao);
		System.out.println(this.nome);
		System.out.println(this.dataNascimento);
		System.out.println(this.contacto);
		System.out.println(this.email);
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Arbitros [cartaoCidadao=" + cartaoCidadao + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", contacto=" + contacto + ", email=" + email + "]";
	}

    // ----> equals()
}