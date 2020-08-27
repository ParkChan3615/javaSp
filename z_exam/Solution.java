package z_exam;

import java.util.Scanner;

public class Solution {
	 public int solution(int n) {
	        int answer = 0;
	        for(n=2 ; n<1000000 ;n++){
	        for(int i=2; i<=n; i++){
	            if((n%i==0)&&(i==n)){
	                answer++;
	              }
	          }
	        }
	        return answer;
	    }
	 
	 
	 public static void main(String[] args) {
		// 별찍기
		 	int i=0;
		 	int j=0;
//			for (i = 0; i < 5; i++) {
//				for (j = 0; j <= i; j++) {
//					System.out.print("*");
//				}
//				System.out.println("");
//			}
	
		 	 Scanner sc = new Scanner(System.in);
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        int n=0;
		        int m=0;  
		        for(m=1;m<=b;m++){
		            for(n=1;n<=a;n++)
		            	if(n<a){
		                System.out.print("*");
		                }else{
		                	System.out.println("*");
		                }
		        }
	 }		
	 
	 
	 
	 
}