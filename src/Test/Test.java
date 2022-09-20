package Test;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		객체를 여러개 만들었고 이 객체를 하나의 변수로 핸들링하기 위해서 배열을 사용해왔다.
//		배열의 특징: 연속적인 공간, 순서가 있다. 선언된 배열의 크기를 변경하기 힘들다(단점)
//		자바개발에서는 ArrayList 자료형을 많이 사용합니다.
//		List의 하위개념이 ArrayList 일반적으로 자바에서는 List라고 많이 이야기 합니다.
//		List의 특징: 연속공간, 순서가 있다. 크기가 유동적이다. 사용하는만큼이다. 사용하기 더 편하다
//		방법: 사이즈, 인덱스(0부터 시작한다)
//		실제 면접에서는 배열과 List의 특징은 단골질문입니다.
		
		//선언 
		Member[] mlist1=new Member[10];
		ArrayList<Member> mlist2=new ArrayList<>();//crtl shift o
		
		System.out.println(mlist1.length);
		System.out.println(mlist2.size());//리스트는 사이즈 사용
		
		//입력
		Member m1=new Member("kim",23);
		
		for(int i=0; i<mlist1.length; i++) {
			if(mlist1[i]==null) {
				mlist1[i]=m1;//배열에 값을 지정하는 것.. 우리가 사용한 for는 빈칸을 찾는다
				break;
			}
		}
		
		mlist2.add(m1);
		
		//값 가져오기, 배열
		
		for(int i=0; i<mlist1.length; i++) {
			if(mlist1[i]!=null) {
				mlist1[i].prt();
			}
		}
		
		
		for (int i=0; i<mlist2.size(); i++) {
			mlist2.get(i).prt();
		}
		//List는 get을 사용하여 인덱스를 가져온다
		
		ArrayList<Member> mlist3=new ArrayList<>();
		Member m3=new Member("kim",11);
		Member m4=new Member("lee",22);
		mlist3.add(m3); //인덱스 0
		mlist3.add(m4); //인덱스 1
		mlist3.add(m4); //인덱스 2
		//값 가져오기
		mlist3.get(0);// 리턴된 주소를 무시
		Member mm=mlist3.get(0);
		Member mm1=mlist3.get(1);
		
		System.out.println(mlist3.get(0));
		System.out.println(mlist3.get(1)); // 1번인덱스와 2번인덱스는 같은 주소값을 참조하기 떄문에
		System.out.println(mlist3.get(2)); // 같은값이 출력된다.
		
		//리스트에서 값 가져오기
		
		for (int i=0; i<mlist3.size(); i++) {
			mlist3.get(i).prt();
		}
		
		m4.name="park"; //lee이름을 park으로 바꾸는 코드
		
		for (int i=0; i<mlist3.size(); i++) {
			mlist3.get(i).prt();
		}
		// mlist3 출력
		Member m5=new Member("choi",33);
		mlist3.add(m5);
		// choi,33 인 객체를 만들고 mlist4에 추가
		for (int i=0; i<mlist3.size(); i++) {
			mlist3.get(i).prt();
		}
		// mlist3 출력
		
		mlist3.remove(0);
		// mlist3의 0번 인덱스 삭제
		
		
		for (int i=0; i<mlist3.size(); i++) {
			mlist3.get(i).prt();
		}
		// mlist3 출력
		
		for(int i=0; i<mlist3.size(); i++) {
			System.out.println(mlist3.get(i).name);
		}
		
	}

}
