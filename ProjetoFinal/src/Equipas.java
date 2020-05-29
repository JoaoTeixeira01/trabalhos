import java.util.ArrayList;
import java.util.List;

public class Equipas extends Clubes{
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int cod_Identificador;
	private String nome;
	private String escalao;
	private List<Jogadores>jogadores;
	private List<Treinadores>treinadores;

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
	public String getEscalao() {
		return escalao;
	}
	public void setEscalao(String escalao) {
		this.escalao = escalao;
	}
	public List<Jogadores> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogadores> jogadores) {
		this.jogadores = jogadores;
	}
	public List<Treinadores> getTreinadores() {
		return treinadores;
	}
	public void setTreinadores(List<Treinadores> treinadores) {
		this.treinadores = treinadores;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

	public Equipas() {
		super();
	}


    // CONSTRUTOR COM PARÂMETROS

	public Equipas(int cod_Identificador, String nome, String escalao) {
		super();
		this.cod_Identificador = cod_Identificador;
		this.nome = nome;
		this.escalao = escalao;
		this.jogadores = new ArrayList<Jogadores>();
		this.treinadores = new ArrayList<Treinadores>();
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
		return "Equipas [cod_Identificador=" + cod_Identificador + ", nome=" + nome + ", escalao=" + escalao
				+ ", jogadores=" + jogadores + ", treinadores=" + treinadores + "]";
	}
    // ----> equals()
}
