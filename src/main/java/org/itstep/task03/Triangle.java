package org.itstep.task03;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) throws CreateTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (side1 + side2 < side3) {
            throw new CreateTriangleException();
        }
    }

}

class CreateTriangleException extends Exception {
    public CreateTriangleException() {
    }

    public CreateTriangleException(String message) {
        super(message);
    }

    public CreateTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateTriangleException(Throwable cause) {
        super(cause);
    }

    public CreateTriangleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
