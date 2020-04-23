package homeWork4;

public class Runner {

	public static void main(String[] args) {

		// 1)

		Book book = new Book();
		LibraryBook lBook = new LibraryBook("Harry Poter", 842, "J.K ROWLING");
		ComicBook comBook = new ComicBook("scubidu", 120, "aron black", 4);
		ActionComicBook actComBook = new ActionComicBook("X-MAN", 205, "MARVEL", 8, 17);
		CookBook cookingBook = new CookBook("COOKING WITH THE KING", 13, "Aron aaroni", 4, true);
		CosherCookBook coshCookingBook = new CosherCookBook();

		
		// 2)
		System.out.println("2)*****************************");
		
		comBook.borrow(5);
		comBook.returnBook(-3);
		actComBook.borrow(12);
		actComBook.returnBook(7);
		cookingBook.borrow(-5);
		cookingBook.returnBook(14);
		coshCookingBook.borrow(7);
		coshCookingBook.returnBook(7);
		// 3)
		System.out.println("3)*****************************");
		
		System.out.println(book);
		System.out.println(lBook);
		System.out.println(comBook);
		System.out.println(actComBook);
		System.out.println(cookingBook);
		System.out.println(coshCookingBook);
		// 4)
		System.out.println("4)*****************************");
		// TODO
		// check some problems here. in the console.
		System.out.println(book.Summarize());
		System.out.println(lBook.Summarize());
		System.out.println(comBook.Summarize());
		System.out.println(actComBook.Summarize());
		System.out.println(cookingBook.Summarize());
		System.out.println(coshCookingBook.Summarize());
	}

}
