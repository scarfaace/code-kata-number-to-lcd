package number.to.lcd;

import number.to.lcd.exceptions.InvalidDigitException;
import number.to.lcd.model.Digit;
import number.to.lcd.model.Digit1;
import number.to.lcd.model.Digit2;

public class LcdDigitFactory {

    public Digit createDigit(char realDigit) {
        switch (realDigit) {
            case '1': return new Digit1();
            case '2': return new Digit2();
            default: throw new InvalidDigitException(String.format("Digit '%s' not recognized", realDigit));
        }
    }

}
