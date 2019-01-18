package ncs.test10;

public class BookUpdate {
	
	private Book bookData;
	
	public BookUpdate() {
	}
	
	public BookUpdate(Book bookData) {
		this.bookData = bookData;
	}
	
	public Book getBookData() {
		return bookData;
	}
	
	public void updateBookPrice() {
		double price = bookData.getBookPrice() * (100 - bookData.getBookDiscountRate()) / 100; 
		bookData.setBookPrice(price);
	}
}
