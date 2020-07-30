package com.company.chapternine.filters;

import java.io.File;

/**
 * 低通滤波器
 *
 * @author czy
 * @date 2020-7-25
 */
public class LowPass extends Filter {
	double cutOff;
	public LowPass(double cutOff){
		this.cutOff = cutOff;
	}
	public Object process(Object input){
		return  input;
	}

	@Override
	Waveform process(Waveform input){
		return  input;
	}
}
