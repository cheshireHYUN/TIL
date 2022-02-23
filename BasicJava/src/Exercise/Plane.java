package Exercise;

public class Plane {
	// �ʵ�
	private String manufacturer; //���ۻ�
	private String model; //�����𵨸�
	private int maxNumberOfPassengers; //�ִ�°���
	private static int numberOfPlanes; //���ݱ��� ������ ����� ��ü��, ���������� ����, ��ü ������ �����ڿ��� ����
	
	//������
	Plane(){
		
	}
	
	Plane(String manufacturer, String model, int maxNumberOfPassengers){
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	//�޼ҵ�
	
	public void setManufacture(String manufacturer) {
		if(manufacturer == null) {
			manufacturer = this.manufacturer;
		}else {
			this.manufacturer = manufacturer;
			}
	}
	public String getManufacture() {
		setManufacture(manufacturer);
		numberOfPlanes ++;
		return manufacturer;
	}
	
	
	
	public void setModel(String model) {
		if(model == null) {
			model = this.model;
		}else {
			this.model = model;
		}
	}
	public String getModel() {
		setModel(model);
		return model;
	}
	
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(model == null) {
			maxNumberOfPassengers = this.maxNumberOfPassengers;
		}else {
			 this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	public int getMaxNumberOfPassengers() {
		setMaxNumberOfPassengers(maxNumberOfPassengers);
		return maxNumberOfPassengers;
	}
	
	
	// numberOfplanes�� ���� ��ȯ�ϴ� ���� �޼ҵ�
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
//	public String toString() {
//		return;
//	}

}
