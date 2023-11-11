package defensiveprog;

import java.io.*;

public class ExcepTest {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        }
        System.out.println("Out of the block");
        try {
            String fileName = "example.txt";
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
        }catch (FileNotFoundException f) {
            f.printStackTrace();
            System.exit(-1);
        } catch (IOException i) {
            i.printStackTrace();
            System.exit(-1);
        System.out.println("Out of the second block");
        }
    }
}
