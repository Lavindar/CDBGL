package br.com.cdbgl.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class NameProvider {
    private NameProvider(){}
    
    private static Properties properties;
    private static final Properties defaultProperties;
    
    static {
        defaultProperties = new Properties();
        
        InputStream f = NameProvider.class.getResourceAsStream("default.properties");
        
        if(f==null){
            throw new RuntimeException("Error at getting default.properties file on NameProvider class");
        }
        
        try {
            defaultProperties.load(f);
        } catch (IOException e) {
            throw new RuntimeException("Error at loading default.properties file on NameProvider class", e);
        }
        
        properties = new Properties(defaultProperties);
    }

    public static void registerPropertiesFile(FileInputStream file) throws IOException{
        properties = new Properties(defaultProperties);
        properties.load(file);
    }
    
    public static String getName(String key){
        return properties.getProperty(key);
    }
}
