class Sub1{

	private int no;
	private int speed;

	Sub1(){
		no = 0;
	}
	Sub1(int a){
		no = a;
	}
	void run(int speed){
		this.speed = speed;
	}
	void stop(){
		speed = 0;
	}
	void stop(int s){
		speed -= s;
		if(speed < 0) speed = 0;
	}
	void display(){
		System.out.println("no=" + no + "speed=" + speed);
	}
}
