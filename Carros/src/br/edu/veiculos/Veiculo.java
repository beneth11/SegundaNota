package br.edu.veiculos;

public class Veiculo {
	protected String marca;
	 double capTanqComb;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getCapTanqComb() {
		return capTanqComb;
	}
	public void setCapTanqComb(double capTanqComb) {
		this.capTanqComb = capTanqComb;
	}
    
	protected void acelerar() {
		System.out.println("Acelerando");
	}
	protected void freiar() {
		System.out.println("Freiando");
	}
	protected void ligar() {
		System.out.println("Ligando");
	}
}
