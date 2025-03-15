import java.util.Scanner;
import java.io.File;
class filehand {
    public static void main(String[] args) {
        File f = new File("Exphand1.java"); //relative path because this file is in same folder
        try{
            Scanner r = new Scanner(f);
           while(r.hasNextLine()){
            System.out.println(r.nextLine());
           }
        }
           catch(Exception E){
            System.out.println(E);
           }
        
    }
}
