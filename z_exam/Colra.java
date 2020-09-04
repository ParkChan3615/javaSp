package z_exam;

import java.util.Arrays;

public class Colra {
	public static void main(String[] args) {
		int[] answer = {};
		int a = answer.length;
		Stion se = new Stion();
		se.solution(1234L);
		
		long bn = 12345;
	
//		System.out.println(as);
		 
	}
}
class Stion {
    public int[] solution(long n) {
        int[] answer = {};
        String a = "12345";
        a.charAt(0);
        
       
        int j = answer.length;
        for(int i=0;i<answer.length;i++){
            answer[i] = answer[j-i];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
