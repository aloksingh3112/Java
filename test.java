import java.util.ArrayList;

public class test {

	public static void main(String[] args) throws Exception {
		ArrayList arr = new ArrayList();
		while(true) {
		StudentData st = new StudentData(90.0,100.0,80.0);
		arr.add(st);
		Thread.sleep(50);
		}
	}

}
