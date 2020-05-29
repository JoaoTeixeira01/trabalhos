package projeto;

import java.util.Date;

public class Jogadores extends Equipas{
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int cartaoCidadao;
	private String nome;
	private Date dataNascimento;
	private int contacto;
	private String email;
	private String posicao;
	private boolean pePreferido;

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
	
	public String getPosicao() {
		return posicao;
	}
	
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	public boolean isPePreferido() {
		return pePreferido;
	}
	
	public void setPePreferido(boolean pePreferido) {
		this.pePreferido = pePreferido;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================
   
    // CONSTRUTOR DEFAULT

	public Jogadores() {
		
	}

    // CONSTRUTOR COM PAR�METROS

	public Jogadores(int cartaoCidadao, String nome, Date dataNascimento, int contacto, String email, String posicao,
			boolean pePreferido) {
		super();
		this.cartaoCidadao = cartaoCidadao;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.contacto = contacto;
		this.email = email;
		this.posicao = posicao;
		this.pePreferido = pePreferido;
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	

    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Jogadores [cartaoCidadao=" + cartaoCidadao + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", contacto=" + contacto + ", email=" + email + ", posicao=" + posicao + ", pePreferido="
				+ pePreferido + "]";
	}

    // ----> equals()
}