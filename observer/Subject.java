package observer;
/**
 * Interface for Subjects
 * @author Brian
 * 
 */
public interface Subject {

public void registerObserver(Observer observer);
public void removeObserver(Observer observer);
public void notifyObservers(Book book);
}
