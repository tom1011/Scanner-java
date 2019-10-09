import java.util.Scanner;
// this is how to import modules this is a default one that come with java.

public class javamian {

    public static void main (String[] args){
    String password = "word";
    Scanner myObj = new Scanner(System.in);
    // Scanner (calling the scanner ie input for someone to type in.)
    System.out.println("Enter username");
    String userName = myObj.nextLine();
    System.out.println("Enter password");
    String usertypedpassword = myObj.nextLine();
    myObj.close();
    
    System.out.println("Username is: " + userName);
   

    // nextline is where it takes the string/int/etc that someone types as the varabile
    // this program will say enter username the user will need to input that infor then hit entire when they hit return
    // it will then set that value = to userName

    

    }
}

