package chapter20;

import java.util.Calendar;
import java.util.GregorianCalendar;

//날짜와 시간
public class CalendarClass {
	public static void main(String[] args) {
		//Calendar 클래스
		//Calendar 는 추상클래스이기 때문에 직접 인스턴스를 생성할 수 없고,
		//메소드를 통해서 인스턴스를 대입 받아햐 합니다.
//		Calendar cal=new Calendar();	//에러 - 추상클래스는 인스턴스를 생성할 수 없다
		Calendar cal=Calendar.getInstance();
		//getInstance() 태국인 경우에는 BuddhistCalendar의 인스턴스를 반환
		//그 외에는 GregorianCalendar의 인스턴스 반환
		Calendar cal1=new GregorianCalendar();
		//특정 인스턴스를 생성하도록 프로그램이 작성되어 있다면
		//다른 종류의 역법을 사용한 국가에서 실행한다던가
		//새로운 역법이 추가된다던가 하는 경우
		//다른 죵류의 인스턴스를 필요로 하는 경우에 코드를 변경해야 된다
	}
}













