package etec.com.rh;

public class Carro extends Auto {
	
	public String Compra() {
		
		this.setNomecarro("Porsche");
		this.setAno(1999);
		this.setMarca("Porsche");
		this.setValor(22000.50);
		
		return this.getNomecarro();
	}

}