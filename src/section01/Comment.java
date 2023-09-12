package section01;

public class Comment {
	public static void main(String[] args) {
		System.out.println("Hello, Java!");
		int r = 10;
		// ;은 한 명령어를 끝냈다는 의미
		// 프로그래밍에서 =은 대입을 하겠다는 의미
		area(r); // area 라는 메서드 'r' 선언 = 'r'호출
	}
	/** JavaDoc 주석 (공식적인 주석이라 생각하면 됨)
	 * 원의 넓이를 구하는 메서드
	 * @param r - 반지름
	 */
	public static void area(int r) {
		// 원의 넓이
		double area = Math.PI * Math.pow(r, 2);
		//Math 
		System.out.println("원의 넓이 : " + area);
	}
	
}
