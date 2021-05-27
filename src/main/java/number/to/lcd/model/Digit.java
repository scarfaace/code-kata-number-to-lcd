package number.to.lcd.model;

public abstract class Digit {

//    protected final static int HEIGHT = 3;
//    protected final static int WIDTH = 3;

    protected char[][] rows;

    public Digit() {
        this.initializeRows();
    }

    abstract protected void initializeRows();

}
