import java.util.Scanner;


public class Jokenpo_game {


		private static int placarJogador = 0;
		private static int placarComputador = 0;
		

		private static int escolhaJogador;
		private static int escolhaComputador;
		

		

		public static void main(String[] args) { 

		int decisao = 1;
		while(decisao == 1) {
		int rodada = 0;
		Scanner input1 = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println(":::JOKENPO");
		System.out.println("Olá, jogador, deseja jogar quantas rodadas?");
		rodada = input1.nextInt();
		
		
		
		
				for(int i = 1; i<= rodada; ++i) {
					escolhaComputador = (int) (Math.random()*3)+1;
					rotuloEscolhaJogador();
					escolhaJogador = input1.nextInt();
					verificaResultado();
					exibePlacar();
			}
		System.out.println("-------------------------------------");
		System.out.println("Deseja jogar novamente? (1)Sim (0)Não");
		decisao = input1.nextInt();
		
		}
		
		
	}

		public static void verificaResultado() {
			
			switch (escolhaJogador){
			case 1: 
				switch (escolhaComputador){
					case 1:
						System.out.println("O adversário escolheu:" + escolhaComputador);
						System.out.println("Empate");
						break;
					case 2:
						System.out.println("O adversário escolheu:" + escolhaComputador);
						System.out.println("O adversário ganhou");
						placarComputador ++;
						break;
					case 3:
						System.out.println("O adversário escolheu:" + escolhaComputador);
						System.out.println("Você ganhou");
						placarJogador ++;
						break;
						
				} break;
			case 2:
				switch(escolhaComputador) {
					case 1:
						System.out.println("O adversário escolheu:" + escolhaComputador);
						System.out.println("Você ganhou");
						placarJogador ++;
						break;
					case 2:
						System.out.println("O adversário escolheu:" + escolhaComputador);
						System.out.println(" Empatou");
						break;
					case 3:
						System.out.println("O adversário escolheu:" + escolhaComputador);
						System.out.println("O adversário ganhou");
						placarComputador ++;
						break;
					
				} break;
			case 3:
				switch(escolhaComputador) {
						case 1:
							System.out.println("O adversário escolheu:" + escolhaComputador);
							System.out.println("O adversário ganhou");
							placarComputador ++;
							break;
						case 2:
							System.out.println("O adversário escolheu:" + escolhaComputador);
							System.out.println("Você ganhou");
							placarJogador ++;
							break;
						case 3:
							System.out.println("O adversário escolheu:" + escolhaComputador);
							System.out.println("Empate");
							break;
						
				} break;
			default: 
				System.out.println ("Digite uma das alternativas indicadas");
		}
			
			}

		public static void exibePlacar() {

			System.out.println("-------------------------------------");
			System.out.println("Seu placar foi : " + placarJogador);
			System.out.println("O placar do adversário : " + placarComputador);
		}
		

		public static void rotuloEscolhaJogador() {
			System.out.println("-------------------------------------");
			System.out.println("::: Jogador, insira:");
			System.out.println("::: 1 -Pedra");
			System.out.println("::: 2 - Papel");
			System.out.println("::: 3 - tesoura");
			System.out.println(":::Escolha uma opção");
			

		}
	}
