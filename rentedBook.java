package Project_02;

public class rentedBook {
	private String title;
	private String author;
	private int pages;
	private String publisher;
	private int year;
	private String category;
	private String renterLN;
	public rentedBook(String title, String author, int pages, String publisher, int year, String renterLN, String category) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.publisher = publisher;
		this.year = year;
		this.renterLN = renterLN;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRenterLN() {
		return renterLN;
	}
	public void setRenterLN(String renterLN) {
		this.renterLN = renterLN;
	}

}