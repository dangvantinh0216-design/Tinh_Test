package lap3_2;

import lap3_1.Address;
import lap3_1.House;

public class Book {
	private String title;
	private double price;
	private int publishYear;
	private Author author;
	public Book(String title, double price, int publishYear, Author author) {
		super();
		this.title = title;
		this.price = price;
		this.publishYear = publishYear;
		this.author = author;
	}
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	public boolean currentBook() {
		return (this.getPublishYear() == 2004) ||
				    (this.getPublishYear() == 2003);
	}
	public boolean currentAuthor() {
		return this.author.currentAuthor();
	}
	public boolean thisAuthor(Author that) { 
		return this.author.same(that);
		}
	public boolean sameAuthor(Book other) {
		return  this.author.same(other.author);
	}
	public boolean sameGeneration(Book that) {
		return this.author.sameGeneration(that.author);
	}

}
