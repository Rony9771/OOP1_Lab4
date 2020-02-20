package aiub.Lab4;

public class Book {
	
		private	String bookName;
		private	String bookAuthor;
		private	String bookId;
		private	String bookType;
		private	int bookCopy; 

		public Book() {
			
		}
		public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {
			super();
			
			this.bookName = bookName;
			this.bookAuthor = bookAuthor;
			this.bookId = bookId;
			this.bookType = bookType;
			this.bookCopy = bookCopy;
		}
		public void showInfo() {
			
			System.out.println(bookName+":"+bookAuthor+":"+bookId+":"+bookType+":"+bookCopy);
		}
		public void addCopyBook(int x) {
			
			System.out.println("Total Copy: "+x);
			
		}

		}
		