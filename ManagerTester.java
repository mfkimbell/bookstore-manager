package Project_02;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerTester {
	private String [][] customerTable;
	private String [][] bookTable;
	private String [][] rentedBookTable;

	
	public ManagerTester() {
		;
		
	}
	
	


	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<>();
		ArrayList<rentedBook> rentedBooks = new ArrayList<>();
		ArrayList<Customer> customers = new ArrayList<>();
		try (Scanner f = new Scanner(Paths.get("inputFile.txt"))) {
			f.nextLine();
			while (f.hasNextLine()) {
				String line=f.nextLine();
				if (line.equals("Rented Books:")) {
			
					break;
				}
				
				 
				String[] data = line.split(",");
				Book newBook = new Book(data[0], data[1], Integer.valueOf(data[2]), data[3],
						Integer.valueOf(data[4]), Integer.valueOf(data[5]), data[6]);
				books.add(newBook);
				}
			
			
			while (f.hasNextLine()) {
				String line2 = f.nextLine();
				if (line2.equals("Customers:")) {
					break;
				}
				
				String[] data = line2.split(",");
				rentedBook newBook2 = new rentedBook(data[0], data[1], Integer.valueOf(data[2]), data[3], Integer.valueOf(data[4]), data[5], data[6]);
				rentedBooks.add(newBook2);
			
				
			}
			while (f.hasNextLine()) {
				String line3 = f.nextLine();
			
				String[] data = line3.split(",");
				String[] rentals = data[5].split(":");
				Customer newCustomer = new Customer(data[0], data[1], data[2], data[3], data[4], rentals);
				customers.add(newCustomer);
				
			
				
			}
		} catch (IOException e) {
			System.out.println("Error occurred");
		}
		// main method continues here
//		System.out.println(books);
//		System.out.println(customers);
//		System.out.println(rentedBooks);
		
	
//		manager.displayBooks(books);
//		System.out.println("--------------");
//		manager.specificBookSearch(books, "Blue Book");
//		System.out.println("--------------");
//		manager.displayCustomers(customers);
//		System.out.println("--------------");
//		manager.specificCustomerSearch(customers,"Pratt");
		
		ManagerTester test = new ManagerTester();
		test.createCustomerTable(customers);
		test.createBookTable(books);
		
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI(books,customers,rentedBooks).setVisible(true);
			}
		});
		


	}
public void createCustomerTable(ArrayList<Customer> customers,String search) {
	ArrayList<Customer> searchedCustomer = new ArrayList<>();
	System.out.println(search);
	
	if (search.length() > 0) {
		for (Customer customer:customers) {
	
		if (customer.getFname().equals(search) || customer.getLname().equals(search)) {
			searchedCustomer.add(customer);
		}
		
	}
		String[][] val = new String[searchedCustomer.size()][7];
		int counter = 0;
		for (Customer customer : searchedCustomer) {
			val[counter][0]=customer.getFname();
			val[counter][1]=customer.getLname();
			val[counter][2]=customer.getEmail();
			val[counter][3]=customer.getNumber();
			val[counter][4]=customer.getAddress();
			counter++;
	
	}
		this.customerTable = val;
		
	} else {
	
		
		
	}
	
	
		
	}
	


public void createCustomerTable(ArrayList<Customer> customers) {
	
	
	
	String[][] val = new String[customers.size()][7];
	int counter = 0;
	for (Customer customer:customers) {
		val[counter][0]=customer.getFname();
		val[counter][1]=customer.getLname();
		val[counter][2]=customer.getEmail();
		val[counter][3]=customer.getNumber();
		val[counter][4]=customer.getAddress();
		counter++;
		
		
	}
	this.customerTable = val;
	
		
	}
	

public String [][] getCustomerTable() {
	return customerTable;
}
public void setCustomerTable(String [][] customerTable) {
	this.customerTable = customerTable;
}

public void createBookTable(ArrayList<Book> books) {
	
	
	
	String[][] val = new String[books.size()][7];
	int counter = 0;
	for (Book book:books) {
		val[counter][0]=book.getTitle();
		val[counter][1]=book.getAuthor();
		val[counter][2]=String.valueOf(book.getPages());
		val[counter][3]=book.getPublisher();
		val[counter][4]=String.valueOf(book.getYear());
		val[counter][5]=String.valueOf(book.getCopies());
		val[counter][6]=book.getCategory();
		counter++;
		
		
	}
	this.bookTable = val;
	
	
		
	}

public void createBookTable(ArrayList<Book> books,String search) {
	if (search.length() > 0 ) {
	
	
	
	String[][] val = new String[books.size()][7];
	int counter = 0;
	for (Book book:books) {
		val[counter][0]=book.getTitle();
		val[counter][1]=book.getAuthor();
		val[counter][2]=String.valueOf(book.getPages());
		val[counter][3]=book.getPublisher();
		val[counter][4]=String.valueOf(book.getYear());
		val[counter][5]=String.valueOf(book.getCopies());
		val[counter][6]=book.getCategory();
		counter++;
		
		
	}
	this.bookTable = val;
	
	
		
	
} else {}
}


public String [][] getBookTable() {
	return bookTable;
}




public void setBookTable(String [][] bookTable) {
	this.bookTable = bookTable;
}




public String [][] getRentedBookTable() {
	return rentedBookTable;
}




public void setRentedBookTable(String [][] rentedBookTable) {
	this.rentedBookTable = rentedBookTable;
}

public void createRentedBookTable(ArrayList<Customer> customers, ArrayList<Book> books, String renter) {
	

	if (renter.length()> 0) {

	
	String[][] val = new String[customers.size()][7];
	
	Customer foundCustomer = new Customer(renter, renter, renter, renter, renter, new String[]{});
	
	
	for (Customer customer:customers) {
		if (customer.getLname().equals(renter)) {
		foundCustomer = customer;
		
	}
		
		String[] books2 = foundCustomer.getRentals();
		
		val[0][0]=foundCustomer.getLname();
		int counter = 0;
		
		
		
		try {
			for (String book2:books2) {
				Book correctBook = new Book(book2, book2, counter, book2, counter, counter, book2);
				for (Book libBook:books)
				{
					if (book2.equals(libBook.getTitle())) {
						correctBook = libBook;
							}
					
				}
				
			val[counter][1]=book2;
			val[counter][2]=correctBook.getAuthor();
			counter++;
			}
		}
		catch (Exception e){
			System.out.println(e);
			break;
		}
		
		
	}
	this.rentedBookTable = val;
	
	}
}
}



