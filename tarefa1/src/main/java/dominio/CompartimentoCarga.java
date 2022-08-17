package dominio;


public class CompartimentoCarga extends Compartimento<Float> {
	
	public CompartimentoCarga() {
		super(1000f, 0f);
	}
	
	public boolean carregarCarga(float valor) {
		
		if((this.getQntAtual() + valor) > this.getCapacidadeTotal() || valor < 0) {
			
			return false;
			
		} else {
			
			setQntAtual(getQntAtual() + valor);
			return true;
			
		}
	}
	
	public boolean descarregarCarga(float valor) {
		if(valor > this.getQntAtual() || valor < 0) {
			
			return false;
			
		} else {
			
			setQntAtual(getQntAtual() - valor);
			return true;
			
		}
	}
	
}
