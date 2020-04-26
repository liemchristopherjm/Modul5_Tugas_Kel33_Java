
package modul5_tugas_kel33_java;
import java.util.Scanner;
public class Modul5_Tugas_Kel33_Java {

    public static void main(String[] args) {
        String email, password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        userService satu = new userService( email, password );
        satu.login();
    }
    
}
