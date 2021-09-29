package main.kadetov.classes.bock;

import main.kadetov.classes.bock.Book;

public class Book implements Cloneable, Comparable<Book> {
	private String title;
	private String author;
	private int price;
	private static int edition;
	private int isbn;

	public Book(String title, String author, int price, int isbn) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getEdition() {
		return edition;
	}

	public static void setEdition(int edition) {
		Book.edition = edition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("Title: %s. Author %s. Price %d, Num %d", this.title, this.author, this.price, this.isbn);
	}
	
	@Override
	protected Book clone() throws CloneNotSupportedException {
		return (Book)super.clone();
	}
	
	@Override
	public int compareTo(Book book) {
		if (book.isbn > this.isbn) {
			return -1;
		}
		else if (book.isbn < this.isbn) {
			return 1;
		}
		
		return 0;
	}

}