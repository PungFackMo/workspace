package chapter21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Collection 인터페이스
//상속하는 인터페이스 : List, Set, Map
//Set 컬렉션
//저장 순서가 유지되지 않는다
//객체를 중복해서 저장할 수 없고, 하나의 null 만 저장할 수 있다
//수학의 집합과 비슷하다
public class HaseSetClass {
	
	public static void main(String[] args) {
		//HashSet
		//Set인터페이스를 구현한 클래스
		Set<String> set1=new HashSet<String>();
		Set<String> set2=new HashSet<>();
		
		//객체를 중복 없이 저장한다
		//저장 - add()
		Set<String> set=new HashSet<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("Spring boot");
		set.add("Java");
		set.add("JPA");
		//반복문을 이용할 때는 Iterator, for each 문 사용
		//Iterator 반복자
		//전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자라고 한다
		//next()메소드는 하나의 객체를 가져 올 때 사용
		//hasNext()메소드는 가져올 객체가 있으면 true
		//더 이상 가져올 객체가 없으면 false 리턴
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String s:set) {
			System.out.println(s);
		}
		//저장된 요소 수
		System.out.println(set.size()+"\n@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		//삭제 - remove(E element)
		set.remove("JDBC");
		set.remove("JPA");
		System.out.println(set.size());
		
		Iterator<String> itr1=set.iterator()	;
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		List<Person> pList=new ArrayList<>();
		pList.add(new Person("John doe1"));
		pList.add(new Person("John doe2"));
		pList.add(new Person("John doe3"));
		
		Iterator<Person> pItr=pList.iterator();
		while(pItr.hasNext()) {
			System.out.println(pItr.next());
		}
		
		//clear() - 모든 요소를 제거하고 비움
		set.clear();
		//isEmpty() - 컬렉션에 요소가 없는지 검증
		if(set.isEmpty()) System.out.println("set이 비어있음");
		
		
		
		
		
	}
}












