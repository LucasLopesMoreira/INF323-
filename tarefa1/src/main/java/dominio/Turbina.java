package dominio;

public class Turbina extends Motor {
	
	private int nivelPotencia;
	
	public Turbina() {
		
		this.nivelPotencia = 0;
		
	}
	
	protected void ligar() {
		
		super.ligar();
		this.nivelPotencia = 5;
		
	}
	
	protected void desligar() {
		
		super.desligar();
		this.nivelPotencia = 0;
		
	}
	
	
	void aumentarPotencia(int x) throws DesligadoException {
		if (!isLigado()) {
			
			throw new DesligadoException("DesligadoException");
			
		} 
		if ( x < 0) {
			return;
		}
		nivelPotencia += x;
		if (nivelPotencia > 100) {
			nivelPotencia = 100;
		}
	}
	
	public void diminuirPotencia(int y) throws DesligadoException {
		if (!isLigado()) {
			
			throw new DesligadoException("DesligadoException");
			
		} 
		if ( y < 0) {
			return;
		}
		nivelPotencia -= y;
		if (nivelPotencia < 0) {
			nivelPotencia = 0;
		}
	}
	
	public int getNivelPotencia() {
		return this.nivelPotencia;
	}
	
}
