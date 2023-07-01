package week6.day4;



import java.util.Arrays;

import org.junit.Test;

public class FlippingAnImage {
       @Test
       public void example1() {
    	   int image[][]= {{1,1,0},{1,0,1},{0,0,0}};   
    	  System.out.println(flipAndInvertImage(image));
    	  // flipAndInvertImage(image);
       }

	private int[][] flipAndInvertImage(int[][] image) {
		//System.out.println(image.length);
		//System.out.println(Arrays.toString(image[0]));
		
		for(int i=0; i< image.length;i++) {
			int[] img=image[i];
			
			int left=0, right= img.length-1;
			while(left<right) {
				int temp=img[left];
				img[left++]=img[right];
				img[right--]=temp;
				
			}
			System.out.println(Arrays.toString(img));   
			left=0;
		while(left<img.length) {
				img[left]=	invertimage(img[left]);
			//	System.out.println(" inside if "+img[left]);
				left++;
				
			}
			System.out.println("after invert "+Arrays.toString(img));  
			image[i][i]=img[i];
		//	System.out.println(img[i]);
			
		}
		
		return image;	
	}

	private int invertimage(int i) {
		if(i==1) {
			return 0;
		}
		else {	
         return 1;
		}
	}
	}
