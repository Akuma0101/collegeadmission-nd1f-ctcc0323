package AdmissionForm;

public class user {

private String username;
private String password;

public user (String username, String password){
    this.username = username;
    this.password = password;
}

public String getUsername(){
    return username;
}

public void setUsername(String username){
    this.username = username;
}

public void setPassword(String password){
    this.password = password;
}

public String getPassword(){
    return password;
}

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
