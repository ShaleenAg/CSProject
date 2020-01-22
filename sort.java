package aa;
import java.io.*;
import java.util.Arrays;
public class sort {
	
	static void recur_sort(int[] s,int n) {
		
		if(n==1) {
			return ;//base case
			
		}for(int i=0 ; i<n-1;i++) {
			if(s[i]>s[i+1]) {
				int temp= s[i];
				s[i]=s[i+1];
				s[i+1]=temp;
			}
		}recur_sort(s,n-1);
		
	}static void bubble(int[] s , int n) {
		int temp;
		boolean swap=false;
		
		for(int i =0 ; i<n-1;i++) {
			for(int j=0; j<n-1-i;j++) {
				if(s[j]>s[j+1]) {
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
					swap=true;
				}if(swap==false) {
					break;
				}
				
			}
		}
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Enter Array Length:- ");
		n=Integer.parseInt(br.readLine());
		int s[]=new int[n];
		for(int i=0 ; i<n;i++) {
			System.out.println("Enter value:- ");
			s[i]=Integer.parseInt(br.readLine());
		}
		recur_sort(s,n);
		System.out.println(Arrays.toString(s));

	}

}
