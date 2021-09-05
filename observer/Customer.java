package observer;
import java.util.ArrayList;
/**
 * 
 * @author Brian
 * 
 */

public class Customer implements Observer{

private Subject subject;

private String firstName;
private String lastName;
private ArrayList<Book> wishList;


/**
 * Constructor for Customer
 * Initializes subject and registers the Customer as an Observer
 * 
 * Initializes Customer's firstName, lastName, and wishList ArrayList
 * @param subject
 * @param firstName
 * @param lastName
 */
public Customer(Subject subject, String firstName, String lastName){
    this.subject = subject;
    subject.registerObserver(this);
    this.firstName = firstName;
    this.lastName = lastName;
    wishList = new ArrayList<Book>();
}
/**
 * Updates Customer's wishList by adding a new Book to the ArrayList
 */
public void update(Book book){
    wishList.add(book);
}
/**
 * Prints all of the Books in a Customer's wishList
 */
public void display(){
    System.out.println("\nWish List:");
    for (Book wishList1 : wishList) {
        System.out.println(wishList1);
    }
}






    
}
