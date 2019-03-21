package Automovel;
import java.util.Scanner;
import Automovel.Automovel;
//Application feita em OO utilizando o objeto Automovel



public class ApplicationOO {
	public static void main(String[] args) {
		Automovel automovel = criarObjetoAutomovel();
		automovel.imprimirQntRodas();
	}
	
	private static Automovel criarObjetoAutomovel() {

		Automovel automovel = new Automovel();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o fabricante do automovel: ");
		automovel.setFabricante(scanner.nextLine());
		System.out.print("Digite o modelo do automovel: ");
		automovel.setModelo_carro(scanner.nextLine());
		System.out.print("Digite a quantidade de portas do automovel: ");
		automovel.setQnt_portas(scanner.nextInt());
		System.out.print("Digite a cor do automovel: ");
		automovel.setCor_carro(scanner.nextLine());
		System.out.print("Digite o combustivel usado pelo automovel: ");
		automovel.setCombustivel(scanner.nextLine());
		System.out.print("Digite a quantidade de rodas do automovel: ");
		automovel.setQnt_rodas(scanner.nextInt());
		
		scanner.close();
		return automovel;
	}
}
