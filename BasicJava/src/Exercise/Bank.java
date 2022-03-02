package Exercise;

public class Bank extends Customer {
	//
	//은행의 고객목록
	private Customer[] customers;
	//은행의 고객수
	private int numberOfCustomers;
	
	//
	// 배열 크기를 10으로 초기화
	public Bank() {
		super(" ", " ");
	}
	
	//
	//인자로 받은 customer를 customers배열에 할당,
	//이후 numberOdCustomer의 값 1 증가
	public void addCustomer(Customer customer) {
		
		customers[] = customer;
		
		numberOfCustomers ++;
	}
	
	public int getNumberOfCustomers() {
		return 0;
	}
	
	//customers의 getter 
	public Customer[] getCustomers() {
		
	}
	
	// 배열의 index고객(Customer) 객체를 반환
	public Customer getCustomers(int index) {
		return 0;
	}


	
	

}
