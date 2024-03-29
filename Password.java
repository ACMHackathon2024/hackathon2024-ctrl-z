import java.util.Scanner;

public class Password {
    private String password;

    public Password(){
    }

    public String getPassword() {
        return password;
    }

    void checklength(String password){

        if(password.length()< 8){
            System.out.println("Weak Password");
        }else{
            System.out.println("Good Password");
        }
    }
    
    public static void main(String[] args) {
        String password;
        Password pass = new Password();
        System.out.println("Welcome to Ctrl+ Z's password strength tester!\n\n"
                + "Please give us your best password!\n"
                + "- Length\n- Alphanumeric\n- Mixed cases"
                + " and Special Characters: !@#$%^&*()-,./\n");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter password: ");
        password = myObj.nextLine();
        System.out.println("You entered: " + password + "\n");
        pass.checklength(password);
        myObj.close();

        // Tokenize the string using split method:
        // Read 
                    

        //Hello
    }
}