package homeWork4;

public class ComicBook extends LibraryBook {

	private int numOfCopies;

	public ComicBook() {
		super();
		this.numOfCopies = 10;
	}

	public ComicBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies) {
		super(nameOfBook, numOfPages, nameOfAuthr);
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

	public String Summarize() {
		// TODO to Check if we need to write it again
		// (gay asked at the forum about it).
		return super.Summarize();
	}

	public boolean borrow(int numOfCopies) {
		if (this.numOfCopies - numOfCopies > 0) {
			this.numOfCopies = (this.numOfCopies - numOfCopies);
			return true;
		} else {
			// TODO
			// check if we need to print this message.
			System.out.println("You can't borrow that number of copies." + "There are only " + this.numOfCopies
					+ "Copies available at the library");
			return false;
		}
	}

	public boolean returnBook(int numOfCopies) {
		if (numOfCopies > 0) {
			this.setNumOfCopies(this.getNumOfCopies() + numOfCopies);
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ComicBook))
			return false;
		if (!(super.equals(obj)))
			return false;
		ComicBook other = (ComicBook) obj;
		return (this.getNumOfCopies() == other.getNumOfCopies());
	}

	@Override
	public String toString() {
		return super.toString() + " Num of copies:" + this.getNumOfCopies();

	}

}
