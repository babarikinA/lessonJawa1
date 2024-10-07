package automatization;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tusk2 {

    private static final String basePath = System.getProperty("user.dir");

    public void metod1() {

        String text = "Hello java!";

        FileOutputStream fileOutputStream = null;

        try {

            fileOutputStream = new FileOutputStream(basePath + "/src/task2.txt");

            byte[] array = text.getBytes();

            fileOutputStream.write(array);

            fileOutputStream.close();

        } catch (IOException e) {

        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {

                }

            }
        }

    }

    public void metod2() {

        String text = "Hello java!";

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(basePath + "/src/task2.1.txt")) {

            byteArrayOutputStream.writeTo(fileOutputStream);

        } catch (IOException e) {

        }


    }

}

