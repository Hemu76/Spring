package autoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Control {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("web.xml");
		Vehicle ve = (Vehicle) ac.getBean("bike");
		ve.drive();
	}
}
