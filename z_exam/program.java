package z_exam;

import java.util.Arrays;

public class program {

	public static void main(String[] args) {

		int a = 10;
		int arr[] = {3,2,6};
		int stmp = 0;
		Arrays.sort(arr);
		
	

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % a == 0) {
				System.out.println(arr[i]);
			}else if (arr[2] % a == arr[i]){
				System.out.println(-1);
				
			}

		}
		

	}
	
	 public int solution(int num) {
	        int answer = 0;
	        
	        while (true){
	            
	       
	        if (num %2 == 0){
	            answer = num/2;
	        }else if(num %2 ==1){
	            answer = num*3+1;
	        }else if(num == 1){
	            break;
	        }
	            
	             }
	        
	        return answer;
	    }

}
