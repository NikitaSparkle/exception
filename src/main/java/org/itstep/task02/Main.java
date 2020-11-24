package org.itstep.task02;

public class Main {
    public static void main(String[] args) {
        int value1 = -1;
        int value2 = 1;
        int value3 = 101;

        try {
            getPositiveLessHundredNumber(value1);
            System.out.println("value 1 is ok");
        }catch(NegativeNumberException nnEx){
            System.err.println("Value 1 is negative");
        }catch (GreatHundredException ghEx){
            System.err.println("Value 1 is bigger than 100");
        }

        try {
            getPositiveLessHundredNumber(value2);
            System.out.println("value 2 is ok");
        }catch(NegativeNumberException nnEx){
            System.err.println("Value 2 is negative");
        }catch (GreatHundredException ghEx){
            System.err.println("Value 2 is bigger than 100");
        }

        try {
            getPositiveLessHundredNumber(value3);
            System.out.println("value 3 is ok");
        }catch(NegativeNumberException nnEx){
            System.err.println("Value 3 is negative");
        }catch (GreatHundredException ghEx){
            System.err.println("Value 3 is bigger than 100");
        }

    }

    public static void getPositiveLessHundredNumber(int value) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException();
        }
        if (value > 100) {
            throw new GreatHundredException();
        }
    }

    static class NegativeNumberException extends Exception {
        public NegativeNumberException() {
        }

        public NegativeNumberException(String message) {
            super(message);
        }

        public NegativeNumberException(String message, Throwable cause) {
            super(message, cause);
        }

        public NegativeNumberException(Throwable cause) {
            super(cause);
        }

        public NegativeNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }

    static class GreatHundredException extends RuntimeException {
        public GreatHundredException() {
        }

        public GreatHundredException(String message) {
            super(message);
        }

        public GreatHundredException(String message, Throwable cause) {
            super(message, cause);
        }

        public GreatHundredException(Throwable cause) {
            super(cause);
        }

        public GreatHundredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
