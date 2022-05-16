package cop2805;

public class E_Max {
	 public static <E extends Comparable<E>> E max (E [] list) {
	        E maxValue = list[0];
	        for(int i = 0; i < list.length; i++) {
	            if(list[i].compareTo(maxValue) > 0) {
	                maxValue = list[i];
	            }
	        }
	        return maxValue;
	    }

	    public static void main(String[] args) {
	        String[] colors = {"Red","Green","Blue"};
	        Integer[] numbers = {1, 2, 3};
	        Double[] circleRadius = {3.0, 5.9, 2.9};

	        System.out.println("Colors: " + max(colors));
	        System.out.println("Numbers: " + max(numbers));
	        System.out.println("Circle Radius: " + max(circleRadius));
	    }
}
