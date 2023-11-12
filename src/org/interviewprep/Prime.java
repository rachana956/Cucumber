package org.interviewprep;

public class Prime {
	
	public static void main(String[] args) {
		
		
		int n=15;
		
		for (int i = 0; i <=n; i++) {
			
			int flag=0;
			
			for (int j = 2; j < i; j++) {
				
				if(i%j==0) {
					flag=1;
					
					break;
				}
				
			}
			if(i>1 && flag==0) {
				
				System.out.println(i);
			}
		}
	}

}
