package com.company.chapterfifteen.covariant;

/**
 * @author czy
 * @date 2021/1/29
 */
public class Windcards {
    /**
     * 具体类型的参数
     *
     * @param holder
     * @param arg
     */

    static void rawArgs(Holder holder, Object arg) {
        holder.setValue(arg);
        holder.setValue(new Windcards());
        //T t= holder.getValue();
        Object value = holder.getValue();
    }

    /**
     * 无界通配符
     *
     * @param holder
     * @param arg
     */
    static void unboundedArg(Holder<?> holder, Object arg) {
// holder.setValue(arg);
// holder.setValue(new Windcards());
// T t =holder.getValue();
        Object value = holder.getValue();

    }
    static <T> T exact1(Holder<T> holder){
        T t = holder.getValue();
        return t;
    }
    static <T> T exact2(Holder<T> holder , T arg){
        holder.setValue(arg);
        T t =holder.getValue();
        return t;
    }
    static <T> T wildSubtype(Holder<? extends T> holder, T arg){
//        holder.setValue(arg);
        T t = holder.getValue();
        return t;
    }
    static <T> void wildSupertype(Holder<? super T> holder,T arg){
        holder.setValue(arg);
//        T t=holder.getValue();
        Object obj = holder.getValue();

    }

    public static void main(String[] args) {
        Holder raw = new Holder<>();
        raw = new Holder();
        Holder<Long> qualified = new Holder<>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounderd = new Holder<>();

        Long l = 1L;
        rawArgs(raw,l);
        rawArgs(qualified,l);
        rawArgs(unbounded,l);
        rawArgs(bounderd,l);

        unboundedArg(raw,l);
        unboundedArg(qualified,l);
        unboundedArg(unbounded,l);
        unboundedArg(bounderd,l);

    }
 }
