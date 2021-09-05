package observer;
/**
 * 
 * @author Brian
 * 
 */
public class Book {

private String title;
private String authorFirstName;
private String authorLastName;

/**
 * Constructor for Book
 * Initializes title, authorFirstName, and authorLastName
 * @param title
 * @param authorFirstName
 * @param authorLastName
 */
public Book(String title, String authorFirstName, String authorLastName){
    this.title = title;
    this.authorFirstName = authorFirstName;
    this.authorLastName = authorLastName;
}
/**
 * Accessor method for the title of a Book
 * @return the title of the Book as a String
 */
public String getTitle(){
return this.title;
}
/**
 * Accessor method for the Book author's first name
 * @return the authors first name as a String
 */
public String getAuthorFirstName(){
return this.authorFirstName;
}
/**
 * Accessor method for the Book author's last name
 * @return the authors last name as a String
 */
public String getAuthorLastName(){
return this.authorLastName;    
}
/**
 * Arranges the title and the authors first and last name
 * of a book into a single String
 * @return formatted String
*/
public String toString(){
    String book = (" - "+this.title +" by: " +this.authorFirstName +" " +this.authorLastName);
    return book;
}
}
