package com.alexandresilvajoaoteixeira.projeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A class <strong>Jogos</strong> disponibliza um conjunto de atributos
 * referentes a cada Jogo.
 * 
 * A class é constituida por 7 atributos referentes a cada Jogo
 * 
 * <pre>
 * {@code String equipaVisitada
 * String equipaVisitante
 * int golosEquipaVisitada
 * int golosEquipaVisitante
 * Date dataJogo
 * int jornada
 * List<Arbitros> arbitros = new ArrayList<Arbitros>()
 * }
 * </pre>
 * @author Alexandre Silva e João Teixeira
 * @version 1.0
 * @since 31/05/2020
 *
 */

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
	private List<Arbitros> arbitros = new ArrayList<Arbitros>();

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
		
	}

    // CONSTRUTOR COM PARÂMETROS

	public Jogos(String equipaVisitada, String equipaVisitante, int golosEquipaVisitada, int golosEquipaVisitante,
			Date dataJogo, int jornada) {
		super();
		this.equipaVisitada = equipaVisitada;
		this.equipaVisitante = equipaVisitante;
		this.golosEquipaVisitada = golosEquipaVisitada;
		this.golosEquipaVisitante = golosEquipaVisitante;
		this.dataJogo = dataJogo;
		this.jornada = jornada;
		this.arbitros = new ArrayList<Arbitros>();
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void addArbitro(Arbitros arbitros) {
		this.arbitros.add(arbitros);
	}
	
	public void removeArbitro(int codigo) {
        int arbitroRemover = Arbitro(codigo);
        if (arbitroRemover == -1) {

        } else

        this.arbitros.remove(arbitroRemover);
    }

    public void editJogo(int codigo, Arbitros arbitros) {
        int arbitroRemover = Arbitro(codigo);
        if (arbitroRemover == -1) {

        } else

        this.arbitros.set(arbitroRemover, arbitros);
    }

    public int Arbitro(int codigo) {
        for (int i = 0; i < arbitros.size(); i++) {
            if (arbitros.get(i).getCartaoCidadao() == codigo)
                return i;
        }
        return -1;
    }

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