package inf300.control;

import java.util.List;

import inf300.dominio.Cart;

public class CartTO {

	private List<Integer> bIds;
	private int	id;
	private List<Integer> qty;
	
	public CartTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Integer> getbIds() {
		return bIds;
	}

	public void setbIds(List<Integer> bIds) {
		this.bIds = bIds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Integer> getQty() {
		return qty;
	}

	public void setQty(List<Integer> qty) {
		this.qty = qty;
	}

	public CartTO(Cart cart) {
		
	} 
	
	CartTO(int id){
		this.id = id;
	}
	
	
}
