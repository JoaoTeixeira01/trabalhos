package projeto;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Competicoes competicao = new Competicoes();
		competicao.setCodigoIdentificador(333666999);
		competicao.setNome("Futebol Distrital de Santarém");
		competicao.setDataFim(new Date());
		competicao.setDataInicio(new Date());
		System.out.println(competicao);
		
		Equipas equipa = new Equipas();
		equipa.setCodigoIdentificador(555777111);
		equipa.setNome("GG");
		equipa.setEscalao("Benjamin");
		System.out.println(equipa);
		
	}

}