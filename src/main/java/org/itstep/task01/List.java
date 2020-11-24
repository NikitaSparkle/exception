package org.itstep.task01;

public class List{
    private Object[] obj;
    private int size;
    private int cur;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = new Object[size];
    }

    public void add(Object item) throws FullListException {
        if(obj[obj.length-1]!=null){
            throw new FullListException();
        }
        else {
            obj[cur++] = item;
        }
    }

    public void removeLast() throws EmptyListException{
        if(obj[obj.length-1]==null){
            throw new EmptyListException();
        }
        else {
            obj[--cur] = null;
        }
    }
}

class ListException extends Exception{
    public ListException() {
    }

    public ListException(String message) {
        super(message);
    }

    public ListException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListException(Throwable cause) {
        super(cause);
    }

    public ListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class EmptyListException extends ListException{
    public EmptyListException() {
    }

    public EmptyListException(String message) {
        super(message);
    }

    public EmptyListException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyListException(Throwable cause) {
        super(cause);
    }

    public EmptyListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class FullListException extends ListException{
    public FullListException() {
    }

    public FullListException(String message) {
        super(message);
    }

    public FullListException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullListException(Throwable cause) {
        super(cause);
    }

    public FullListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}