package com.company.chapternine;

import java.util.Arrays;

/**
 * 完全解耦
 *
 * @author czy
 * @date 2020-7-25
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("UserProcessor" + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new UpCase(), s);
        process(new DownCase(), s);
        process(new SplitCase(), s);
    }
}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}

class UpCase extends Processor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class DownCase extends Processor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class SplitCase extends Processor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}



