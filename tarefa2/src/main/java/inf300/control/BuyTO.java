package inf300.control;

import java.util.Date;

public class BuyTO {
	
	private int	addressId;
	private int	cartId;
	private Date	ccExpiry; 
	private String	ccName; 
	private long	ccNumber;
	private String	ccType;
	private String	comment;
	private int	customerId;
	private String	shipping;
	private Date	shippingDate;
	
	public BuyTO() {}
	
	public BuyTO(int addressId, int cartId, Date ccExpiry, String ccName, long ccNumber, String ccType, String comment,
			int customerId, String shipping, Date shippingDate) {
		
		this.addressId = addressId;
		this.cartId = cartId;
		this.ccExpiry = ccExpiry;
		this.ccName = ccName;
		this.ccNumber = ccNumber;
		this.ccType = ccType;
		this.comment = comment;
		this.customerId = customerId;
		this.shipping = shipping;
		this.shippingDate = shippingDate;
	}
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Date getCcExpiry() {
		return ccExpiry;
	}
	public void setCcExpiry(Date ccExpiry) {
		this.ccExpiry = ccExpiry;
	}
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public long getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(long ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCcType() {
		return ccType;
	}
	public void setCcType(String ccType) {
		this.ccType = ccType;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	public Date getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}
	
	

}
