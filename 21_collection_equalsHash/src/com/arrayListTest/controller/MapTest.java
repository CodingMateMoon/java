package com.arrayListTest.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Person;

public class MapTest {

	public void mapCando() {

		Map map = new HashMap();
		map.put(1, "병승");
		map.put(2, "재민");
		map.put(3, "찬웅");
		map.put(4, "lol");
		map.put(5, "정복");
		map.put("게임", "lol");
		System.out.println(map.get("병승"));
		System.out.println(map.get(1));
		System.out.println(map.get(3));
		// 키 값을 모를때는 어떻게?
		Set key = map.keySet();
		Iterator it = key.iterator();
		while (it.hasNext()) {
//			int k = (int) it.next();
//			System.out.println(map.get(k));
//			System.out.println(it.next());
			Object obj = it.next();
			if (obj instanceof Integer) {
				Integer k = (Integer) obj;
				System.out.println(map.get(k));
				System.out.println("key : " + k + ", value : " + map.get(k));
			} else if(obj instanceof String) {

				String k = (String) obj;
				System.out.println(map.get(k));
				System.out.println("key : " + k + ", value : " + map.get(k));
			}
		}
		
		Set set = map.entrySet();
		it = set.iterator();
		while (it.hasNext()) {
//			System.out.println(it.next());
			Map.Entry m = (Map.Entry) it.next();
			System.out.println("Map.Entry : " + m.getKey() + " " + m.getValue());
		}
		
		for (Object m : map.entrySet()) {
			Map.Entry temp = (Map.Entry) m;
			System.out.println("Map.Entry2 : " + temp.getKey() + " " + temp.getValue());
		}
		

		
		Set<Map.Entry> set1 = map.entrySet();
		Iterator<Map.Entry> it2 = set1.iterator();
		while (it2.hasNext()) {
//			System.out.println(it.next());
			Map.Entry m = it2.next();
			System.out.println("Iterator<Map.Entry> : " + m.getKey() + " " + m.getValue());
		}
	}
	
	public void map2() {
		
		Map map = new HashMap();
		HashMap map1 = new HashMap();
		// key value ! String으로 많이 선언!
		map.put("병승", new Person("유병승", 19, 180.5, 65.4));
		map.put("재민", new Person("신재민", 21, 140.5, 80.4));
		map.put(1, new Product());
		map.put(new Product(), new Person());			
		
		/*Set key = map.keySet();
		Iterator it = key.iterator();*/
		Set key = map.entrySet();
		Iterator it = key.iterator();
		
		while (it.hasNext()) {
//			Object key1 = it.next();
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
//			System.out.println(key1 + " : " + map.get(key1));
			/*if (key1 instanceof String) {
				String s = (String) key1;
				System.out.println(map.get(key1));
			} else if (key1 instanceof Integer) {
				Integer i = (Integer) key1;
				System.out.println(map.get(i));
			}*/
		}
	}
}

class Product{
	
}
