
package modul5_tugas_kel33_java;

public class userService {
    private String[][] data = new String[2][3];
private String email, password, roles = "";
private String[][] histories = new String [2][4];
private String pel1, pel2, tanggal_pinjam = "";
    
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"chriskelompok33@gmail.com", "12345", "superAdmin"},
            {"allekelompok33@gmail.com", "12345", "user"} 
        };
        String [][] histories =
        {
            {"chriskelompok33@gmail.com", "Fisika Dasar", "Dasar Komputer Pemrograman", "25-04-2020" },
            {"allekelompok33@gmail.com", "Dasar Komputer Pemrograman", "Konsep Jaringan Kopmuter", "25-04-2020"}
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    pel1 = histories [i][1];
                    pel2 = histories [i][2];
                    tanggal_pinjam = histories [i][3];
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged in as user email " + email);
            System.out.println(pel1);
            System.out.println(pel2);
            System.out.println("Tanggal Pinjaman : " + tanggal_pinjam );
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }    
}
