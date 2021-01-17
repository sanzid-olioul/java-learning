import java.io.*;
public class Basics{
    public static void main(String[] args) {
        //As system.out inherits the output Streams System.out also have 5 methods
        //1. write(int b);
        //2. write(byte[] b);
        //3. write(byte[],int off, int len);
        //4. flush();
        //5. close();
        /*
            we can use write any ascii value to the output stream , ie. write(int b);
            we can also use byte code to the output stream ,write(byte[] b);
            and we can also use byte array to the output stream. write(byte[],int off, int len);

            flash() is used to flashes the output stream forced to bufferd output to write...
            without flashing nothing will be shown .

            close() is used to close the stream.

            NB: write(byte[] b) and write(byte[],int off, int len) can throw throw IOExceptions.
            so we have to write them to try catch .

        */

        //1. write(int b);
        System.out.write(65);
        //System.out.close();
        System.out.flush();

        System.out.write(32);
        //Writing multiple charecter 
        for(int i=0;i<27;i++){
            System.out.write(i+65);
        }
        //System.out.close();
        System.out.flush();

        //2. write(byte[] b);
        System.out.write(32);
        String Name = "Sanzid Olioul";
        byte[] b = Name.getBytes();
        try{
            System.out.write(b);
        }catch(Exception e){
            System.out.print(e);
        }finally{
            //System.out.close();
        }
        System.out.flush();


        /*---------------------Input Stream-------------------*/
        //read() function returns an integer ascii value of charecter;
        //read(byte[] b); it takes a byte array paramiter
        //3. read(byte[],int off, int len); 


        //NB: we must have write them in try catch.
        try{
            int data = System.in.read();
            System.out.write(data);
        }catch(Exception e){
            System.out.print(e);
        }
        System.out.flush();


        try {
            byte[] x = new byte[15];
            System.in.read(x);
            System.out.write(x);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.print(e);
        }
        System.out.flush();
    
    }
}