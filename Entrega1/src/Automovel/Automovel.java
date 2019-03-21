package Automovel;

public class Automovel {
	private String fabricante;
	private String modelo_automovel;
	private int qnt_portas;
	private String cor_automovel;
	private String combustivel;
	private int qnt_rodas;
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo_carro() {
		return modelo_automovel;
	}
	public void setModelo_carro(String modelo_automovel) {
		this.modelo_automovel = modelo_automovel;
	}
	public int getQnt_portas() {
		return qnt_portas;
	}
	public void setQnt_portas(int qnt_portas) {
		this.qnt_portas = qnt_portas;
	}
	public String getCor_carro() {
		return cor_automovel;
	}
	public void setCor_carro(String cor_automovel) {
		this.cor_automovel = cor_automovel;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public int getQnt_rodas() {
		return qnt_rodas;
	}
	public void setQnt_rodas(int qnt_rodas) {
		this.qnt_rodas = qnt_rodas;
	}
	
	public void imprimirQntRodas(){
		System.out.println("O automovel possui " + getQnt_rodas()+" rodas");
	}






}


