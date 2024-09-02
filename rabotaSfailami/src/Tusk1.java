import java.io.FileInputStream;
import java.io.IOException;

public class Tusk1 {

    private static final String basePath = System.getProperty("user.dir");

    public void method1() {

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(basePath + "/src/variant2.txt");

            int size = fileInputStream.available();
            System.out.println("size is: " + size);
            for (int i = 0; i < size; i++) {

                char symbol = (char) fileInputStream.read();

                System.out.println(symbol);
            }

        } catch (IOException e) {

        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {

                }
            }
        }

    }
}

