import java.awt.Robot;
import java.awt.event.InputEvent;

public class Main {

	public static void main(String[] args) {
		try {

			while (true) {
				Robot r = new Robot();
				int button = InputEvent.BUTTON1_DOWN_MASK;
				r.mousePress(button);
				System.out.println("Click");
				Thread.sleep(200);
				r.mouseRelease(button);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
