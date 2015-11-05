package dsb;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jslap on 04/11/2015.
 */
public class TextFileReader {

    public static final Logger log = Logger.getLogger(TextFileReader.class);

    public static String getFileContent(String filePath) throws IOException {

        log.info("Reading file contents for file: " + filePath);

        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
           br = new BufferedReader(new FileReader(filePath));

            String s;
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
        }
        finally{
           if (br != null){
               br.close();
           }
        }
        return sb.toString();

    }
}
