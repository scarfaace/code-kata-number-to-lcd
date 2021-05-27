package number.to.lcd.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class LcdNumber {

    private List<Digit> digits;

}
