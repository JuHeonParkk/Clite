import java.util.*;

public class TypeMap extends HashMap<Variable, Type> { 

// TypeMap is implemented as a Java HashMap.  
// Plus a 'display' method to facilitate experimentation.
	public void display() {
		System.out.print("TypeMap = { ");
		Iterator<Variable> i = this.keySet().iterator();
		for (int w = 0; w < this.size(); w++) {
            Variable v = i.next();
            Type t = this.get(v);
            if (w + 1 != this.size())
                System.out.print("<" + v + ", " + t + ">, ");
            else
                System.out.print("<" + v + ", " + t + ">");
        }
        System.out.print(" }");
	}

}
