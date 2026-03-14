import java.io.*;
import java.util.*;

class program573
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        boolean bRet = false;
        String FileName = null;

        byte Arr[] = new byte[100];

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {   
           FileInputStream fiobj = new FileInputStream(fobj);

           iRet = fiobj.read(Arr);

           String str = new String(Arr);   // convert byte array to string

           System.out.println("iRet = "+iRet);
           System.out.println(str);   
        }
        else
        {
            System.out.println("There is no such file");
        }
       
        sobj.close();
    }
    
}
