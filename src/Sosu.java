public class Sosu{
	public static void main(String[] args) {
		int i, n;
		int j = 0;
		int[] array = new int[500];
		array[j++] = 2;
		array[j++] = 3;
		
		for(n = 5; n < 500; n += 2) {
			for(i = 2; i < n; i++) {
				if(n % i == 0) {
					break;
				}
			}
			
			if(n == i) {
				array[j++] = i;
			}
		}
		
		for(int m : array) {
			System.out.println(m);
		}
		
	}
	
}