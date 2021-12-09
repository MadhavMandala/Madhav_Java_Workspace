import java.util.Arrays;
import java.util.Scanner;
public class MedianOf2Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    
	    
	    int count = 0;
	    

	    System.out.println("How many integers do you want in your first array?");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
	    for (int i = 0; i < arr1.length; i++) {
			System.out.print("Enter your Value: ");
			n = sc.nextInt();
			arr1[i] = n;
		}
	    System.out.println("How many integers do you want in your second array?");
		n = sc.nextInt(n);
	    int[] arr2 = new int[n];

	    
	    
	    
	    for (int i = 0; i < arr2.length; i++) {
			System.out.print("Enter your Value: ");
			n = sc.nextInt();
			arr2[i] = n;
		}
	    
	    
	    
	    int half1 = arr1.length/2;
	    int half2 = arr2.length/2;
	    int totalLength = arr1.length+arr2.length;
	    
	    if(arr1[half1] > arr2[half2]) {
	    	int i = half1;
	    	int j = half2;
	    	while( i<arr1.length) {
	    		
	    		if(arr1[i] > arr2[j]) {
	    			i--;
	    			j++;
	    		}else if(arr1[i] < arr2[j]) {
	    			break;
	    		}
	    		if (totalLength%2 == 1) {
		    		System.out.println(arr1[i]);
		    	}else {
		    		System.out.println((double)((arr1[i] + arr2[j])/2));
		    	}
	    	}
	    	
	    	
	    }else if(arr1[half1] < arr2[half2]) {
	    	int i = half1;
	    	int j = half2;
	    	while( i<arr1.length) {
	    		
	    		if(arr1[i] < arr2[j]) {
	    			i++;
	    			j--;
	    		} else if(arr1[i] > arr2[j]) {
	    			break;
	    		}
	    		
	    		
	    	}
	    	
	    	if (totalLength%2 == 1) {
	    		System.out.println(arr1[i]);
	    	}else {
	    		System.out.println((double)((arr1[i] + arr2[j])/2));
	    	}
	    	
	    	
	    }else if(arr1[half1] == arr2[half2]) {
	    	
	    	System.out.println(arr1[half1]);
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    /*
	    
	    int[] arr = new int[arr1.length+arr2.length];
	    
	    
	    for(int i = 0; i < arr1.length; i++) { 
	       arr[i] = arr1[i];
	       count++;
	    } 
	    for(int j = 0; j < arr2.length;j++) { 
	       arr[count++] = arr2[j];
	    } 
	    for(int i = 0;i < arr.length;i++) {
	    	System.out.print(arr[i]+" ");	
	    }
		
	    
		int temp = 0;
		int i = 1;
		while (i != 0) {
			i = 0;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					i++;
				}
			}
		}

		System.out.println("Sorted Array: " + Arrays.toString(arr));
		
		
		int num = arr.length/2;
		
		
		if (arr.length%2 == 1) {
			System.out.println(arr[num]);
		} else {
			
			System.out.println((double)(arr[num]+arr[num-1])/2);
			
		}
		*/
		
		
		
	}

}
