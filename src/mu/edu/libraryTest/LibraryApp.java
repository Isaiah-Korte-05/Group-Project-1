package mu.edu.libraryTest;

import mu.edu.library.Book;
import mu.edu.library.Library;

public class LibraryApp {

	public static void main(String[] args) {

		Library library = new Library();

		// Creates and assigns book1 to library
		Book book1 = new Book("1984", "George Orwell", "1234", 25.98);
		library.addBook(book1);

		// Creates and assigns book2 to library
		Book book2 = new Book("The Hunger Games", "Suzzane Collins", "5678", 20.53);
		library.addBook(book2);

		// Creates and assigns book3 to library
		Book book3 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", "9012", 31.24);
		library.addBook(book3);

		// Searches library for book matching ISBN identifier of book2
		Book found = library.searchByISBN(book2.getISBN());

		// Prints out the found book
		System.out.println("---Found Book---\n");
		System.out.println(found.toString());

		// Creates new book 'imaginary'
		Book imaginary = new Book("Wind and Truth", "Brandon Sanderson", "3456", 12.12);

		// Deletes book found during ISBN search
		@SuppressWarnings("unused")
		boolean deletedReal = library.removeBook(found);
		// Attempts to delete 'imaginary'
		@SuppressWarnings("unused")
		boolean deletedFake = library.removeBook(imaginary);

		// Prints updated library after all additions and deletions
		System.out.println("\n---Current Library---\n");
		library.displayBooks();
		
	}
	
}
