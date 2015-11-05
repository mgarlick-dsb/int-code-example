package dsb;

import org.apache.log4j.Logger;

import java.io.*;


public class Main {

    public static final  String DIR = "fileIn/";
    public static final  String DEFAULT = "example.txt";
    final static Logger log = Logger.getLogger(Main.class);

    public static void main (String[] args){

        String fileName = (args.length > 0) ? args[0] : DEFAULT;

        try {
            String fileContent = TextFileReader.getFileContent(DIR + fileName);
            EntityExtractor entityExtractor = new EntityExtractor();
            entityExtractor.extractEntitiesFromText(fileContent);
        }
        catch(IOException e){
        	log.error(e);
        }
    }
}
