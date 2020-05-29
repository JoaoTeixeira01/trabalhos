import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Competicoes {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int cod_Identificador;
	private String nome;
	private Date dataInicio;
	private Date dataFim;
	private List<Equipas>equipasEscalao;
	private List<Clubes>equipasParticipantes;
	private List<Jogos>jogos;
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


	public List<Clubes> getEquipasParticipantes() {
		return equipasParticipantes;
	}


	public void setEquipasParticipantes(List<Clubes> equipasParticipantes) {
		this.equipasParticipantes = equipasParticipantes;
	}


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
		super();
	}
	
    // CONSTRUTOR COM PARÂMETROS

	public Competicoes(int cod_Identificador, String nome, Date dataInicio, Date dataFim) {
		super();
		this.cod_Identificador = cod_Identificador;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.equipasEscalao = new ArrayList<Equipas>();
		this.equipasParticipantes = new ArrayList<Clubes>();
		this.jogos = new ArrayList<Jogos>();
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
		return "Competicoes [cod_Identificador=" + cod_Identificador + ", nome=" + nome + ", dataInicio=" + dataInicio
				+ ", dataFim=" + dataFim + ", equipasEscalao=" + equipasEscalao + ", equipasParticipantes="
				+ equipasParticipantes + ", jogos=" + jogos + "]";
	}

    // ----> equals()
}
