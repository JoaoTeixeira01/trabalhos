package com.alexandresilvajoaoteixeira.projeto;


import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Competicoes competicao = new Competicoes();
		competicao.setcodigoIdentificador(333666999);
		competicao.setNome("Futebol Distrital de Santarém");
		competicao.setDataFim(new Date());
		competicao.setDataInicio(new Date());
		System.out.println(competicao);
		
		
		//Arbitros
		Arbitros arbitro = new Arbitros();
		arbitro.setCartaoCidadao(232912985);
		arbitro.setContacto(912323233);
		arbitro.setDataNascimento(new Date());
		arbitro.setEmail("aaaa@gmail.com");
		arbitro.setNome("José");
		
		//Clubes 
		Clubes clube = new Clubes();
		clube.setcodigoIdentificador(11233212);
		clube.setNome("FC Vermelho");
		clube.setContacto(912563348);
		clube.setCorEquipamento("vermelho");
		clube.setDataFundacao(new Date());
		clube.setEmail("Vermelho@gmail.com");
		clube.setMorada("Rua dos Vermelhos");
		System.out.println(clube);
		
		//Equipas
		Equipas equipa1 = new Equipas();
		equipa1.setcodigoIdentificador(555777111);
		equipa1.setNome("FC Vermelhos");
		equipa1.setEscalao("Benjamin");
		System.out.println(equipa1);

		Equipas equipa2 = new Equipas();
		equipa2.setcodigoIdentificador(666888222);
		equipa2.setNome("FC Azuis");
		equipa2.setEscalao("Benjamin");
		System.out.println(equipa2);
		
		Equipas equipa3 = new Equipas();
		equipa3.setcodigoIdentificador(666888222);
		equipa3.setNome("FC Verdes");
		equipa3.setEscalao("Benjamin");
		System.out.println(equipa3);
		
		//Jogos
		Jogos jogo = new Jogos();
		jogo.setEquipaVisitada("FC Vermelhos");
		jogo.setEquipaVisitante("FC Azuis");
		jogo.setGolosEquipaVisitada(2);
		jogo.setGolosEquipaVisitante(3);
		jogo.setJornada(1);
		jogo.addArbitro(arbitro);
		
		System.out.println(jogo);
		
		//add's e remove's
		competicao.addEquipa(equipa1);
		competicao.addEquipa(equipa2);
		competicao.removeEquipa(equipa3);		
		competicao.addJogo(jogo);
	}
}