package mu.edu.library;

public class Library {

	private Book[] books = new Book[5];
	private int count = 0;
	
	/**
	 * This adds a book to the array given there is space.
	 * 
	 * @param book
	 * 		  This is the Book to be added to the array.
	 * @return
	 * 		  Returns true if there is space in array and Book is successfully added.
	 * 		  Returns false if there is no space in array and Book is not added.
	 */
	public boolean addBook(Book book) {
		
		if(this.count < books.length - 1) {
			books[count] = book;
			count++;
			return true;
		}
		return false;
		
	}
	
	/**
	 * This removes a book from the array given that it exists
	 * 
	 * @param book
	 * 		  This is the book to be removed
	 * @return
	 * 		  Returns true if book is found and successfully removed.
	 * 		  Returns false if book is not found and nothing is removed.
	 */
	public boolean removeBook(Book book) {
		
		for (int i = 0; i < books.length; i++) {
			if(this.books[i].equals(book)) {
				this.books[i] = null;
				return true;
			}
		}
		
		return false;
		
	}
	
	/**
	 * This searches for a Book by ISBN attribute
	 * 
	 * @param ISBN
	 * 		  This is the value searched
	 * @return
	 * 		  Returns Book object if matching ISBN is found.
	 * 		  Returns null if not found.
	 */
	public Book searchByISBN(String ISBN) {
		
		for(int i = 0; i < count - 1; i++) {
			if(ISBN == books[i].getISBN()) {
				return books[i];
			}
		}
		return null;
		
	}
	
	/**
	 * This prints the details of all books.
	 */
	public void displayBooks() {
		
		for(int i = 0; i < count - 1; i++) {
			System.out.println(books[i].toString());
		}
		
	}
	
}
