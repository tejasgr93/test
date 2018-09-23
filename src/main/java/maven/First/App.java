package maven.First;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Properties prop = new Properties();
        InputStream input = null;
        File file = new File("").getCanonicalFile();
        System.out.println("Parent directory : " + file.getParent());
     
        try {
            input = new FileInputStream(file.getParent() +"/resources/config2.properties");
             
            // load the properties file
            prop.load(input);
            System.out.println(prop.getProperty("dbpassword")); 
     
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
