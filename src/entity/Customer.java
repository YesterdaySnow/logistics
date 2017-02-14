package entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private BigDecimal identifyid;
	private String workunit;
	private String studiocamera;
	private String mobiletelephone;
	private String address;
	private String zipcode;
	private String email;
	private String area;
	private Set orderforms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(String name, BigDecimal identifyid, String studiocamera,
			String area) {
		this.name = name;
		this.identifyid = identifyid;
		this.studiocamera = studiocamera;
		this.area = area;
	}

	/** full constructor */
	public Customer(String name, BigDecimal identifyid, String workunit,
			String studiocamera, String mobiletelephone, String address,
			String zipcode, String email, String area, Set orderforms) {
		this.name = name;
		this.identifyid = identifyid;
		this.workunit = workunit;
		this.studiocamera = studiocamera;
		this.mobiletelephone = mobiletelephone;
		this.address = address;
		this.zipcode = zipcode;
		this.email = email;
		this.area = area;
		this.orderforms = orderforms;
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

	public BigDecimal getIdentifyid() {
		return this.identifyid;
	}

	public void setIdentifyid(BigDecimal identifyid) {
		this.identifyid = identifyid;
	}

	public String getWorkunit() {
		return this.workunit;
	}

	public void setWorkunit(String workunit) {
		this.workunit = workunit;
	}

	public String getStudiocamera() {
		return this.studiocamera;
	}

	public void setStudiocamera(String studiocamera) {
		this.studiocamera = studiocamera;
	}

	public String getMobiletelephone() {
		return this.mobiletelephone;
	}

	public void setMobiletelephone(String mobiletelephone) {
		this.mobiletelephone = mobiletelephone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Set getOrderforms() {
		return this.orderforms;
	}

	public void setOrderforms(Set orderforms) {
		this.orderforms = orderforms;
	}

}