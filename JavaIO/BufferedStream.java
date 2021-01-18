import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStream {
    public static void main(String[] args) {
        BufferedInputStream input = null;
        BufferedOutputStream output = null;
        try {
            input = new BufferedInputStream(new FileInputStream("dummy.txt"));
            output = new BufferedOutputStream(new FileOutputStream("getDummy.txt"));
            int data = input.read();
            while(data!=-1){
                output.write(data);
                data = input.read();
                
            }
            output.flush();
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                if(input!=null){
                    input.close();
                }
                if(output!=null){
                    output.close();
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }
        }
    }
}
