package Week1.day1;

import org.junit.Test;

public class InsertElementArray {
	
	
	
	@Test
	public void example1()
	{
	int[] a = {1,2,3,5,6,7};
	int notoInsert = 4;
	insertElement(a,notoInsert);
	}

	private void insertElement(int[] a, int notoInsert) {
		int op[] = new int[a.length + 1];
		int i=0;
		for(;i<a.length;i++)
		{
		if(a[i]<notoInsert)
		{
		op[i]=a[i];
		}
		else
		{
		op[i] = notoInsert;
		break;
		}
		}
		
		//++i;
		for(; i<a.length; i++)
		{
		op[i+1]=a[i];
		}
		for(i=0;i<op.length;i++)
		{
		System.out.print(op[i]+",");
		}
		
	}
}





