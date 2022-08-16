package HelloPrgm;

public class AggregationTest {
		Aggregation ag;
		double pi=3.14;
		double area(int radius) {
			ag=new Aggregation();
			int rsresult=ag.square(radius);
			return pi*rsresult;
		}
		public static void main(String[] args) {
			AggregationTest c=new AggregationTest();
			double result=c.area(5);
			System.out.println(result);
		}
	}
