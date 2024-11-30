

package librarymanagementsystem;


public class LibraryManagementsystem {

     public static void main(String[] args){
        Librarian librarian= new Librarian(1,"Maruf","maruf234","maruf156");
        librarian.manageBooks();
        librarian.manageStudents();
        //create a student
        Student student= new Student(2,"Shakil","shakil234","shakil789");
        student.borrowBooks();
        
        //create a book
        Book book = new Book(101,"Java Programming","A comprehensive guide to java","Tech publisher");
        book.add();
        book.update();
    
    }
}
