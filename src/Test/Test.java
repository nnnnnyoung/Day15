package Test;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		��ü�� ������ ������� �� ��ü�� �ϳ��� ������ �ڵ鸵�ϱ� ���ؼ� �迭�� ����ؿԴ�.
//		�迭�� Ư¡: �������� ����, ������ �ִ�. ����� �迭�� ũ�⸦ �����ϱ� �����(����)
//		�ڹٰ��߿����� ArrayList �ڷ����� ���� ����մϴ�.
//		List�� ���������� ArrayList �Ϲ������� �ڹٿ����� List��� ���� �̾߱� �մϴ�.
//		List�� Ư¡: ���Ӱ���, ������ �ִ�. ũ�Ⱑ �������̴�. ����ϴ¸�ŭ�̴�. ����ϱ� �� ���ϴ�
//		���: ������, �ε���(0���� �����Ѵ�)
//		���� ���������� �迭�� List�� Ư¡�� �ܰ������Դϴ�.
		
		//���� 
		Member[] mlist1=new Member[10];
		ArrayList<Member> mlist2=new ArrayList<>();//crtl shift o
		
		System.out.println(mlist1.length);
		System.out.println(mlist2.size());//����Ʈ�� ������ ���
		
		//�Է�
		Member m1=new Member("kim",23);
		
		for(int i=0; i<mlist1.length; i++) {
			if(mlist1[i]==null) {
				mlist1[i]=m1;//�迭�� ���� �����ϴ� ��.. �츮�� ����� for�� ��ĭ�� ã�´�
				break;
			}
		}
		
		mlist2.add(m1);
		
		//�� ��������, �迭
		
		for(int i=0; i<mlist1.length; i++) {
			if(mlist1[i]!=null) {
				mlist1[i].prt();
			}
		}
		
		
		for (int i=0; i<mlist2.size(); i++) {
			mlist2.get(i).prt();
		}
		//List�� get�� ����Ͽ� �ε����� �����´�
		
		ArrayList<Member> mlist3=new ArrayList<>();
		Member m3=new Member("kim",11);
		Member m4=new Member("lee",22);
		mlist3.add(m3); //�ε��� 0
		mlist3.add(m4); //�ε��� 1
		mlist3.add(m4); //�ε��� 2
		//�� ��������
		mlist3.get(0);// ���ϵ� �ּҸ� ����
		Member mm=mlist3.get(0);
		Member mm1=mlist3.get(1);
		
		System.out.println(mlist3.get(0));
		System.out.println(mlist3.get(1)); // 1���ε����� 2���ε����� ���� �ּҰ��� �����ϱ� ������
		System.out.println(mlist3.get(2)); // �������� ��µȴ�.
		
		//����Ʈ���� �� ��������
		
		for (int i=0; i<mlist3.size(); i++) {
			mlist3.get(i).prt();
		}
		
		m4.name="park"; //lee�̸��� park���� �ٲٴ� �ڵ�
		
		for (int i=0; i<mlist3.size(); i++) {
			mlist3.get(i).prt();
		}
		// mlist3 ���
		Member m5=new Member("choi",33);
		mlist3.add(m5);
		// choi,33 �� ��ü�� ����� mlist4�� �߰�
		for (int i=0; i<mlist3.size(); i++) {
			mlist3.get(i).prt();
		}
		// mlist3 ���
		
		mlist3.remove(0);
		// mlist3�� 0�� �ε��� ����
		
		
		for (int i=0; i<mlist3.size(); i++) {
			mlist3.get(i).prt();
		}
		// mlist3 ���
		
		for(int i=0; i<mlist3.size(); i++) {
			System.out.println(mlist3.get(i).name);
		}
		
	}

}
