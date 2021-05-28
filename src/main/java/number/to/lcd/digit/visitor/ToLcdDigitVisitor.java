package number.to.lcd.digit.visitor;

import number.to.lcd.model.Digit1;
import number.to.lcd.model.Digit2;

public class ToLcdDigitVisitor {

    private static final int DIGIT_HEIGHT = 1;
    private static final int DIGIT_WIDTH = 1;

    private static final int GRID_HEIGHT = 3*DIGIT_HEIGHT-DIGIT_HEIGHT;
    private static final int GRID_WIDTH = 3*DIGIT_WIDTH;


    char[][] visitDigit1(Digit1 digit1) {
        char[][] grid = new char[GRID_HEIGHT][GRID_WIDTH];
        for(int row = 0; row < GRID_HEIGHT; row++) {

        }
    }

    char[][] visitDigit2(Digit2 digit2){

    }

    char[][] visitDigit3(Digit3 digit3){

    }

    char[][] visitDigit4(Digit4 digit4){

    }

    char[][] visitDigit5(Digit5 digit5){

    }

    char[][] visitDigit6(Digit6 digit6){

    }

    char[][] visitDigit7(Digit7 digit7){

    }

    char[][] visitDigit8(Digit8 digit8){

    }

    char[][] visitDigit9(Digit9 digit9){

    }

}
