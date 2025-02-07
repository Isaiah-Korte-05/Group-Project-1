package mu.edu.library;

public class Book {

	private String title;
	private String author;
	private String ISBN;
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
	 * 		  This parameter takes a string for the book title.
	 * @param author
	 * 		  This parameter takes a string for the book author.
	 * @param ISBN
	 * 		  This parameter takes a string for the book ISBN.
	 * @param price
	 * 		  This parameter takes a double for the book price.
	 */
	public Book(String title, String author, String ISBN, double price) {
		super();
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/**
	 * This is a copy constructor that creates a new Book object from another Book
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return ("Title: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN + "\nPrice: $" + price + "\n");
	}
	
	public boolean equals(Book other) {

		if(this.ISBN.equals(other.getISBN())) {
			return true;
		}
		return false;
		
	}

	
}
