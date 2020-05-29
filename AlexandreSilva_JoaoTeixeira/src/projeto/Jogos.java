package projeto;

import java.util.Date;

public class Jogos extends Competicoes{
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String equipaVisitada;
	private String equipaVisitante;
	private int golosEquipaVisitada;
	private int golosEquipaVisitante;
	private Date dataJogo;
	private int jornada;
	private String arbitros;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public String getEquipaVisitada() {
		return equipaVisitada;
	}
	
	public void setEquipaVisitada(String equipaVisitada) {
		this.equipaVisitada = equipaVisitada;
	}
	
	public String getEquipaVisitante() {
		return equipaVisitante;
	}
	
	public void setEquipaVisitante(String equipaVisitante) {
		this.equipaVisitante = equipaVisitante;
	}
	
	public int getGolosEquipaVisitada() {
		return golosEquipaVisitada;
	}
	
	public void setGolosEquipaVisitada(int golosEquipaVisitada) {
		this.golosEquipaVisitada = golosEquipaVisitada;
	}
	
	public int getGolosEquipaVisitante() {
		return golosEquipaVisitante;
	}
	
	public void setGolosEquipaVisitante(int golosEquipaVisitante) {
		this.golosEquipaVisitante = golosEquipaVisitante;
	}
	
	public Date getDataJogo() {
		return dataJogo;
	}
	
	public void setDataJogo(Date dataJogo) {
		this.dataJogo = dataJogo;
	}
	
	public int getJornada() {
		return jornada;
	}
	
	public void setJornada(int jornada) {
		this.jornada = jornada;
	}
	
	public String getArbitros() {
		return arbitros;
	}
	
	public void setArbitros(String arbitros) {
		this.arbitros = arbitros;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================
   
    // CONSTRUTOR DEFAULT

	public Jogos() {
		
	}

    // CONSTRUTOR COM PARÂMETROS

	public Jogos(String equipaVisitada, String equipaVisitante, int golosEquipaVisitada, int golosEquipaVisitante,
			Date dataJogo, int jornada, String arbitros) {
		super();
		this.equipaVisitada = equipaVisitada;
		this.equipaVisitante = equipaVisitante;
		this.golosEquipaVisitada = golosEquipaVisitada;
		this.golosEquipaVisitante = golosEquipaVisitante;
		this.dataJogo = dataJogo;
		this.jornada = jornada;
		this.arbitros = arbitros;
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
		return "Jogos [equipaVisitada=" + equipaVisitada + ", equipaVisitante=" + equipaVisitante
				+ ", golosEquipaVisitada=" + golosEquipaVisitada + ", golosEquipaVisitante=" + golosEquipaVisitante
				+ ", dataJogo=" + dataJogo + ", jornada=" + jornada + ", arbitros=" + arbitros + "]";
	}

    // ----> equals()
}