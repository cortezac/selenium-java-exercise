package sandboxv2.GenericActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Properties;

public class GenericFileActions {
	public static boolean fileExists(String path) throws URISyntaxException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        URL res = classloader.getResource(path);
		
		File dlfile = Paths.get(res.toURI()).toFile();
		return dlfile.isFile();
	}
	
	public static void deleteFile(String path) {
		File dlfile = new File(path);
		dlfile.delete();
	}
	
	public static void deleteFileIfExists(String filename) throws Exception {
		File file = new File(filename);
		
		if(file.exists()) {
			file.delete();
		}
	}
	
	public static String getProperty(String path,String prop, String file) {
        String property = null;
        if(file==null) {
        	file = "prop.properties";
        }
        
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        
        if(!(path==null)) {
        	try {
        		
                URL res = classloader.getResource(path+file);
        		
                Properties    p  = new Properties();
                InputStream is	= new FileInputStream(Paths.get(res.toURI()).toFile());
                p.load(is);
                property=p.getProperty(prop);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
        	try {
        		
        		URL res = classloader.getResource(file);
        		
                Properties   p  = new Properties();
                InputStream is	= new FileInputStream(Paths.get(res.toURI()).toFile());
                p.load(is);
                property=p.getProperty(prop);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
        
        return property;
    }
    
    public static String getProperty(String prop) {
    	return getProperty(null,prop,null);
    }
    
    public static String getProperty(String prop, String file) {
    	return getProperty(null,prop,file);
    }
    
	
    public static String getEnvProperty(String path,String prop) {
        String property = null;
        
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        
        if(!(path==null)) {
	        try {

	            URL res = classloader.getResource(path+"envprop.properties");
	        	
	            Properties  p   = new Properties();
	            InputStream is	= new FileInputStream(Paths.get(res.toURI()).toFile());
	            p.load(is);
	            property=p.getProperty(prop);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
        }else {
        	 try {

 	            URL res = classloader.getResource("envprop.properties");
 	            
 	            Properties	p    = new Properties();
 	            InputStream is	= new FileInputStream(Paths.get(res.toURI()).toFile());
 	            p.load(is);
 	            property=p.getProperty(prop);
 	        } catch (Exception e) {
 	            e.printStackTrace();
 	        }
        }
        return property;
    }	

    public static String getEnvProperty(String prop) {
    	return getEnvProperty(null,prop);
    }
}
