import com.alexandresilvajoaoteixeira.projeto.*;

import java.time.LocalDate;
import java.util.Date;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Competicoes competicao = new Competicoes();
		competicao.setcodigoIdentificador(333666999);
		competicao.setNome("Futebol Distrital de Santarém");
		competicao.setDataFim(LocalDate.of(2020, 10, 20));
		competicao.setDataInicio(LocalDate.of(2020, 1, 20));
		System.out.println(competicao);
		//--------------------------------------
		//Arbitros
		Arbitros arbitro = new Arbitros();
		arbitro.setCartaoCidadao(232912985);
		arbitro.setContacto(912323233);
		arbitro.setDataNascimento(LocalDate.of(1990, 5, 10));
		arbitro.setEmail("aaaa@gmail.com");
		arbitro.setNome("José");
		//--------------------------------------		
		//Jogadores
		Jogadores jogador1 = new Jogadores();
		jogador1.setCartaoCidadao(253214232);
		jogador1.setContacto(935654554);
		jogador1.setNome("Alex");
		jogador1.setEmail("bbbb@gmail.com");
		jogador1.setPosicao("Médio Ofensivo");
		jogador1.setPePreferido(true);
		jogador1.addJogadores(jogador1);
		System.out.println(jogador1);
		
		Jogadores jogador2 = new Jogadores();
		jogador2.setCartaoCidadao(253214237);
		jogador2.setContacto(935654552);
		jogador2.setNome("João");
		jogador2.setEmail("cccc@gmail.com");
		jogador2.setPosicao("Médio");
		jogador2.setPePreferido(false);
		jogador2.addJogadores(jogador2);
		System.out.println(jogador2);
		
		//--------------------------------------
		//treinadores
		Treinadores treinador1 = new Treinadores();
		treinador1.setCartaoCidadao(252326211);
		treinador1.setNome("Asdrubal");
		treinador1.setContacto(960000000);
		treinador1.setEmail("Asdrubal@gmail.com");
		treinador1.addTreinadores(treinador1);
		System.out.println(treinador1);

		Treinadores treinador2 = new Treinadores();
		treinador2.setCartaoCidadao(252326211);
		treinador2.setNome("Jonh");
		treinador2.setContacto(961000000);
		treinador2.setEmail("Jonh@gmail.com");
		treinador2.addTreinadores(treinador2);
		System.out.println(treinador2);

		Treinadores treinador3 = new Treinadores();
		treinador3.setCartaoCidadao(252326211);
		treinador3.setNome("Tomas");
		treinador3.setContacto(963000000);
		treinador3.setEmail("Tomas@gmail.com");
		treinador3.addTreinadores(treinador3);
		System.out.println(treinador3);

		
		//--------------------------------------
		//Clubes 
		Clubes clube1 = new Clubes();
		clube1.setcodigoIdentificador(11233212);
		clube1.setNome("FC Vermelho");
		clube1.setContacto(912563348);
		clube1.setCorEquipamento("vermelho");
		clube1.setDataFundacao(LocalDate.of(2020, 1, 20);
		clube1.setEmail("Vermelho@gmail.com");
		clube1.setMorada("Rua dos Vermelhos");
		System.out.println(clube1);
		//--------------------------------------
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
		//--------------------------------------
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
		//Adiciona as equipas à competição
		competicao.addEquipa(equipa1);
		competicao.addEquipa(equipa2);
		//Remove a equipa da competição
		competicao.removeEquipa(3);
		//Adiciona um Jogo
		competicao.addJogo(jogo);
		//Lista de todas as equipas na competição
		competicao.numeroEquipas(equipa1);
		//Adiciona um arbitro
		jogo.addArbitro(arbitro);
		//Adiciona os Jogadores à equipa
		equipa1.addJogadores(jogador1);
		equipa2.addJogadores(jogador2);
		//Remove um Jogador
		equipa1.removeJogadores(253214232);
		//Adiciona os treinadores às equipas
		equipa1.addTreinadores(treinador1);
		equipa2.addTreinadores(treinador2);
		equipa3.addTreinadores(treinador3);
		//Remove um treinador
		equipa3.removeTreinadores(252326211);
		//Lista dos jogadores de um clube
		clube1.numeroJogadores(jogador1);
		//Lista dos Treinadores de um clube
		clube1.numeroTreinadores(treinador1);
		//Mostra as informações do Jogador
		jogador1.Jogadorinfo();
		//Mostra as informações do Treinador
		treinador1.Treinadorinfo();
		//Mostra as informações do Arbitro
		arbitro.Arbitroinfo();
		
	}
}