package Chapter08;

public class MyClass {
	RemoteControl rc = new Television();
	
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl rc) {
		RemoteControl rc2 = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}

}
