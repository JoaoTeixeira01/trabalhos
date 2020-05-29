import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Clubes {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	
	private int cod_Identificador;
	private String nome;
	private Date dataDeFundacao;
	private String corDoEquipamento;
	private int contacto;
	private String email;
	private String morada;
	private List<Equipas>equipaEscaloes;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getCod_Identificador() {
		return cod_Identificador;
	}
	public void setCod_Identificador(int cod_Identificador) {
		this.cod_Identificador = cod_Identificador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeFundacao() {
		return dataDeFundacao;
	}
	public void setDataDeFundacao(Date dataDeFundacao) {
		this.dataDeFundacao = dataDeFundacao;
	}
	public String getCorDoEquipamento() {
		return corDoEquipamento;
	}
	public void setCorDoEquipamento(String corDoEquipamento) {
		this.corDoEquipamento = corDoEquipamento;
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
	public List<Equipas> getEquipaEscaloes() {
		return equipaEscaloes;
	}
	public void setEquipaEscaloes(List<Equipas> equipaEscaloes) {
		this.equipaEscaloes = equipaEscaloes;
	}
    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================
  
   
    // CONSTRUTOR DEFAULT

	public Clubes() {
		super();
	}

    // CONSTRUTOR COM PARÂMETROS

	public Clubes(int cod_Identificador, String nome, Date dataDeFundacao, String corDoEquipamento, int contacto,
			String email, String morada) {
		super();
		this.cod_Identificador = cod_Identificador;
		this.nome = nome;
		this.dataDeFundacao = dataDeFundacao;
		this.corDoEquipamento = corDoEquipamento;
		this.contacto = contacto;
		this.email = email;
		this.morada = morada;
		this.equipaEscaloes = new ArrayList<Equipas>();
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
		return "Clubes [cod_Identificador=" + cod_Identificador + ", nome=" + nome + ", dataDeFundacao="
				+ dataDeFundacao + ", corDoEquipamento=" + corDoEquipamento + ", contacto=" + contacto + ", email="
				+ email + ", morada=" + morada + ", equipaEscaloes=" + equipaEscaloes + "]";
	}

    // ----> equals()
}
