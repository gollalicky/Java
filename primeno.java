package basic;

public class primeno {

	    int add;

	    public static void main(String[] args) {
	        add(10, 10);
	        add(10, 20, 40);
	        add(20, 30, 10, 50);
	    }

	    static void add(int a, int b) {
	        System.out.println(a + b);
	    }

	    static void add(int a, int b, int c) {
	        System.out.println(a + b + c);
	    }

	    static void add(int a, int b, int c, int d) {
	        System.out.println(a + b + c + d);
	    }
	}

