import java.util.*;

interface Apple{
	
	int seedCount = 0;
	static String color = "red";
	
	public static String myColor() {
		return color;
	}
	
}

public class Test implements Apple{

	public static void main(String [] args) {
		Apple a = new Apple();
	}
	
}

