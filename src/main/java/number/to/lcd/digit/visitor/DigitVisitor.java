package number.to.lcd.digit.visitor;

import number.to.lcd.model.Digit1;
import number.to.lcd.model.Digit2;

public interface DigitVisitor {

    char[][] visitDigit1(Digit1 digit1);
    char[][] visitDigit2(Digit2 digit2);
    char[][] visitDigit3(Digit3 digit3);
    char[][] visitDigit4(Digit4 digit4);
    char[][] visitDigit5(Digit5 digit5);
    char[][] visitDigit6(Digit6 digit6);
    char[][] visitDigit7(Digit7 digit7);
    char[][] visitDigit8(Digit8 digit8);
    char[][] visitDigit9(Digit9 digit9);

}
