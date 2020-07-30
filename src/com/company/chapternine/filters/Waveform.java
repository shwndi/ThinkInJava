package com.company.chapternine.filters;

/**
 * 波形
 *
 * @author czy
 * @date 2020-7-25
 */
public class Waveform {
	private static long count = 0;
	private final long id = count++;

	public String toString() {
		return "Waveform" + id;
	}
}
