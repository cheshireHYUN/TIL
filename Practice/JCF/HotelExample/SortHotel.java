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
		System.out.println("?˜¸?…” ë¬¸ì´ ?—´? ¸?Šµ?‹ˆ?‹¤");
		System.out.println("=====================================================");
		
		while(true) {
			switch(view) {
			case View.MENU : view=menu(); break; //ì²˜ìŒë©”ë‰´
			case View.CHECKIN : view=checkIn(); break;//ì²´í¬?¸
			case View.CHECKOUT : view=checkOut(); break;//ì²´í¬?•„?›ƒ
			case View.ROOMSTATE : view=roomState(); break;//ê°ì‹¤?ƒ?ƒœ
			}
		}
	}



	private int menu() {
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("?–´?–¤ ?—…ë¬´ë?? ?•˜?‹œê² ìŠµ?‹ˆê¹??");
		System.out.println("1.ì²´í¬?¸  2.ì²´í¬?•„?›ƒ 3.ê°ì‹¤?ƒ?ƒœ 4.?—…ë¬´ì¢…ë£?");
		System.out.println("=====================================================");
		System.out.print("ë©”ë‰´ ?„ ?ƒ : ");
		Scanner sc = new Scanner(System.in);
		int menuSelect = sc.nextInt();
		switch(menuSelect) {
		case 1 : return View.CHECKIN;
		case 2 : return View.CHECKOUT;
		case 3 : return View.ROOMSTATE;
		case 4 :
			System.out.println("=====================================================");
			System.out.println("?˜¸?…” ë¬¸ì„ ?‹«?•˜?Šµ?‹ˆ?‹¤");
			System.out.println("=====================================================");
			System.exit(0);
			break;
		default: System.out.println("?‹¤?‹œ ?…? ¥?•´ì£¼ì„¸?š”.");
		}
		return View.MENU;
		
	}

	
	
	
	public int checkIn() {
		System.out.println();
		System.out.println("?–´?Š ë°©ì— ì²´í¬?¸ ?•˜?‹œê² ìŠµ?‹ˆê¹??");
		Scanner sc = new Scanner(System.in);
		String roomSelect = sc.next();
		
		if(map.get(roomSelect)!=null) {
			System.out.println(roomSelect+"ë²? ë°©ì? ?´ë¯? ?‚¬?Œ?´ ?ˆ?Šµ?‹ˆ?‹¤.");
		} else {
			System.out.println("\n?ˆ„êµ¬ë?? ì²´í¬?¸ ?•˜?‹œê² ìŠµ?‹ˆê¹??");
			String whoCheckIn = sc.next();
			map.put(roomSelect,whoCheckIn);
			System.out.println("ì²´í¬?¸ ?˜?—ˆ?Šµ?‹ˆ?‹¤.\n");
		}
		return View.MENU;
	}

	
	
	
	
	private int checkOut() {
		System.out.println();
		System.out.println("?–´?Š ë°©ì„ ì²´í¬?•„?›ƒ ?•˜?‹œê² ìŠµ?‹ˆê¹??");
		Scanner sc = new Scanner(System.in);
		String roomSelect = sc.next();
		if(map.get(roomSelect)==null) {
			System.out.println(roomSelect+"ë²? ë°©ì? ì²´í¬?¸ ?•œ ?‚¬?Œ?´ ?—†?Šµ?‹ˆ?‹¤.");
		} else {
			map.remove(roomSelect);
			System.out.println("ì²´í¬?•„?›ƒ ?˜?—ˆ?Šµ?‹ˆ?‹¤.\n");
		}
		return View.MENU;
	}
	
	
	
	
	
	private int roomState() {
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println("ë°©ë²ˆ?˜¸ : "+key+", ?ˆ¬?ˆ™ê°? : "+map.get(key));
		}
		return View.MENU;
	}
	
	
}