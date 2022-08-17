package dominio;

import java.util.ArrayList;
import java.util.List;

public class Aviao {

	private final TanqueCombustivel tanqueCombustivel;
	private final CompartimentoCarga compartimentoCarga;
	private final List<Turbina> lsTurbinas;
	
	
	public Aviao() {
		lsTurbinas = new ArrayList<Turbina>();
		
		lsTurbinas.add(new Turbina());
		lsTurbinas.add(new Turbina());
		
		tanqueCombustivel = new TanqueCombustivel();
		compartimentoCarga = new CompartimentoCarga();
	}
		
	public void ligarTurbinas() {
		if(tanqueCombustivel.getQntAtual().doubleValue() > 0) {
			for (Turbina turbina : lsTurbinas) {
				turbina.ligar();
			}
		}
		
		
	}
	
	public void desligarTurbinas() {
		for (Turbina turbina : lsTurbinas) {
			turbina.desligar();
		}
		
	}
	
	public boolean isTurbinasLigadas() {
		boolean flag = true;
		
		for (Turbina turbina : lsTurbinas) {
			if (!turbina.isLigado()) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public int nivelPotenciaTurbinas() {
		
		int nive1 = lsTurbinas.get(0).getNivelPotencia();
		int nivel = lsTurbinas.get(1).getNivelPotencia();
		return Math.max(nive1, nivel);
		
	}
	
	public void aumentarPotenciaTurbinas() {

		for (Turbina turbina : lsTurbinas) {
			try {
				turbina.aumentarPotencia(5);
			} catch (DesligadoException e) {
				
			}
		}

	}
	
	public void diminuirPotenciaTurbinas() {
		for (Turbina turbina : lsTurbinas) {
			try {
				turbina.diminuirPotencia(5);
			} catch (DesligadoException e) {
				
			}
		}
		
	}
	
	public void abastecer(double value) {
		tanqueCombustivel.abastecer(value);

	}
	
	public void consumir(double value) {
		
		tanqueCombustivel.consumir(value);
		
	}
	public double getCapacidadeTotalCombustivel() {
		
		return tanqueCombustivel.getCapacidadeTotal().doubleValue();
		
	}
	
	public double getQntdAtualCombustivel() {
		
		return tanqueCombustivel.getQntAtual().doubleValue();
		
	}
	public void carregarCarga(int value) {
		
		compartimentoCarga.carregarCarga(value);
		
	}
	public void descarregarCarga(int value) {
		
		compartimentoCarga.descarregarCarga(value);
		
		
	}
	public float getCapacidadeTotalCarga() {
		
		return compartimentoCarga.getCapacidadeTotal();
		
	}
	public float getQntdAtualCarga() {
		
		return compartimentoCarga.getQntAtual();
		
	}
}
