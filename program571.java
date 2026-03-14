import java.io.*;
import java.util.*;

class program571
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
           FileInputStream fiobj = new FileInputStream(fobj);

           byte Arr[] = new byte[50];

           fiobj.read(Arr);

           System.out.println(Arr);    // needs to be convert from byte to string
        }
        else
        {
            System.out.println("There is no such file");
        }
       
        sobj.close();
    }
    
}
