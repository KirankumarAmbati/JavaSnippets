package com.java.kiran;

public class BubbleSort {
	
	public static int[] sort(int a[]){
		int swapped,i,j;
		long startTime=System.nanoTime();
		for(i=0;i<a.length-1;i++){
			swapped=0;
			
			for(j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=1;
				}
			}
			if(swapped==0){
				System.out.println("Breaked at "+i+" pass.");
				break;
			}
		}
		long endTime=System.nanoTime();
		System.out.println(endTime-startTime+"ns for Bubble Sort.");
		return a;	
	}

}
