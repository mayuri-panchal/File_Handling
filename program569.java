import java.io.*;
import java.util.*;

class program569
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;
        String FileName = null;

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {   
           FileOutputStream foobj = new FileOutputStream(fobj);
           String str = "Jay Ganesh..";

           foobj.write(str); // ERROR
        }
        else
        {
            System.out.println("There is no such file");
        }
       
        sobj.close();
    }
    
}
