import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;


public class BigDecimal1 {

    public static void main(String[] args) {
        ArrayList<BigDecimal> list = new ArrayList<>();
//        BigDecimal b = 9;
        list.add(new BigDecimal("9"));
        list.add(new BigDecimal("-100"));
        list.add(new BigDecimal("50"));
        list.add(new BigDecimal("0"));
        list.add(new BigDecimal("56.6"));
        list.add(new BigDecimal("90"));
        list.add(new BigDecimal("0.12"));
        list.add(new BigDecimal(".12"));
        list.add(new BigDecimal("02.34"));
        list.add(new BigDecimal("000.000"));
        Collections.sort(list, Collections.reverseOrder());

        for(int i= 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }


    }
}
