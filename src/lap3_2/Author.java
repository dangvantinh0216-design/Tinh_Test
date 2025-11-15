package lap3_2;

public class Author {
	private String name;
	private int birthYear;
	public Author(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public boolean currentAuthor() {
		return this.getBirthYear() >= 1940 ;
	}
	public boolean same(Author that) { 
		return (this.name.equals(that.name)) &&
		(this.birthYear == that.birthYear);
		}
	public boolean sameGeneration(Author that) {
		return Math.abs(this.getBirthYear() - that.getBirthYear()) <= 10 ;
	}
	

}
