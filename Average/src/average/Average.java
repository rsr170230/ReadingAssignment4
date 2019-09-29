package average;

public class Average {
	public double average(int k, int[] list) {

        double average = 0;
        int n = Math.min(k, list.length);
        if( n > 0) {
                    for(int i = 0 ; i < n; i++){
                                average += list[i];
                                //System.out.println(list[i]);
                    }
                    average = average/n;
                    System.out.println(average);
        }
        return average;
	}
}