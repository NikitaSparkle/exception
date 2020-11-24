package org.itstep.task05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Runner runner = new Runner();
        try{
            runner.halt();
        }catch (RuntimeException rtEx){
            System.err.println("halt");
        }catch (IOException ioEx){
            throw ioEx;
        }
    }
}
