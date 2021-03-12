package com.company.chapternine.filters;

/**
 * @author czy
 * @date 2020-7-25
 */
public class HighPass extends Filter {
    double cutOff;

    HighPass(double cutOff) {
        this.cutOff = cutOff;
    }


    Waveform process(Waveform input) {
        return input;
    }
}
