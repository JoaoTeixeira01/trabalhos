import java.util.Date;

public class Treinadores extends Equipas{
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int numCartaoCidadao;
	private String nome;
	private Date dataNascimento;
	private int contacto;
	private String email;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================


	public int getNumCartaoCidadao() {
		return numCartaoCidadao;
	}
	public void setNumCartaoCidadao(int numCartaoCidadao) {
		this.numCartaoCidadao = numCartaoCidadao;
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
		super();
	}

    // CONSTRUTOR COM PARÂMETROS


	public Treinadores(int numCartaoCidadao, String nome, Date dataNascimento, int contacto, String email) {
		super();
		this.numCartaoCidadao = numCartaoCidadao;
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
		return "Treinadores [numCartaoCidadao=" + numCartaoCidadao + ", nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", contacto=" + contacto + ", email=" + email + "]";
	}

    // ----> equals()
}
