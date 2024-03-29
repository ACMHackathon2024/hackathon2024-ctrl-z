public class Password {
    private String password;

    public String getPassword() {
        return password;
    }

    void checklength(String password){

        if(password.length()< 8){
            System.out.println("Weak Passord");
        }
    }
    
}
