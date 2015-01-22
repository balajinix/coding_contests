package srm645;

public class ConnecingCars {

	public static void main(String[] args) {
		int[] positions = {1, 3, 10, 20};
		int[] lengths = {2, 2, 5, 3};
		System.out.println(minimizeCost(positions, lengths));

	}
	
		  public static class Car {
		    public int id;
		    public long start;
		    public long end;
		    public long count;
		    public Car next;
		    public Car prev;
		  }
		  public static long minimizeCost(int[] positions, int[] lengths) {
		    int n = positions.length;
		    Car head = null; Car tail = null;
		    for (int i=0;i<n;i++) {
		      Car car = new Car();
		      car.id = i;
		      car.start = positions[i];
		      car.end = car.start + lengths[i];
		      car.count = 1;
		      car.next = null;
		      car.prev = null;
		      if (head == null) {head = car; tail = car;}
		      else { tail.next = car; car.prev = tail; }
		    }
		    return connect(head, 0);
		  }
		  public static long connect(Car head, long sum) {
		    long min = Integer.MAX_VALUE;
		    Car runner = head; long diff = 0; Car next1; long count = 0;
		    Car minCar = null;
		    Car otherCar = null;
		    while (runner.next != null) {
		      next1 = runner.next;
		      diff = next1.start - runner.end;
		      if (diff == 0) {
		        runner = runner.next;
		        continue;
		      }
		      count = (runner.count > next1.count) ? next1.count : runner.count;
		      diff *= count;
		      if (min > diff) { 
		        min = diff;
		        minCar = runner;
		        otherCar = next1;
		      }
		      runner = runner.next;
		    }
		    if (minCar != null) {
		      System.out.println(min);
		      sum += min;
		      mergeCar(minCar, otherCar);
		      return connect(head, sum); 
		    } else {
		      return sum;
		    }
		  }
		  public static void mergeCar(Car runner, Car next1) {
		    runner.count += next1.count;
		    runner.end = next1.end;
		    if (next1.next != null) {
		    	next1.next.prev = runner;
		    }
		    runner.next = next1.next;
		  }
		
}
