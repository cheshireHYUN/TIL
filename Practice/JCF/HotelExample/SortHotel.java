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
		System.out.println("?Έ? λ¬Έμ΄ ?΄? Έ?΅??€");
		System.out.println("=====================================================");
		
		while(true) {
			switch(view) {
			case View.MENU : view=menu(); break; //μ²μλ©λ΄
			case View.CHECKIN : view=checkIn(); break;//μ²΄ν¬?Έ
			case View.CHECKOUT : view=checkOut(); break;//μ²΄ν¬??
			case View.ROOMSTATE : view=roomState(); break;//κ°μ€??
			}
		}
	}



	private int menu() {
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("?΄?€ ?λ¬΄λ?? ??κ² μ΅?κΉ??");
		System.out.println("1.μ²΄ν¬?Έ  2.μ²΄ν¬?? 3.κ°μ€?? 4.?λ¬΄μ’λ£?");
		System.out.println("=====================================================");
		System.out.print("λ©λ΄ ? ? : ");
		Scanner sc = new Scanner(System.in);
		int menuSelect = sc.nextInt();
		switch(menuSelect) {
		case 1 : return View.CHECKIN;
		case 2 : return View.CHECKOUT;
		case 3 : return View.ROOMSTATE;
		case 4 :
			System.out.println("=====================================================");
			System.out.println("?Έ? λ¬Έμ ?«??΅??€");
			System.out.println("=====================================================");
			System.exit(0);
			break;
		default: System.out.println("?€? ?? ₯?΄μ£ΌμΈ?.");
		}
		return View.MENU;
		
	}

	
	
	
	public int checkIn() {
		System.out.println();
		System.out.println("?΄? λ°©μ μ²΄ν¬?Έ ??κ² μ΅?κΉ??");
		Scanner sc = new Scanner(System.in);
		String roomSelect = sc.next();
		
		if(map.get(roomSelect)!=null) {
			System.out.println(roomSelect+"λ²? λ°©μ? ?΄λ―? ?¬??΄ ??΅??€.");
		} else {
			System.out.println("\n?κ΅¬λ?? μ²΄ν¬?Έ ??κ² μ΅?κΉ??");
			String whoCheckIn = sc.next();
			map.put(roomSelect,whoCheckIn);
			System.out.println("μ²΄ν¬?Έ ???΅??€.\n");
		}
		return View.MENU;
	}

	
	
	
	
	private int checkOut() {
		System.out.println();
		System.out.println("?΄? λ°©μ μ²΄ν¬?? ??κ² μ΅?κΉ??");
		Scanner sc = new Scanner(System.in);
		String roomSelect = sc.next();
		if(map.get(roomSelect)==null) {
			System.out.println(roomSelect+"λ²? λ°©μ? μ²΄ν¬?Έ ? ?¬??΄ ??΅??€.");
		} else {
			map.remove(roomSelect);
			System.out.println("μ²΄ν¬?? ???΅??€.\n");
		}
		return View.MENU;
	}
	
	
	
	
	
	private int roomState() {
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println("λ°©λ²?Έ : "+key+", ?¬?κ°? : "+map.get(key));
		}
		return View.MENU;
	}
	
	
}