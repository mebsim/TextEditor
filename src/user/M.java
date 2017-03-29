package user;

import org.lwjgl.input.Mouse;

public class M {
	
	public int scroll() {
	    int dWheel = Mouse.getDWheel();
	    if (dWheel < 0) {
	    	// System.out.println("DOWN");
	        return 50;
	    } else if (dWheel > 0){
	    	// System.out.println("UP");
	        return -50;
	   }
	   return 0;
	}
	public int mousePosY() {
		System.out.println(Mouse.getY());
		return Mouse.getY();
	}
	
	public boolean mouseClick() {
		System.out.println(Mouse.isButtonDown(0));
		return Mouse.isButtonDown(0);
	}

}
