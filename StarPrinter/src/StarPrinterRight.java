
public class StarPrinterRight {

public static void main(String[] args) {
		
		int n = 5;
		boolean ps = true;
		
		for (int i = 1; i <= n; i ++ ) {
			
			
			for (int j = 1; j <= n; j++) {

				int t = (n - i);

				if (j <= t) 
					ps = false;
				else 
					ps = true;
			
				
				if (ps) 
					System.out.print("*" + " ");	
									
				else 
					System.out.print(" " + " ");	
											
			}
	
				System.out.println();
			}
			
		}
}