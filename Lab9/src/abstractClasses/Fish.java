package abstractClasses;

import abstractClasses.Interface.Swimable;

public class Fish extends Animal  implements Swimable {

	    public Fish(String name) {
	        super(name);
	      
	    }

	  

	    public void swim() {
	        System.out.println(name + " is swimming like a fish");
	    }
	}


