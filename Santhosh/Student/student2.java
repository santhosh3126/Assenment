class Student2
{ 
	static int sum=0,n=1;
	static int total=0;

	public static void main(String[] args) 
	{
		int sam[]=new int[3];
		sam[0]=50;
		sam[1]=60;
		sam[2]=70;
		int ram[]=new int[3];
		ram[0]=80;
		ram[1]=90;
		ram[2]=95;

		for (int i=0;i<sam.length ;i++)
		{
			sum=sum+sam[i];

			System.out.println("Sam "+n+"st  subject mark  is"+ sam[i]);
			n++;
		
		}
		System.out.println("Sam CSE Department and Total mark is"+sum);


		System.out.println("***************");
			
		
        for (int j=0;j<ram.length;j++ )
        {
			total=total+ram[j];

			System.out.println("ram "+n+"st  subject mark  is"+ ram[j]);
			n++;
        }
		System.out.println("ram is CSE DEPT and total mark is   "+total);
		
	}
}