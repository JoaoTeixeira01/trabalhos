import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jogos extends Competicoes{
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String equipaVisitada;
	private String equipaVisitante;
	private int golosEquipaVisitada;
	private int golosEquipaVisitante;
	private Date data;
	private int jornada;
	private List<Arbitros>arbitros;
	
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getJornada() {
		return jornada;
	}
	public void setJornada(int jornada) {
		this.jornada = jornada;
	}
	public List<Arbitros> getArbitros() {
		return arbitros;
	}
	public void setArbitros(List<Arbitros> arbitros) {
		this.arbitros = arbitros;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================
   
    // CONSTRUTOR DEFAULT

	public Jogos() {
		super();
	}

    // CONSTRUTOR COM PARÂMETROS

	public Jogos(String equipaVisitada, String equipaVisitante, int golosEquipaVisitada, int golosEquipaVisitante,
			Date data, int jornada) {
		super();
		this.equipaVisitada = equipaVisitada;
		this.equipaVisitante = equipaVisitante;
		this.golosEquipaVisitada = golosEquipaVisitada;
		this.golosEquipaVisitante = golosEquipaVisitante;
		this.data = data;
		this.jornada = jornada;
		this.arbitros = new ArrayList<Arbitros>();
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
				+ ", data=" + data + ", jornada=" + jornada + ", arbitros=" + arbitros + "]";
	}

    // ----> equals()
}
