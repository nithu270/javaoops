import java.io.File;
import java.io.FileWriter;
class filewrite {
    public static void main(String[] args) {
        try{
        File f = new File("eg.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("hello");
        fw.close();
    }
    catch(Exception E){
        System.out.println(E);
    }
}
}
