package inf300.control;

import java.util.Date;
import java.util.List;

public class OrderTO {

	private List<Integer>	bIds;
	private int	customerId;
	private int	id;
	private List<Integer>	qty; 
	private Date	shipDate;
	private String	status;
	
	public OrderTO() {}
	
	public List<Integer> getbIds(){
		return this.bIds;
	}
	
	public int getCustomerId(){
		return this.customerId;
	}
	
	public int getId(){
		return this.id;
	}
	
	public List<Integer> getQty(){
		return this.qty;
	}
	
	public Date  getShipDate(){
		return this.shipDate;
	} 
	
	public String getStatus(){
		return this.status;
	}
	
	
	public void setbIds(List<Integer> bIds){
		this.bIds = bIds;
	}
	
	public void setCustomerId(int customerId){
		this.customerId = customerId;
	}
	
	public void setId(int id) {
		this.id = id;
	} 
	
	public void setQty(List<Integer> qty){
		this.qty = qty;
	} 
	
	public void setShipDate(Date shipDate){
		this.shipDate = shipDate;
	} 
	
	public void setStatus(String status){
		this.status = status;
	} 
	
}
