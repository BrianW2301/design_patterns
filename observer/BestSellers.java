package observer;
import java.util.ArrayList;
/**
 * 
 * @author Brian
 * 
 */
public class BestSellers implements Subject{

private ArrayList<Observer> observers;
private ArrayList<Book> bestSellers;
/**
 * BestSellers constructor
 * Initializes bestSellers and observers ArrayLists
 */
public BestSellers(){
    observers = new ArrayList<Observer>();
    bestSellers = new ArrayList<Book>();
}
/**
 * Registers an observer by adding it to the observers ArrayList
 * @param observer
 */
public void registerObserver(Observer observer){
    observers.add(observer);
}
/**
 * Removes an observer from the observers ArrayList
 * @param observer
 */
public void removeObserver(Observer observer){
    observers.remove(observer);
}
/**
 * Notifies all Observers in the observers ArrayList
 * about a new book by telling them to run an update command
 * @param book
 */
public void notifyObservers(Book book){
    for (Observer observer : observers) {
        observer.update(book);
    }
}
/**
 * Takes a new Book and adds it to the bestSellers ArrayList
 * runs notifyObservers
 * @param book
 */
public void addBook(Book book){
    bestSellers.add(book);
    notifyObservers(book);
}   
}
