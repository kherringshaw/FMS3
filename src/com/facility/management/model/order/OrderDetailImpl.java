package com.facility.management.model.order;

import com.facility.management.model.product.Book;
import com.facility.management.model.product.Product;

public class OrderDetailImpl implements OrderDetail {
	private Book book;
	private int quantity;

	public OrderDetailImpl() {}
	
	public Book getBook() {
		return book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
