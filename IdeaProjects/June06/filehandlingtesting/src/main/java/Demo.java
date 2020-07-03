import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Demo {
    //file handling
    //date and time
    //unit testing
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Mehak Singla\\IdeaProjects\\June06\\filehandlingtesting\\src\\main\\resources\\data.txt" );
        System.out.println(file.exists());
        System.out.println(file.isDirectory());


//        try (FileInputStream Stream = new FileInputStream(file)) {
//            while (stream.read()!= -1){
//                System.out.println(stream.read());
//            }
//        }catch (IOException ex){
//
//        }

//        Path path = Paths.get("data.txt");          //or
        Path path = Paths.get("src", "main", "resources", "data.txt" );
        //System.out.println(path.toString());    //or
        System.out.println(path.toAbsolutePath().toString());

        Files.copy(path, Paths.get("mydata.txt"));
        Files.createDirectories(Paths.get("data"));

        Path path2 = Files.createDirectories(Paths.get("data"));
        Files.deleteIfExists(path2);

            List<String> strings = Files.readAllLines(path);
            for (String str: strings) {
                System.out.println(str);
            }

            String str = "Learning Java is Good !";

            ///Files.write(path, str.getBytes() , StandardOpenOption.APPEND );

            Scanner scanner = new Scanner(path);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

//        OutputStream stream = new FileOutputStream(path.toFile());
//        stream.write(str.getBytes());

            FileWriter writer = new FileWriter(path.toFile());
            writer.write(str);
            writer.close();

    }
}
