package section02;

public class variable05 {
	public static void main(String[] args) {
		float f = 0.0f;
		
		//for 반복문, i++ -> i+i+1;
		// 0.1 을 100번 더해라
		for (int i = 0; i<100; i ++) {
			f += 0.1f ; //f= f+0.1f;
		}
		System.out.println(f);
	}

}
