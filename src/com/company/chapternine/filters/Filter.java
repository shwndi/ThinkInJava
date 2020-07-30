package com.company.chapternine.filters;

import com.company.chapternine.InterfaceProcessor;

/**
 * 过滤器
 *
 * @author czy
 * @date 2020-7-25
 */
public class Filter {

	String name() {
		return getClass().getSimpleName();
	}


	Waveform process(Waveform input) {
		return input;
	}
}
