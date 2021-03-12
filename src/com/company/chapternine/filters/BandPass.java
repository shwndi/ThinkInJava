package com.company.chapternine.filters;

/**
 * 带通滤波器
 *
 * @author czy
 * @date 2020-7-25
 */
public class BandPass extends Filter {
    double lowCutOff, highCutOff;

    BandPass(double lowCutOff, double highCutOff) {
        this.lowCutOff = lowCutOff;
        this.highCutOff = highCutOff;
    }

    Waveform process(Waveform input) {
        return input;
    }
}
