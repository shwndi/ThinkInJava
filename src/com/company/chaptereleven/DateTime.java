package com.company.chaptereleven;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;

/**
 * @author czy
 * @date 2020-7-20
 */
public class DateTime {
	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.of(2018, 7, 20, 12, 30, 23);
		System.out.println(localDateTime);
		LocalDateTime d2 = localDateTime.withHour(0)
				.withSecond(0)
				.withMinute(0)
				.withNano(0);
		System.out.println(d2);

		Date date = new Date();
		Instant instant = date.toInstant();
		ZoneId zoneId = ZoneId.systemDefault();
		LocalDateTime.ofInstant(instant, zoneId);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		// 时
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		// 分
		calendar.set(Calendar.MINUTE, 0);
		// 秒
		calendar.set(Calendar.SECOND, 0);
		// 毫秒
		calendar.set(Calendar.MILLISECOND, 999);

		Date time = calendar.getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String format = df.format(time);
		System.out.println(format);
	}

}
