package utils;import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static final Properties properties;

    static {
        try {
            // This is the path to the location of the file
            String configPath = "configuration.properties";

            // java can not read files directly, it needs inputStream to read files
            // inputStream takes the location of the file as a constructor
            FileInputStream fileInputStream = new FileInputStream(configPath);
            properties = new Properties(); // Properties is used to read specifically property files, Files contain Key value
            properties.load(fileInputStream); // File contents are loaded to the properties from the inputStream.
            fileInputStream.close(); // All input streams must be close
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load property files!");
        }
    }

    // returns the file property values
    public static String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
