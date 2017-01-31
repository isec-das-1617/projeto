package export;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExportHtml extends Export{

    @Override
    public void exportText(String text, String path) {
        FileWriter fWriter = null;
        BufferedWriter writer = null;
        try {
            fWriter = new FileWriter(path);
            writer = new BufferedWriter(fWriter);
            writer.write(text);
            writer.newLine();
            writer.close();
        } catch (Exception e) {
            //catch any exceptions here
        }
    }
}
