package application;
import java.util.*;
public class hits {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int count=0;
		int str=s.nextInt();
		int k=0;
		while(k<3) {
		int w1=s.nextInt();
			arr[0]=w1;
			int w2=s.nextInt();
			arr[1]=w2;
			int w3=s.nextInt();
			arr[2]=w3;
		
		for(int j=0;j<3;j++) {
			if(arr[j]==str)
				count=count+1;
			if(j==1) {
				if(arr[1]==str)
					count+=1;
				if(arr[j]+arr[j+1]==str)
					count+=1;
				}
			/*if(j==2) {
				if(arr[2]==str)
					count+=1;
			}*/
			
		}
		System.out.println(count);
	}
	}
}
