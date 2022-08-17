package inf300.control;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path(value="buy")
@Consumes(value="application/json")
@Produces(value="application/json")
public class BuyController {
	
	public BuyController() {}
	
	@GET
	@Path(value="/cart/{id}")
	public CartTO getCart(@PathParam(value="id") int idCart){
		return new CartTO(idCart);
	}
	
	@GET
	 @Path(value="/order/{id}")
	public OrderTO getOrder(@PathParam(value="id") int id){
		OrderTO order = new OrderTO();
		order.setId(id);
		return order ;	
	}
	
	@POST
	@Path(value="/cart/create")
	public CartTO createCart(){
		return new CartTO();	
	}
	
	@PUT
	@Path(value="/cart/update")
	public CartTO updateCart(CartTO cart){
		return cart;
	}
	
	@POST
	@Path(value="/create/")
	public OrderTO confirmBuy(BuyTO buy) {
		OrderTO order = new  OrderTO();
		order.setStatus(buy.getShipping());
		return order;		
	}
	
	@PUT
	@Path(value="/order/{id:[0-9]{1,9}}/status/{status: (PROCESSING|SHIPPED|PENDING|DENIED|CANCELED)}")
	public OrderTO updateOrder(@PathParam(value="id") int idOrder, @PathParam(value="status") String newStatus){
		OrderTO order = new  OrderTO();
		order.setId(idOrder);
		order.setStatus(newStatus);
		return order;
	}
	
	@PUT
	@Path(value="/order/cancel")
	public OrderTO cancelOrder(@DefaultValue(value="1") @QueryParam(value="id") int id1){
		OrderTO order = new  OrderTO();
		order.setId(id1);
		return order;
	}


}
