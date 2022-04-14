package JCF.HotelExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SortHotel {
	Map<String,String> map = new HashMap<String,String>();
	public static void main(String[] args) {
		new SortHotel().service();
	}

	public int service() {
		int view = View.MENU;
		
		System.out.println("=====================================================");
		System.out.println("?��?�� 문이 ?��?��?��?��?��");
		System.out.println("=====================================================");
		
		while(true) {
			switch(view) {
			case View.MENU : view=menu(); break; //처음메뉴
			case View.CHECKIN : view=checkIn(); break;//체크?��
			case View.CHECKOUT : view=checkOut(); break;//체크?��?��
			case View.ROOMSTATE : view=roomState(); break;//객실?��?��
			}
		}
	}



	private int menu() {
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("?��?�� ?��무�?? ?��?��겠습?���??");
		System.out.println("1.체크?��  2.체크?��?�� 3.객실?��?�� 4.?��무종�?");
		System.out.println("=====================================================");
		System.out.print("메뉴 ?��?�� : ");
		Scanner sc = new Scanner(System.in);
		int menuSelect = sc.nextInt();
		switch(menuSelect) {
		case 1 : return View.CHECKIN;
		case 2 : return View.CHECKOUT;
		case 3 : return View.ROOMSTATE;
		case 4 :
			System.out.println("=====================================================");
			System.out.println("?��?�� 문을 ?��?��?��?��?��");
			System.out.println("=====================================================");
			System.exit(0);
			break;
		default: System.out.println("?��?�� ?��?��?��주세?��.");
		}
		return View.MENU;
		
	}

	
	
	
	public int checkIn() {
		System.out.println();
		System.out.println("?��?�� 방에 체크?�� ?��?��겠습?���??");
		Scanner sc = new Scanner(System.in);
		String roomSelect = sc.next();
		
		if(map.get(roomSelect)!=null) {
			System.out.println(roomSelect+"�? 방�? ?���? ?��?��?�� ?��?��?��?��.");
		} else {
			System.out.println("\n?��구�?? 체크?�� ?��?��겠습?���??");
			String whoCheckIn = sc.next();
			map.put(roomSelect,whoCheckIn);
			System.out.println("체크?�� ?��?��?��?��?��.\n");
		}
		return View.MENU;
	}

	
	
	
	
	private int checkOut() {
		System.out.println();
		System.out.println("?��?�� 방을 체크?��?�� ?��?��겠습?���??");
		Scanner sc = new Scanner(System.in);
		String roomSelect = sc.next();
		if(map.get(roomSelect)==null) {
			System.out.println(roomSelect+"�? 방�? 체크?�� ?�� ?��?��?�� ?��?��?��?��.");
		} else {
			map.remove(roomSelect);
			System.out.println("체크?��?�� ?��?��?��?��?��.\n");
		}
		return View.MENU;
	}
	
	
	
	
	
	private int roomState() {
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println("방번?�� : "+key+", ?��?���? : "+map.get(key));
		}
		return View.MENU;
	}
	
	
}