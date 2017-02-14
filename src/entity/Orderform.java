package entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Orderform entity. @author MyEclipse Persistence Tools
 */

public class Orderform implements java.io.Serializable {

	// Fields

	private String orderid;
	private Product product;
	private Customer customer;
	private String ordertype;
	private BigDecimal productnumber;
	private Timestamp createdate;
	private Timestamp completedate;
	private String deliveradress;
	private String consignee;
	private String consigneephone;
	private BigDecimal consigneecode;
	private BigDecimal receipt;
	private String operator;
	private String deliverystation;
	private String draweeadress;
	private String draweename;
	private String draweephone;
	private BigDecimal draweecode;
	private String customerid;
	private String remarks;
	private BigDecimal orderprice;
	private String state;

	// Constructors

	/** default constructor */
	public Orderform() {
	}

	/** minimal constructor */
	public Orderform(Timestamp createdate, Timestamp completedate,
			String deliveradress, String consignee, String consigneephone,
			String operator) {
		this.createdate = createdate;
		this.completedate = completedate;
		this.deliveradress = deliveradress;
		this.consignee = consignee;
		this.consigneephone = consigneephone;
		this.operator = operator;
	}

	/** full constructor */
	public Orderform(Product product, Customer customer, String ordertype,
			BigDecimal productnumber, Timestamp createdate,
			Timestamp completedate, String deliveradress, String consignee,
			String consigneephone, BigDecimal consigneecode,
			BigDecimal receipt, String operator, String deliverystation,
			String draweeadress, String draweename, String draweephone,
			BigDecimal draweecode, String customerid, String remarks,
			BigDecimal orderprice, String state) {
		this.product = product;
		this.customer = customer;
		this.ordertype = ordertype;
		this.productnumber = productnumber;
		this.createdate = createdate;
		this.completedate = completedate;
		this.deliveradress = deliveradress;
		this.consignee = consignee;
		this.consigneephone = consigneephone;
		this.consigneecode = consigneecode;
		this.receipt = receipt;
		this.operator = operator;
		this.deliverystation = deliverystation;
		this.draweeadress = draweeadress;
		this.draweename = draweename;
		this.draweephone = draweephone;
		this.draweecode = draweecode;
		this.customerid = customerid;
		this.remarks = remarks;
		this.orderprice = orderprice;
		this.state = state;
	}

	// Property accessors

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getOrdertype() {
		return this.ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public BigDecimal getProductnumber() {
		return this.productnumber;
	}

	public void setProductnumber(BigDecimal productnumber) {
		this.productnumber = productnumber;
	}

	public Timestamp getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public Timestamp getCompletedate() {
		return this.completedate;
	}

	public void setCompletedate(Timestamp completedate) {
		this.completedate = completedate;
	}

	public String getDeliveradress() {
		return this.deliveradress;
	}

	public void setDeliveradress(String deliveradress) {
		this.deliveradress = deliveradress;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getConsigneephone() {
		return this.consigneephone;
	}

	public void setConsigneephone(String consigneephone) {
		this.consigneephone = consigneephone;
	}

	public BigDecimal getConsigneecode() {
		return this.consigneecode;
	}

	public void setConsigneecode(BigDecimal consigneecode) {
		this.consigneecode = consigneecode;
	}

	public BigDecimal getReceipt() {
		return this.receipt;
	}

	public void setReceipt(BigDecimal receipt) {
		this.receipt = receipt;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getDeliverystation() {
		return this.deliverystation;
	}

	public void setDeliverystation(String deliverystation) {
		this.deliverystation = deliverystation;
	}

	public String getDraweeadress() {
		return this.draweeadress;
	}

	public void setDraweeadress(String draweeadress) {
		this.draweeadress = draweeadress;
	}

	public String getDraweename() {
		return this.draweename;
	}

	public void setDraweename(String draweename) {
		this.draweename = draweename;
	}

	public String getDraweephone() {
		return this.draweephone;
	}

	public void setDraweephone(String draweephone) {
		this.draweephone = draweephone;
	}

	public BigDecimal getDraweecode() {
		return this.draweecode;
	}

	public void setDraweecode(BigDecimal draweecode) {
		this.draweecode = draweecode;
	}

	public String getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getOrderprice() {
		return this.orderprice;
	}

	public void setOrderprice(BigDecimal orderprice) {
		this.orderprice = orderprice;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}