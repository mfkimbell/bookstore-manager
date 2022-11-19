package Project_02;

public class Book {
	private String title;
	private String author;
	private int pages;
	private String publisher;
	private int year;
	private int copies;
	private String category;
	public Book(String title, String author, int pages, String publisher, int year, int copies, String category) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.publisher = publisher;
		this.year = year;
		this.copies = copies;
		this.category = category;
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
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
