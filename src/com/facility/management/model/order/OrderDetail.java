package com.facility.management.model.order;

import com.facility.management.model.product.Book;
import com.facility.management.model.product.Product;

public interface OrderDetail {
	public Book getBook();
	public void setBook(Book product);
	public int getQuantity();
	public void setQuantity(int quantity);
}
