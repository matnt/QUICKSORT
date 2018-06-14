package quicksort;

import java.util.Scanner;

public class QUICKSORT {
	
	int n;
	int[] k;
	Scanner in;
	public QUICKSORT() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QUICKSORT quick = new QUICKSORT();
		quick.input();
		quick.printResult();

	}
	
	public void input() {
		in = new Scanner(System.in);
		n = in.nextInt();
		k = new int[n];
		for(int i = 0; i < n; i++) {
			k[i] = in.nextInt();
		}
		quicksort(0, n - 1);
	}
	
	public void quicksort(int l, int r) {
		if(l <= r) {
			int v = (l + r)/2;
			int pivot = k[v];
			int i = l;
			int j = r;
			while (i <= j) {
				while(k[i] < pivot) i++;
				while(k[j] > pivot) j--;
				if(i <= j) {
					swap(i, j);
					i++;
					j--;
					
				}
			}
			if(l < j) quicksort(l, j);
			if(r > i) quicksort(i, r);
			
		}
	}
	
	public void swap(int a, int b) {
		int tmp = k[a];
		k[a] = k[b];
		k[b] = tmp;
	}
	
	public void printResult() {
		for(int i = 0; i < n; i++) {
			System.out.print(k[i]+ " ");
		}
	}

}
