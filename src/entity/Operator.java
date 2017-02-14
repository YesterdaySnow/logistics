package entity;

/**
 * Operator entity. @author MyEclipse Persistence Tools
 */

public class Operator implements java.io.Serializable {

	// Fields

	private String id;
	private Product product;
	private String addcase;
	private String returncase;
	private String exchangecase;
	private String unsubscribe;
	private String netcome;

	// Constructors

	/** default constructor */
	public Operator() {
	}

	/** full constructor */
	public Operator(Product product, String addcase, String returncase,
			String exchangecase, String unsubscribe, String netcome) {
		this.product = product;
		this.addcase = addcase;
		this.returncase = returncase;
		this.exchangecase = exchangecase;
		this.unsubscribe = unsubscribe;
		this.netcome = netcome;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getAddcase() {
		return this.addcase;
	}

	public void setAddcase(String addcase) {
		this.addcase = addcase;
	}

	public String getReturncase() {
		return this.returncase;
	}

	public void setReturncase(String returncase) {
		this.returncase = returncase;
	}

	public String getExchangecase() {
		return this.exchangecase;
	}

	public void setExchangecase(String exchangecase) {
		this.exchangecase = exchangecase;
	}

	public String getUnsubscribe() {
		return this.unsubscribe;
	}

	public void setUnsubscribe(String unsubscribe) {
		this.unsubscribe = unsubscribe;
	}

	public String getNetcome() {
		return this.netcome;
	}

	public void setNetcome(String netcome) {
		this.netcome = netcome;
	}

}