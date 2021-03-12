package GZQ.Arrays;

import java.util.Date;
import java.util.List;

/**
 * @author czy
 * @date 2021/2/25
 */
public class Test {
    private Date sta;
    private String userId;
    private List<Question> list;

    public static void main(String[] args) {
        for (int i = g(); i < h(); i = m(i)) {
            System.out.println("第" + (i + 1) + "次循环");
        }
    }

    static int g() {
        System.out.println("g()");
        return 0;
    }

    static int h() {
        System.out.println("h()");
        return 3;
    }

    static int m(int i) {
        System.out.println("m(" + i + ")");
        return i + 1;
    }
}
