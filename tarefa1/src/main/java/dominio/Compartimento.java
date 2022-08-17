package dominio;

public abstract class Compartimento<T extends Number> {
	
	private final T capacidadeTotal;
	private T qntAtual;
	
	public Compartimento(T capacidadeTotal, T qntAtual){
		
		this.capacidadeTotal = capacidadeTotal;
		this.qntAtual = qntAtual;
		
				
	}
	
	public T getCapacidadeTotal() {
		
		return capacidadeTotal;
		
	}
	
	public T getQntAtual() {
		
		return qntAtual;
		
	}
	
	protected void setQntAtual(T qntAtual) {
		if (qntAtual.doubleValue() >= this.capacidadeTotal.doubleValue()) {
			
			this.qntAtual = this.capacidadeTotal;
			
		} 
		else {
			
			this.qntAtual = qntAtual;
			
		}
	}
	
	
}
