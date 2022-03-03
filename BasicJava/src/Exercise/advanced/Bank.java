package Exercise.advanced;
// 실선 : 포함한다
// 1:1로 포함한다
//뱅크는 customer를 포함한다
public class Bank {
	//
	//은행의 고객목록
	private Customer[] customers = null;
	//은행의 고객수
	private int numberOfCustomers;
	
	//
	// 배열 크기를 10으로 초기화
	public Bank() {
		// 은행의 고객목록이 초기화되어있으므로
		customers = new Customer[10];
	}
	
	//
	//인자로 받은 customer를 customers배열에 할당,
	//이후 numberOdCustomer의 값 1 증가
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers++] = customer;
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	//customers의 getter 
	public Customer[] getCustomers() {
		return customers;
	}
	
	// 배열의 index고객(Customer) 객체를 반환
	public Customer getCustomers(int index) {
		return customers[index];
	}


	
	

}
