package mu.edu.library;

public class Book {

	// Title of book
	private String title;
	// Author of book (first and last name)
	private String author;
	// ISBN unique identifier
	private String ISBN;
	// Price of book in XX.XX format
	private double price;
	
	/**
	 * This is a default constructor that initializes the title, author, and ISBN to
	 * "Unknown" and initializes price to 0.0. No parameters.
	 */
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	/**
	 * This is a parameterized constructor that sets all attributes.
	 * 
	 * @param title
	 * 		  This parameter takes a string for the Book title.
	 * @param author
	 * 		  This parameter takes a string for the Book author.
	 * @param iSBN
	 * 		  This parameter takes a string for the Book ISBN.
	 * @param price
	 * 		  This parameter takes a double for the Book price.
	 */
	public Book(String title, String author, String iSBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
		this.price = price;
	}
	
	/**
	 * This is a copy constructor that creates a new Book object from another Book.
	 * 
	 * @param book
	 * 		  This parameter takes a Book object with attributes to be copied.
	 */
	public Book(Book book) {
		this.title = book.title;
		this.author = book.author;
		this.ISBN = book.ISBN;
		this.price = book.price;
	}
	
	/**
	 * This is a getter.
	 * 
	 * @return
	 * 		  Returns Book title.
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * This is a setter.
	 * 
	 * @param title
	 * 		  Takes a string to be set as Book title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This is a getter.
	 * 
	 * @return
	 * 		  Returns Book author.
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * This is a setter.
	 * 
	 * @param title
	 * 		  Takes a string to be set as Book author.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * This is a getter.
	 * 
	 * @return
	 * 		  Returns Book ISBN.
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * This is a setter.
	 * 
	 * @param title
	 * 		  Takes a string to be set as Book ISBN.
	 */
	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	/**
	 * This is a getter.
	 * 
	 * @return
	 * 		  Returns Book price.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * This is a setter.
	 * 
	 * @param title
	 * 		  Takes a double to be set as Book price.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * This prints a string representation of the Book
	 */
	@Override
	public String toString() {
		return (title + " by " + author + " (ISBN: " + ISBN + ", $" + price + ")");
	}
	
	/**
	 * This compares the ISBN attribute of two Book objects
	 * to evaluate if they are equal.
	 * 
	 * @param other
	 * 		  This parameter is an object with ISBN attribute to be compared.
	 * @return
	 * 		  Returns true if two books have the same ISBN.
	 * 		  Returns false otherwise.
	 */
	public boolean equals(Object other) {

		// Casts parameter object to type Book
		Book compBook = (Book)other;
		// Compares the ISBN of parameter to this book
		if(this.ISBN.equals(compBook.getISBN())) {
			return true;
		}
		return false;
		
	}

	
}
