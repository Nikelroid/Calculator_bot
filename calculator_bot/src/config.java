import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class config {
    String name;
    int _id;

        File configFile = new File("connectionConfig.properties");
        public config() {
            try {
                FileReader reader = new FileReader(configFile);
                Properties props = new Properties();
                props.load(reader);

                name = props.getProperty("name");
                _id = Integer.parseInt(props.getProperty("_id"));

                reader.close();
            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            }
    }
}
