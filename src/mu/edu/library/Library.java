package mu.edu.library;

public class Library {

	private Book[] books = new Book[5];
	private int count = 0;
	
	public boolean addBook(Book book) {
		
		if(this.count < books.length - 1) {
			books[count] = book;
			count++;
			return true;
		}
		return false;
		
	}
	
	public boolean removeBook(Book book) {
		
		return true;
		
	}
	
	public Book searchByISBN(String ISBN) {
		
		for(int i = 0; i < count - 1; i++) {
			if(ISBN == books[i].getISBN()) {
				return books[i];
			}
		}
		return null;
		
	}
	
	public void displayBooks() {
		
		for(int i = 0; i < count - 1; i++) {
			System.out.println(books[i].toString());
		}
		
	}
	
}
