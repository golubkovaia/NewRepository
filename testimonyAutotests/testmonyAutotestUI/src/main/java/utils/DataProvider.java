package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.List;

/*public class DataProvider {
    private DataProvider(){}

    public static <SendFormData> Iterator<Object[]> sendPageTestData() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/sendPageData.json"))) {
            String json = "";
            String line = reader.readLine();
            while (line != null) {
                json += line;
                line = reader.readLine();
            }
            Gson gson = new Gson();
            List<SendFormData> sendFormData = gson.fromJson(json, new TypeToken<List<SendFormData>>() {
            }.getType());
            return sendFormData.stream().map((g) -> new Object[]{g}).collect(Collectors.toList()).iterator();
        }
    }
}
*/