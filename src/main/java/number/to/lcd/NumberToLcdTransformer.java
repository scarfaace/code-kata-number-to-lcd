package number.to.lcd;

import number.to.lcd.model.Digit;
import number.to.lcd.model.LcdNumber;

import java.util.ArrayList;
import java.util.List;

public class NumberToLcdTransformer {

    private final LcdDigitFactory lcdDigitFactory;

    public NumberToLcdTransformer(LcdDigitFactory lcdDigitFactory) {
        this.lcdDigitFactory = lcdDigitFactory;
    }

    public LcdNumber transform(String numberString) {
        List<Digit> lcdDigits = new ArrayList<>();
        for (int i = 0; i < numberString.length(); i++){
            char digitOfNumber = numberString.charAt(i);
            Digit lcdDigit = lcdDigitFactory.createDigit(digitOfNumber);
            lcdDigits.add(lcdDigit);
        }
        return LcdNumber.builder()
                .digits(lcdDigits)
                .build();
    }

}
