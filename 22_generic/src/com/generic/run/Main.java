package com.generic.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.generic.model.vo.GenericTest;
import com.generic.model.vo.Product;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("유병승");
		list.add("신재민");
		
		/*String name = (String) list.get(0);
		String name2 = (String) list.get(1);*/
		String name = list.get(0);
		String name2 = list.get(1);
		
//		Map map = new HashMap();
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "진우");
		map.put("2", "성식");
		
		String name3 = (String) map.get("1");
		String name4 = (String) map.get("2");
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String temp = map.get(key);
			System.out.println(key + " " + map.get(key));
		}
		
//		HashMap map2 = new HashMap();
		HashMap<String, Product> map2 = new HashMap();
		map2.put("1", new Product("갤럭시 노트9", 100, 10));
		map2.put("2", new Product("아이뻐X", 190, 40));
		
		Set<Map.Entry<String, Product>> entry = map2.entrySet();
		Iterator<Map.Entry<String, Product>> it1 = entry.iterator();
		while (it1.hasNext()) {
			Map.Entry<String, Product> en = it1.next();
			String keytemp = en.getKey();
			Product ptemp = en.getValue();
			System.out.println(keytemp + " : " + ptemp);
		}
		
		GenericTest t = new GenericTest();
		// T : 생성할때 지정안하면 Object로 대입
		t.setName(new Product());
		System.out.println("generic : " + t.getName());
		
//		GenericTest<String> t2 = new GenericTest();
		GenericTest<String, Integer> t2 = new GenericTest();
		t2.setName("병승");
		System.out.println(t2.getName());
	}

}
