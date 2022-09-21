package Market;

import java.util.ArrayList;
import java.util.Scanner;


public class GoodsManager {
	
	ArrayList<Goods> mlist=new ArrayList<>();
	
	Scanner in=new Scanner (System.in);
	
	
	GoodsManager(){
		for(;;) {
			menu(); {
				int num=in.nextInt();
				in.nextLine();
				if(num==1) {
					inputGoods();
				}else if(num==2) {
					GoodsList();
				}else if(num==3) {
					modiGoods();
				}else if(num==4) {
					delGoods();
				}else if(num==5) {
					searchGoods();
				}
				
				
			}
		}
	}


	private void searchGoods() {
		// TODO Auto-generated method stub
		System.out.println("�˻��� �ܾ �Է����ּ���");
		String shName=in.nextLine();
		for(int i=0; i<mlist.size(); i++) {
			if(mlist.get(i).name.contains(shName)) {
				mlist.get(i).prt();
			}
		}
	}


	private void delGoods() {
		// TODO Auto-generated method stub
		System.out.println("������ ��ǰ�� �̸��� �Է��ϼ���");
		String delName=in.nextLine();
		boolean flag=true;
		for(int i=0; i<mlist.size(); i++) {
			if(mlist.get(i).name.equals(delName)) {
				mlist.remove(i);
				System.out.println("�����Ϸ�");
				flag=false;
				break;
			}	
		}
		if(flag) {
			System.out.println("�ش��ϴ� ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}


	private void modiGoods() {
		// TODO Auto-generated method stub
		System.out.println("������ ��ǰ�� �̸��� �Է��ϼ���");
		String modiName=in.nextLine();
		boolean flag=true;
		for(int i=0; i<mlist.size(); i++) {
			if(mlist.get(i).name.equals(modiName)) {
				System.out.println("�̸��� �������� �����ұ��?");
				String newName=in.nextLine();
				mlist.get(i).name=newName;
				System.out.println("���̵� �������� �����ұ��?");
				String newId=in.nextLine();
				mlist.get(i).id=newId;
				System.out.println("��� �󸶷� �����ұ��?");
				int newCnt=in.nextInt();
				in.nextLine();
				mlist.get(i).cnt=newCnt;
				System.out.println("�ܰ��� �󸶷� �����ұ��?");
				int newPrice=in.nextInt();
				in.nextLine();
				mlist.get(i).price=newPrice;
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("��ġ�ϴ� ��ǰ�� �����ϴ�.");
		}
		
	}


	private void GoodsList() {
		// TODO Auto-generated method stub
		for(int i=0; i<mlist.size(); i++) {
			mlist.get(i).prt();
		}
	}


	private void menu() {
		// TODO Auto-generated method stub

			System.out.println("1. ��ǰ���");
			System.out.println("2. ��ü����");
			System.out.println("3. ��ǰ����");
			System.out.println("4. ��ǰ����");
			System.out.println("5. ��ǰ�˻�");
			System.out.println("�޴�����");
			
	}


	private void inputGoods() {
		// TODO Auto-generated method stub
		Goods newGoods=new Goods();
		System.out.println("�̸� �Է�");
		String name=in.nextLine();
		System.out.println("���̵� �Է�");
		String id=in.nextLine();
		System.out.println("��� �Է�");
		int cnt=in.nextInt();
		in.nextLine();
		System.out.println("���� �Է�");
		int price=in.nextInt();
		in.nextLine();
		newGoods.st(name, id, cnt, price);
		mlist.add(newGoods);		
	}
	
	
	
	
}











