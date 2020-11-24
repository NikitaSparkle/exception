package org.itstep.task06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {
    public static void main(String[] args) throws IOException {
        XmlReader[] xmlr = new XmlReader[5];
        readXml(xmlr);
    }

    public static void readXml(XmlReader[] xmlr) throws IOException {
        for (int i = 0; i < xmlr.length; i++) {
            try{
                xmlr[i].read();
            }catch (NullPointerException npEx){
                System.err.println("Null");
            }catch (Error error){
                System.err.println("Error");
            }catch (FileNotFoundException fnfEx){
                System.err.println("File not found");
            }catch (FileSystemAlreadyExistsException fsaeEx){
                throw new FileNotFoundException();
            }
        }
    }
}
