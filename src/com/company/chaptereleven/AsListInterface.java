package com.company.chaptereleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author czy
 * @date 2020-8-19
 */
class Snow {
}

class Power extends Snow {
}

class Light extends Power {
}

class Heavy extends Power {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snows = Arrays.asList(new Crusty(), new Slush(), new Power());
        List<Snow> powers = Arrays.asList(new Light(), new Heavy());
        List<Snow> snows3 = new ArrayList<>();
        Collections.addAll(snows3, new Light(), new Heavy());
        /**
         * 显式类型参数说明
         */
        List<Snow> snows4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }

}
