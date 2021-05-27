package number.to.lcd.model;

public class Digit1 extends Digit {

    @Override
    protected void initializeRows() {
        this.rows = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', '|'},
                {' ', ' ', '|'}
        };
    }

}
