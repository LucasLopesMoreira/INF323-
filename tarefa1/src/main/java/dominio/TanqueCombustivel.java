package dominio;

import java.math.BigDecimal;

public class TanqueCombustivel extends Compartimento<BigDecimal> implements Tanque {
	
	public TanqueCombustivel() {
		
		super(new BigDecimal(1000), new BigDecimal(0));
		
	}
	
	public boolean abastecer(double valor) {
		
		if (valor < 0) {
			return false;
		}
		if ((valor + getQntAtual().doubleValue()) >= getCapacidadeTotal().doubleValue()) {
			setQntAtual(new BigDecimal(valor + getQntAtual().doubleValue()));
			return false;
		}
		setQntAtual(new BigDecimal(valor + getQntAtual().doubleValue()));
		return true;
		
	}
	
	public boolean consumir(double valor) {
		
		if (valor < 0) {
			return false;
		}
		if ((getQntAtual().doubleValue() - valor) >= 0) {
			setQntAtual(new BigDecimal(getQntAtual().doubleValue() - valor));
			return true;
		}
		setQntAtual(new BigDecimal(0));
		return false;
		
	}
	

}
