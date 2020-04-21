package homeWork4;

public class ActionComicBook extends ComicBook {

	private int ageLimit;

	public ActionComicBook() {
		super();
		this.ageLimit = 10;
	}

	public ActionComicBook(String nameOfBook, int numOfPages, String nameOfAuthr, int numOfCopies, int ageLimit) {
		super(nameOfBook, numOfPages, nameOfAuthr, numOfCopies);
		this.ageLimit = ageLimit;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	@Override
	public String Summarize() {
		// TODO Auto-generated method stub
		return super.Summarize() + "This action comic book is for ages greater than " + this.getAgeLimit()
				+ "years old.";
	}

	@Override
	public String toString() {
		return super.toString() + " Age limit: " + this.getAgeLimit();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ActionComicBook))
			return false;
		if (!super.equals(obj))
			return false;
		ActionComicBook other = (ActionComicBook) obj;
		return this.getAgeLimit() == other.getAgeLimit();
	}

}
