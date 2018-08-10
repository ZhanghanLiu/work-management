package com.management.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.management.enumerate.OrderStatus;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String ASIN;
	
	private long shippingNumber;
	
	private String amazonLink;
	
	private String productName;
	
	private Date createDate;
	
	private String serviceRep;
	
	private OrderStatus orderStatus;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Customer customer;

	public String getASIN() {
		return ASIN;
	}

	public void setASIN(String aSIN) {
		ASIN = aSIN;
	}

	public long getShippingNumber() {
		return shippingNumber;
	}

	public void setShippingNumber(long shippingNumber) {
		this.shippingNumber = shippingNumber;
	}

	public String getAmazonLink() {
		return amazonLink;
	}

	public void setAmazonLink(String amazonLink) {
		this.amazonLink = amazonLink;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getServiceRep() {
		return serviceRep;
	}

	public void setServiceRep(String serviceRep) {
		this.serviceRep = serviceRep;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
