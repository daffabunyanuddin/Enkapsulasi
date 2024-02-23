
package enkapsulasi;


public class userr {
    
    private String username ;
    private String password ;
    private int id;
    private boolean status; //true : menikah, false : jomblo
    
    public userr(){
        System.out.println("int constructor");
    }

    public userr(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

  
}
