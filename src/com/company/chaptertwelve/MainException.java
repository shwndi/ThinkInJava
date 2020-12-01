package com.company.chaptertwelve;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author czy
 * @date 2020-10-14
 */
public class MainException {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("mainException.java");
		file.close();
	}
}
