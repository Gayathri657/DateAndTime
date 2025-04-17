import java.io.*;

public class fileReading {

    public static void main(String[] args) throws IOException {
        String path = "User\\gayathripamarthi\\java.txt";
        File file = new File(path);

        try (FileReader reader = new FileReader(file)) {

            int i = reader.read();
            while (i != -1) {
                System.out.println(i + "--->" + (char) i);
                i = reader.read();
            }
        } catch (Exception e) {
            System.out.println("Caught some exception");
        }
        try (FileReader reader = new FileReader(file)) {
            int size = (int) file.length();
            char[] ch = new char[size];
            reader.read(ch);
            for (char x : ch) {
                System.out.println(x);
            }
        
        } catch (Exception e) {
            System.out.println("Caught some exception" + e.getMessage());
        }

    }
}