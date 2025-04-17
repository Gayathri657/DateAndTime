import java.io.*;

public class fileHandling {
    public static void main(String[] args) throws IOException {
        File file1 = new File("User\\gayathripamarthi\\java.txt");
        File directory = new File("Users\\gayathripamarthi\\Java");
        System.out.println(file1.createNewFile());
        System.out.println(file1.getPath());
        System.out.println(directory.mkdir());
        File file3 = new File("Users\\gayathripamarthi");
        System.out.println(file3.isDirectory());
        FileWriter writer = new FileWriter(file1);
        writer.write("Hello");
        writer.write("\n");
        writer.write(65);
        writer.close();
    }
}
