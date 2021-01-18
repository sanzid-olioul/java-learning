import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
class CustomBuffer extends FilterOutputStream{
    public CustomBuffer(OutputStream out){
        super(out);
    }
    @Override
    public void write(int b) throws IOException{
        if((b>=65 && b<=92 )||( b>97 && b<= 121)){
            super.write(b+2);
        }
    }
}
public class FilterStream {
    public static void main(String[] args) {
        
        FileOutputStream op = null;
        try {
            op = new FileOutputStream("getDummy.txt");
            CustomBuffer bf = new CustomBuffer(op);
            int x=System.in.read();
            bf.write(x);
            bf.flush();
        } catch (Exception e) {
            //TODO: handle exception
        }


    }
}
