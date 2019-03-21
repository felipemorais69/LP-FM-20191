package Automovel;
import java.util.HashMap;
import java.util.Scanner;


public class ApplicationEstruturada {
	public static void main(String[] args) {
		HashMap<String, Object> automovel = new HashMap<>();
		geradorDicionario(automovel);
		System.out.println("O veiculo possui " + automovel.get("qnt_rodas")+" rodas!!");
	
	}
	private static void geradorDicionario (HashMap<String, Object> automovel) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o fabricante do automovel: ");
		automovel.put("fabricante", scanner.nextLine());
		System.out.print("Digite o modelo do automovel: ");
		automovel.put("modelo_automovel", scanner.nextLine());
		System.out.print("Digite a quantidade de portas do automovel: ");
		automovel.put("qnt_portas", scanner.nextLine());
		System.out.print("Digite a cor do automovel: ");
		automovel.put("cor_automovel", scanner.nextLine());
		System.out.print("Digite o combustivel usado pelo automovel: ");
		automovel.put("combustivel", scanner.nextLine());
		System.out.print("Digite a quantidade de rodas do automovel: ");
		automovel.put("qnt_rodas", scanner.nextInt());
		scanner.close();
	}

}
