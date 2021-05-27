package number.to.lcd.model;

public class Digit2 extends Digit {

    @Override
    protected void initializeRows() {
        this.rows = new char[][]{
                {' ', '_', ' '},
                {' ', '_', '|'},
                {'|', '_', ' '}
        };
    }

}
