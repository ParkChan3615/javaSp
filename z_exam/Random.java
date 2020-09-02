package z_exam;

public class Random {
	public static void main(String[] args) {
		int a [] = new int [10];
		int a1 = (int)(Math.random()*28+1);
		for(int i=0; i<10;i++){
			a[i]= a1;
			for(int j= 0; j<i;j++){
				if(a[i]==a[j])
				{
					i--;
				}
			}
		}
		for( int b=0;b<10;b++){
			System.out.println(a[b]);
		}
	}


}
