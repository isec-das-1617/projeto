package export;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExportHtml extends Export{

    @Override
    public void exportText(String text, String path) {
        ArrayList<String> refer = new ArrayList<>();
        int n = 1;
        Pattern p = Pattern.compile("\\\\cite\\{(.*?)\\}");
        Matcher m = p.matcher(text);
        while (m.find()) {
            if(!refer.contains(m.group(1))){
                text = text.replace("\\cite{" + m.group(1) + "}", "[" + n + "]");
                refer.add(m.group(1));
                n++;
            }
        }
        
        String title = "Title";
        String[] div = path.split("\\\\");
        title = div[div.length - 1].replace(".html", "");
        
        FileWriter fWriter = null;
        BufferedWriter writer = null;
        try {
            fWriter = new FileWriter(path);
            writer = new BufferedWriter(fWriter);
            writer.write("<!DOCTYPE html>");writer.newLine();
            writer.write("<html>");writer.newLine();
            writer.write("<head>");writer.newLine();
            writer.write("<title>" + title + "</title>");writer.newLine();
            writer.write("</head>");writer.newLine();
            writer.write("<body>");writer.newLine();
            String[] linhas = text.split("\n");
            for(int i=0;i<linhas.length;i++){
                writer.write("<p>" + linhas[i] + "</p>");
                writer.newLine();
            }
            writer.write("</body>");writer.newLine();
            writer.write("</html>");
            writer.close();
        } catch (Exception e) {
            //catch any exceptions here
        }
    }
}
