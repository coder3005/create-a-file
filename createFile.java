/* Create a File */
import java.io.*;
class createFile
{
    public static void main(String[] args) {
        
        File f=new File("C:\\Users\\Abhi Gupta\\downloads\\LC.txt");
        try
        {
            if(f.createNewFile())
            {
                 System.out.println("File Successfully Created..!");
            }
            else
            {
                System.out.println("File Already Exist..!");
            }
        }
        catch(IOException i)
        {
            System.out.println("Exception Handled..!");
        }
    }
}
