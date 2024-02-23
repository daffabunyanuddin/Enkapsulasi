
package enkapsulasi;

public class main {
    public static void main(String[] args) {
       userr user = new userr("hehe","hoho");
       
       user.setUsername("tani");
       user.setPassword("aaaaa");
       user.setStatus(true);
       user.setId(0);
       
        System.out.println("Usernsme : "+user.getUsername());
        System.out.println("password : "+user.getPassword());
    }
    
}
