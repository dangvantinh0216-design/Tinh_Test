package lap3_2;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	public void testCurrentBook() {
		Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author( "Matthias Felleisen", 1960));
		Book b2 = new Book("The Da Vinci Code", 12.80, 2003, new Author( "Dan Brown", 1964));
		Book b3 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", 1939));
		assertTrue(b1.currentBook());
		assertFalse(b3.currentBook());
		assertTrue(b2.currentBook());
	}
	public void testCurrentAuthor() {
		Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, new Author( "Matthias Felleisen", 1960));
		Book b2 = new Book("The Da Vinci Code", 12.80, 2003, new Author( "Dan Brown", 1964));
		Book b3 = new Book("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", 1939));
		assertTrue(b1.currentAuthor());
		assertFalse(b3.currentAuthor());
		assertTrue(b2.currentAuthor());
	}
	public void testThisAuthor() {
		Author a1=  new Author( "Matthias Felleisen", 1960);;
		Author a2 = new Author( "Dan Brown", 1964);
		Author a3 =  new Author("Daniel P. Friedman", 1939);
		Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, a1);
		Book b2 = new Book("The Da Vinci Code", 12.80, 2003, a2);
		Book b3 = new Book("A Little Java, A Few Pattern", 25.9, 1998, a3);
		assertTrue(b1.thisAuthor(a1));
		assertFalse(b2.thisAuthor(a3));
	}
	public void testSameAuthor() {
		Author a1=  new Author( "Matthias Felleisen", 1960);;
		Author a2 = new Author( "Dan Brown", 1964);
		Author a3 =  new Author("Daniel P. Friedman", 1939);
		Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, a1);
		Book b2 = new Book("The Da Vinci Code", 12.80, 2003, a2);
		Book b3 = new Book("A Little Java, A Few Pattern", 25.9, 1998, a1);
		assertTrue(b1.sameAuthor(b3));
		assertFalse(b2.sameAuthor(b3));
	}
	public void testSameGeneration() {
		Author a1=  new Author( "Matthias Felleisen", 1960);;
		Author a2 = new Author( "Dan Brown", 1964);
		Author a3 =  new Author("Daniel P. Friedman", 1939);
		Book b1 = new Book("How to Design Class Hierarchies", 0.0, 2004, a1);
		Book b2 = new Book("The Da Vinci Code", 12.80, 2003, a2);
		Book b3 = new Book("A Little Java, A Few Pattern", 25.9, 1998, a3);
		assertFalse(b1.sameGeneration(b3));
		assertTrue(b1.sameGeneration(b2));
	}

}
