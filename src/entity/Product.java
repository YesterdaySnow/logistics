package entity;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String productprice;
	private String discount;
	private String description;
	private String isoutstock;
	private String digit;
	private String goodsBrand;
	private String goodsType;
	private Integer goodsNumber;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** full constructor */
	public Product(String name, String productprice, String discount,
			String description, String isoutstock, String digit,
			String goodsBrand, String goodsType, Integer goodsNumber) {
		this.name = name;
		this.productprice = productprice;
		this.discount = discount;
		this.description = description;
		this.isoutstock = isoutstock;
		this.digit = digit;
		this.goodsBrand = goodsBrand;
		this.goodsType = goodsType;
		this.goodsNumber = goodsNumber;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductprice() {
		return this.productprice;
	}

	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsoutstock() {
		return this.isoutstock;
	}

	public void setIsoutstock(String isoutstock) {
		this.isoutstock = isoutstock;
	}

	public String getDigit() {
		return this.digit;
	}

	public void setDigit(String digit) {
		this.digit = digit;
	}

	public String getGoodsBrand() {
		return this.goodsBrand;
	}

	public void setGoodsBrand(String goodsBrand) {
		this.goodsBrand = goodsBrand;
	}

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public Integer getGoodsNumber() {
		return this.goodsNumber;
	}

	public void setGoodsNumber(Integer goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

}