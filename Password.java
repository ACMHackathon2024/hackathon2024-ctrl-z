import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    void checkChar(String password){
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("I am a string");
        boolean b = m.find();
        if (!b){
            System.out.println("There is a special character in my string");
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
        pass.checkChar(password);
        myObj.close();

    }
}