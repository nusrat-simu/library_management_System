
package librarymanagementsystem;

public class Student {
    private int ID;
    private String name;
    private String username;
    private String password;
    public Student(int ID, String name,String username,String password){
        this.ID= ID;
        this.name= name;
        this.username=username;
        this.password= password;
    }
        public void borrowBooks(){
            System.out.println("Borrowing Books....");
        }
}
