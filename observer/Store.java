package observer;
import java.util.Queue;
import java.util.LinkedList;


public class Store implements Observer{
    
private Subject subject;

private String title;

private Queue<Book> bestSellers;

public Store(Subject subject){
    this.subject=subject;
    subject.registerObserver(this);
    bestSellers = new LinkedList<Book>() {};
}

public void update (Book book){
    bestSellers.add(book);
    if (bestSellers.size()>5){
        bestSellers.remove();
    }
}
public void display(){
    System.out.println("Top 5 Best Sellers:");
    for (Book i: this.bestSellers) {
        System.out.println(i);
    }
}

}
