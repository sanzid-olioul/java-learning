import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStream{
    public static void main(String[] args) {
        FileInputStream input = null;
        try {
            input = new FileInputStream("dummy.txt");
            
            while(true){
                int data = input.read();
                if(data==-1){
                    break;
                }
                System.out.write(data);
            }
           
            System.out.flush();
            

            //we can also do the same work without using loop.
            byte[] b = new byte[input.available()];
            input.read(b);
            System.out.write(b);
            System.out.flush();
            // same as while loop.
            // but it is not working because the file has already buffered.
            //we can also do 

            byte[] x = input.readAllBytes();
            //All are same...

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                if(input!= null){
                    input.close();
                }
               
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        FileOutputStream output = null;
        try {
            //FileOutputStream constructor first paramiter is file name, 2nd parameter is the (append ) option which is default false
            output = new FileOutputStream("dummy.txt",true);
            while(true){
                int inp = System.in.read();
                if(inp==10){
                    break;
                }
                output.write(inp);
            }
            output.flush();
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                output.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}