package com.company.chaptereleven.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author czy
 * @date 2020-9-25
 */
public class MapTest {
	public static void main(String[] args) {
		Random random = new Random(47);
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < 10000; i++) {
			int j = random.nextInt(100);
			Integer num = m.get(j);
			m.put(j, num==null?1:++num);
		}
		m.containsKey(1);
		m.containsValue(1000);
		System.out.println(m);
	}
}
