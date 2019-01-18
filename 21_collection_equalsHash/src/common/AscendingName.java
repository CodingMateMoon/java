package common;

import java.util.Comparator;

import com.collection.model.vo.Person;

public class AscendingName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		
		// 앞에 있는 문자가 사전순으로 봤을 때 더 작으면 음수
		// 앞에 있는 문자가 사전순으로 더 크면 양수
		// 두 문자가 같으면 0
		return p1.getName().compareTo(p2.getName());
	}
	
	
}
