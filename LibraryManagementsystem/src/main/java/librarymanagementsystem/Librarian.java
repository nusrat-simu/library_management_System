
package librarymanagementsystem;


public class Librarian {
     private int ID;
    private String name;
    private String username;
    private String password;
    public Librarian(int ID, String name,String username,String password){
        this.ID= ID;
        this.name= name;
        this.username=username;
        this.password= password;
    }
        public void manageBooks(){
            System.out.println("Managing Books....");
        }
            public void manageStudents(){
                System.out.println("Managing Students....");
            }
}
