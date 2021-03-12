package com.company.chapterfifteen.covariant;

/**
 * @author czy
 * @date 2021/1/29
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.getValue();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder);
    }

    public static void main(String[] args) {
        Holder<Integer> raw = new Holder<>(1);
        f2(raw);
        Holder<Object> rawBasic = new Holder<>();
        rawBasic.setValue(new Object());
        f2(rawBasic);
        Holder<?> wildcarded = new Holder<>(1.0);
        f2(wildcarded);
    }
}
