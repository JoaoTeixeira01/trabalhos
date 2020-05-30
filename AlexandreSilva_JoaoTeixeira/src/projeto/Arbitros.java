package projeto;

import java.util.Date;

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