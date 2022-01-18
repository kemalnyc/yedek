package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String readProperty(String property) {

        Properties properties = new Properties();

        try (FileInputStream input = new FileInputStream("config.properties")) {

            properties.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties.getProperty(property);
    }
}
