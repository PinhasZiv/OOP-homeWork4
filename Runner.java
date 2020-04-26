package homeWork4;

public class Runner {

	public static void main(String[] args) {

		// 1)

		Book book = new Book();
		LibraryBook lBook = new LibraryBook("Harry Poter", 842, "J.K ROWLING");
		BookForBorrow bfbBook = new BookForBorrow();
		ComicBook comBook = new ComicBook("Scubidu", 120, "DAN HARMON", 4);
		ActionComicBook actComBook = new ActionComicBook("X-Man", 205, "MARVEL", 8, 17);
		CookBook cookingBook = new CookBook("Cooking With The King", 13, "AHARON AHARONI", 4, true);
		CosherCookBook coshCookingBook = new CosherCookBook();

		// 2)
		System.out.println("**************** 2 *************");
		
		comBook.borrow(4);
		comBook.returnBook(-3);
		actComBook.borrow(12);
		actComBook.returnBook(7);
		cookingBook.borrow(-5);
		cookingBook.returnBook(0);
		coshCookingBook.borrow(9);
		coshCookingBook.returnBook(4);
		System.out.println();
		// 3)
		System.out.println("*************** 3 **************");

		System.out.println(book);
		System.out.println(lBook);
		System.out.println(bfbBook);
		System.out.println(comBook);
		System.out.println(actComBook);
		System.out.println(cookingBook);
		System.out.println(coshCookingBook);
		System.out.println();
		// 4)
		System.out.println("*************** 4 ************");
	
		System.out.println(book.Summarize());
		System.out.println(lBook.Summarize());
		System.out.println(bfbBook.Summarize());
		System.out.println(comBook.Summarize());
		System.out.println(actComBook.Summarize());
		System.out.println(cookingBook.Summarize());
		System.out.println(coshCookingBook.Summarize());
	}

}
