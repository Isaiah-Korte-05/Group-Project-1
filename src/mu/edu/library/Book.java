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
	
	/**
	 * This prints a string representation of the Book
	 */
	@Override
	public String toString() {
		return ("Title: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN + "\nPrice: $" + price + "\n");
	}
	
	/**
	 * This compares the ISBN attribute of two Book objects
	 * to evaluate if they are equal.
	 * 
	 * @param other
	 * 		  This parameter is the Book object with ISBN attribute to be compared.
	 * @return
	 * 		  Returns true if two books have the same ISBN.
	 * 		  Returns false otherwise.
	 */
	public boolean equals(Book other) {

		if(this.ISBN.equals(other.getISBN())) {
			return true;
		}
		return false;
		
	}

	
}
