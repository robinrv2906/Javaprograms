package com.statement;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {//hashmap  key allow single null/ values allow dublicate null//
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(10, "Robin");
		m.put(11, "kanchana");
		m.put(12, "navin");
		m.put(null, "Arun");
		m.put(13, "Arun");
		m.put(14, null);
		m.put(15, null);
		m.put(null, "Raja");
		m.put(null, "Aruna");
		System.out.println(m);
	}
}
