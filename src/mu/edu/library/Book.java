package mu.edu.library;

public class Book {

	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	public Book(String title, String author, String iSBN, double price) {
		super();
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
		this.price = price;
	}

	public Book(Object book) {
		
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
