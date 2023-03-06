package xay_dung_lop_Fan;

import static xay_dung_lop_Fan.Fan.MEDIUM;
import static xay_dung_lop_Fan.Fan.SLOW;

public class DemoFan {
    public static void main(String[] args) {
        Fan senko = new Fan(SLOW , true , 24.5 , "xanh duong");
        Fan toshiba = new Fan(MEDIUM , false , 22.3 , "vang");

        System.out.println("Senko: " + senko.toString());
        System.out.println("Toshiba: " + toshiba.toString());
    }
}
