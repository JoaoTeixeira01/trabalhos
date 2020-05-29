package projeto;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class Clubes extends Competicoes{
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codigoIdent;
	private String nome;
	private Date dataFundacao;
	private String corEquipamento;
	private int contacto;
	private String email;
	private String morada;
	private List<Equipas> equipasEscaloes;
	private List<Equipas> equipa = new ArrayList<Equipas>();
	
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getCodigoIdent() {
		return codigoIdent;
	}
	
	public void setCodigoIdent(int codigoIdent) {
		this.codigoIdent = codigoIdent;
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

	public void addequipa(Equipas equipa) {
		this.equipa.add(equipa);
	}
    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================
   
    // CONSTRUTOR DEFAULT

	public Clubes() {
		
	}

    // CONSTRUTOR COM PARÂMETROS

	public Clubes(int codigoIdent, String nome, Date dataFundacao, String corEquipamento, int contacto, String email,
			String morada) {
		super();
		this.codigoIdent = codigoIdent;
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

	public void addEquipa(Equipas equipasEscaloes) {
		this.equipasEscaloes.add(equipasEscaloes);
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Clubes [codigoIdent=" + codigoIdent + ", nome=" + nome + ", dataFundacao=" + dataFundacao
				+ ", corEquipamento=" + corEquipamento + ", contacto=" + contacto + ", email=" + email + ", morada="
				+ morada + ", equipasEscaloes=" + equipasEscaloes + "]";
	}

    // ----> equals()
}