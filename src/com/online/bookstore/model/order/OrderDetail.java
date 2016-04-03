package com.online.bookstore.model.order;

import com.online.bookstore.model.product.Book;
import com.online.bookstore.model.product.Product;

public interface OrderDetail {
	public Book getBook();
	public void setBook(Book product);
	public int getQuantity();
	public void setQuantity(int quantity);
}
