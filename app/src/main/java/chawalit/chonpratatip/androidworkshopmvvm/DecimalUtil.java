package chawalit.chonpratatip.androidworkshopmvvm;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DecimalUtil {

    public static String getValue(BigDecimal value){
        DecimalFormat formatter = new DecimalFormat("#,###,###.00");
        return String.valueOf(formatter.format(value));
    }

}
