package autoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	public void drive() {
		System.out.println("hiiio");
	}
}

@Component
class bike implements Vehicle {
	@Autowired
	Lights lt;

	public void drive() {
		System.out.println(lt.getLights());
	}
}
