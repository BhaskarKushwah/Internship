package array;

public class Loop_access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for (int d:a)
		{
			System.out.println(d);
		}
	}

}
