package br.com.cdbgl.core.localization;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class NameProvider {
    private NameProvider(){}
    
    private static Properties properties;
    private static final Properties defaultProperties;
    
    static {
        defaultProperties = new Properties();
        
        for(PropertiesEnum e : PropertiesEnum.values()){
            defaultProperties.setProperty(e.getKey(), e.getDefaultValue());
        }
        
        properties = new Properties(defaultProperties);
    }

    public static void registerPropertiesFile(FileInputStream file) throws IOException{
        properties = new Properties(defaultProperties);
        properties.load(file);
    }
    
    public static void registerPropertiesFile(Properties p){
        properties = new Properties(defaultProperties);
        properties.putAll(p);
    }
    
    public static String getName(String key){
        return properties.getProperty(key);
    }
}
