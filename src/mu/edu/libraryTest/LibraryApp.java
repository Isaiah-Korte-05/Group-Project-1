package mu.edu.libraryTest;

import mu.edu.library.Book;
import mu.edu.library.Library;

public class LibraryApp {

	public static void main(String[] args) {

		// Creates new library
		System.out.println("Creating library...");
		Library library = new Library();
		if(library != null) {
			System.out.println("Library created successfully.\n");
		}

		// Creates and assigns book1 to library
		System.out.println("Adding books...");
		Book book1 = new Book("1984", "George Orwell", "1234", 25.98);
		if(!(library.addBook(book1))) {
			System.out.println("Error adding book1.\n");
		}
		System.out.println("Book1 added successfully.\n");
		

		// Creates and assigns book2 to library
		Book book2 = new Book("The Hunger Games", "Suzzane Collins", "5678", 20.53);
		if(!(library.addBook(book2))) {
			System.out.println("Error adding book2.\n");
		}
		System.out.println("Book2 added successfully.\n");

		// Creates and assigns book3 to library
		Book book3 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", "9012", 31.24);
		if(!(library.addBook(book3))) {
			System.out.println("Error adding book3.\n");
		}
		System.out.println("Book3 added successfully.\n");
		
		System.out.println("All books added successfully.\n");
		
		System.out.println("Searching for book with ISBN: " + book2.getISBN());

		// Searches library for book matching ISBN identifier of book2
		Book found = library.searchByISBN(book2.getISBN());
		if(found != null) {
			// Prints out the found book
			System.out.println("---Book Found---\n");
			System.out.println(found.toString());
		}
		else {
			System.out.println("Book could not be found.\n");
		}

		// Prints updated library after all additions and deletions
		System.out.println("\n---Current Library---\n");
		library.displayBooks();

		System.out.println("Removing book: " + found.toString() + "\n");
		
		// Deletes book found during ISBN search
		if(library.removeBook(found)) {
			System.out.println("Book removed successfully.\n");
		}
		else {
			System.out.println("Cannot remove book: \"" + found.toString() + "\", book was not found.\n");
		}
		
		// Creates new book 'imaginary'
		Book imaginary = new Book("Wind and Truth", "Brandon Sanderson", "3456", 12.12);
		
		System.out.println("Removing book: " + imaginary.toString() + "\n");
		
		// Attempts to delete 'imaginary'
		if(library.removeBook(imaginary)) {
			System.out.println("Book removed successfully.\n");
		}
		else {
			System.out.println("Cannot remove book: \"" + imaginary.toString() + "\", book was not found.\n");
		}

		// Prints updated library after all additions and deletions
		System.out.println("\n---Current Library---\n");
		library.displayBooks();
		
	}
	
}
