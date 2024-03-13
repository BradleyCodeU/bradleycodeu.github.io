import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class JsonLoader {
    public static List<Object> loadBirdsFromJson(File file) {
        List<Object> birds = null;
        try (Reader reader = new FileReader(file)) {
            // Define the type of the list of birds
            Type listType = new TypeToken<List<Bird>>() {}.getType();
            
            // Parse the JSON file into a list of Bird objects
            birds = new Gson().fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return birds;
    }
}
