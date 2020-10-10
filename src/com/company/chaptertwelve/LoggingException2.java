package com.company.chaptertwelve;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author czy
 * @date 2020-9-28
 */
public class LoggingException2 {
	private static Logger logger =
			Logger.getLogger("LoggingException");
	static void logException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

	public static void main(String[] args) {
		try{
			throw new NullPointerException();
		}catch (NullPointerException e){
			logException(e);
		}
	}
}
