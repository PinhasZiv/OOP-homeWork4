package homeWork4;

public class ComicBook extends LibraryBook {

	private int numOfCopies;

	public ComicBook() {
		super();
		this.numOfCopies = 10;
	}

	public ComicBook(int numOfCopies) {
		super();
		this.numOfCopies = numOfCopies;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		if (numOfCopies < 0) {
			this.numOfCopies = 0;
		} else {
			this.numOfCopies = numOfCopies;
		}
	}

	@Override
	public String toString() {
		return "Book: " + this.getNameOfBook() 
		+ " Authr: " + this.getNameOfAuthor() + " Pages: " + this.getNumOfPages()
		+ " Num of copies:" + this.getNumOfCopies();

	}

}
