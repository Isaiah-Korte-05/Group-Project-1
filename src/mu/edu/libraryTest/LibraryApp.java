package mu.edu.libraryTest;

import mu.edu.library.Book;
import mu.edu.library.Library;

public class LibraryApp {

	public static void main(String[] args) {

		Library library = new Library();
		
		Book book1 = new Book("1984", "George Orwell", "1234", 25.98);
		library.addBook(book1);
		
		Book book2 = new Book("The Hunger Games", "Suzzane Collins", "5678", 20.53);
		library.addBook(book2);
		
		Book book3 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", "9012", 31.24);
		library.addBook(book3);
		
		Book found = library.searchByISBN(book2.getISBN());
		
		System.out.println("---Found Book---\n");
		System.out.println(found.toString());
		
		Book imaginary = new Book("Wind and Truth", "Brandon Sanderson", "3456", 12.12);
		
		@SuppressWarnings("unused")
		boolean deletedReal = library.removeBook(found);
		@SuppressWarnings("unused")
		boolean deletedFake = library.removeBook(imaginary);
		
		System.out.println("\n---Current Library---\n");
		library.displayBooks();
		
	}
	
}
