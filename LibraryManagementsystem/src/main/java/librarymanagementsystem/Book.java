
package librarymanagementsystem;


public class Book {
private int ID;
    private String title;
    private String description;
    private String publisher;
    public Book(int ID, String title,String description,String publisher){
        this.ID= ID;
        this.title= title;
        this.description=description;
        this.publisher= publisher;
    }
        public void add(){
            System.out.println("Adding new book" + title);
        }
         public void update(){
            System.out.println("Updating book details" + title);
         }
}
