package ncs.test10;

public class BookStore {

	public static void main(String[] args) {
		
		Book bookdata;
		BookUpdate bookupdate;
		
		bookdata = new Book("Computer", "HTML5", 30000, 15);
		System.out.println("기본 정보");
		System.out.println(bookdata);
		
		bookupdate = new BookUpdate(bookdata);
		bookupdate.updateBookPrice();
		bookdata = bookupdate.getBookData();
		System.out.println("변경된 정보");
		System.out.println(bookdata);
	}

}
