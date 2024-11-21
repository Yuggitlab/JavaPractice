package simplejavaprograms;

import java.awt.*;

public class PatternBuilder {

    public void curtonAlphabets() {

        for (char i = 'G'; i >= 'A'; i--) {
            for (char c = 'A'; c <= i; c++) {
                System.out.print(c);
                if (c == i) {
                    for (char k = c; k > 'A'; k--) {
                        String curt = String.valueOf((char) (k - 1));
                        curt.split(String.valueOf(i));
                        System.out.print(curt);

                    }
                }
            }
            System.out.println("");

        }
    }
}
