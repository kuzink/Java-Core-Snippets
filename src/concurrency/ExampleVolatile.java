package concurrency;

public class ExampleVolatile {


	public static void main(String[] args) throws InterruptedException {
		MyTest myTest = new MyTest();
		myTest.test();
	}
}

class MyTest {

	int result = 0;

	void test() throws InterruptedException {

		System.out.println("initial value: " + result);


		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				result++;
				System.out.println("111 " + result);
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				result++;
				System.out.println("222 " + result);
			}
		});
		Thread thread3 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				result++;
				System.out.println("333 " + result);
			}
		});

		thread1.start();
		thread2.start();
		thread3.start();

//		thread1.join();
//		thread2.join();
//		thread3.join();

		System.out.println("end value: " + result);

		Thread.sleep(600);

		System.out.println("end value: " + result);

	}
}