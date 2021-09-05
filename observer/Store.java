package observer;
import java.util.Queue;
import java.util.LinkedList;
/**
 * 
 * @author Brian
 * 
 */

public class Store implements Observer{
    
private Subject subject;
private String title;
private Queue<Book> bestSellers;

/**
 * Initializes subject and registers the Store as an Observer
 * @param subject
 */
public Store(Subject subject){
    this.subject = subject;
    subject.registerObserver(this);
    bestSellers = new LinkedList<Book>() {};
}
/**
 * Updates Store's bestSellers ArrayList by adding a new Book to the ArrayList
 * Removes the oldest Book if the ArrayList has more than 5 Books after adding the new Book
 */
public void update (Book book){
    bestSellers.add(book);
    if (bestSellers.size()>5){
        bestSellers.remove();
    }
}
/**
 * Prints all of the Books in the Store's bestSellers ArrayList
 */
public void display(){
    System.out.println("Top 5 Best Sellers:");
    for (Book i: this.bestSellers) {
        System.out.println(i);
    }
}
}
