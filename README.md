# Java_BookstoreManager
This project's goal was to create an interface that a bookstore manager could use to keep track of the inventory of his bookstore, all of his customers, and which customers were renting which books.

Additionally, it needed to be able to add both new books and new customers to the library. All of the data was read from and saved to a txt file that served as the database.

The GUI was created using Java's Swing toolkit. It includes a tabbed panel, buttons, text fields, Jlabels, JscrollPanec and Jtables.

When the application is first opened, the GUI defaults to this screen:
<img width="724" alt="Screen Shot 2022-11-19 at 12 17 32 PM" src="https://user-images.githubusercontent.com/107063397/202865691-36aafe4e-0d52-49d1-b0ed-6198fa80670e.png">

The data for the bookstore is automatically uploaded from a txt file with the format "Books:\n", (book data), "RentedBooks\n", (rented book data), "Customers\n", (customer data)

<img width="671" alt="Screen Shot 2022-11-19 at 12 19 06 PM" src="https://user-images.githubusercontent.com/107063397/202865735-4d6d0c17-5f4e-491d-97af-cda135bc0932.png">

Clicking the "Display Customer" button displays a list of all customers in the bookstore and their stored data. If there were more customers than could fit, a JscrollPane would allow you to scroll to view more data.

<img width="722" alt="Screen Shot 2022-11-19 at 12 21 29 PM" src="https://user-images.githubusercontent.com/107063397/202865814-c85b27b4-61c8-489a-8fd0-aff3ba7a8195.png">

Clicking "Add Customer" prompts the user to enter all of the required information for a customer, apart from what they've rented, which will default to "No Books Rented"

<img width="332" alt="Screen Shot 2022-11-19 at 12 23 35 PM" src="https://user-images.githubusercontent.com/107063397/202865886-7661449e-1fed-44ca-8e18-db82f206020a.png">

Hitting "Display Customer" again, we see that the new customer has been added. Additionally, it also has been added to the database.

<img width="709" alt="Screen Shot 2022-11-19 at 12 25 05 PM" src="https://user-images.githubusercontent.com/107063397/202865957-81397f53-79f8-472c-bcab-7af1fa16fbdd.png">

<img width="640" alt="Screen Shot 2022-11-19 at 12 26 53 PM" src="https://user-images.githubusercontent.com/107063397/202866022-b9374bff-869f-4a09-bf68-1bb735564889.png">

If the user hits "Search" with no input, the customer table will not dislpay any data. If the user enters either the first, or last name, all customers with matching data in one of those fields will be displayed. Here is what happens when I type "Long", a name of one of the customers.

<img width="723" alt="Screen Shot 2022-11-19 at 12 29 00 PM" src="https://user-images.githubusercontent.com/107063397/202866102-8100e573-4305-4374-9bff-a37d6b97aaa0.png">

If the user clicks on the "Books" tab, they will be directed to a panel with a similar setup to customer. Clicking "Display Books" will display all books in the same manner as customers.

<img width="725" alt="Screen Shot 2022-11-19 at 12 29 28 PM" src="https://user-images.githubusercontent.com/107063397/202866118-b4be50d9-0d96-48bb-ae25-6b08c4cb58a2.png">

The search bar works in the exact same manner as the customer tab. If the user clicks "Rent Book", it will prompt the user asking for "first name of customer", "last name of customer", and then "book title". As seen here.

<img width="724" alt="Screen Shot 2022-11-19 at 12 32 54 PM" src="https://user-images.githubusercontent.com/107063397/202866239-348f4983-e729-4839-b59e-ba0538223c63.png">

If the copies was already at 0, the user would recieve a popup that read "No copies available for rent". If the customer entered a book not in the library's database, the user would recieve a popup that said "This book is not in the library". If the user typed the name of a non-existent customer, the user would receive a popup that read "Customer does not exist". After clicking "Display Books" again, you can see that the "copies" of the book has been decreased by 1 as seen below. All changes are also saved in the database.

<img width="724" alt="Screen Shot 2022-11-19 at 12 34 09 PM" src="https://user-images.githubusercontent.com/107063397/202866281-92d7c02c-24f1-4615-a56b-9494c7483c83.png">

If the user clicks "Add Book", the user is prompted for all the information of the new book.

<img width="724" alt="Screen Shot 2022-11-19 at 12 38 27 PM" src="https://user-images.githubusercontent.com/107063397/202866411-c138d403-f48f-452a-89e0-8b3b641193e0.png">

After the user clicks "Display Books" again, the new book has been added to the table.

<img width="724" alt="Screen Shot 2022-11-19 at 12 40 16 PM" src="https://user-images.githubusercontent.com/107063397/202866467-e9066452-f8dc-43ab-8837-68648735d1fc.png">

Finally, on the "Rented Books" tab, the user can search a customer by last name and see all the books they have rented, along with the author of those books. After creating the new user "Brock Hampton" and adding "Purple Book", I also added "Red Book" and "Blue Book" to their rentals. After searching Hampton and hitting "search", the following results are displayed. 

<img width="723" alt="Screen Shot 2022-11-19 at 12 44 16 PM" src="https://user-images.githubusercontent.com/107063397/202866593-58c51bd3-7250-48e3-91d4-f443ef6b824b.png">

If Hampton had not rented any books, it would have defaulted to and displayed "No Books Rented" where the title of the books are currently. Additionally, all changes in the GUI are reflected and saved in the database.


