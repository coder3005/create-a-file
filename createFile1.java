/* Create a File */
import java.io.*;
class createFile
{
    public static void main(String[] args) throws IOException {
        
        File f=new File("C:\\Users\\Abhi Gupta\\downloads\\LC.txt");

            if(f.createNewFile())
            {
                 System.out.println("File Successfully Created..!");
            }
            else
            {
                System.out.println("File Already Exist..!");
            }
    }
}
