class PerfectNumber
{
	public static void main(String arg[])	
	{
	    int n,sum=0;	 
	    n=6;
	    int i=1;
	    while(i<=n/2)
	    {
	       if(n%i==0)
	       {
		sum+=i;
	       }
	      i++;
	    }
	if(sum==n)
	{
	System.out.println(n+" is a perfect number");
               } 
	else
	System.out.println(n+" is not a  perfect number"); 
	}
}

