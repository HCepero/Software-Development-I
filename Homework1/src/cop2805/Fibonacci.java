package cop2805;

public class Fibonacci extends Thread {
		public static int fibonacci(int n){
		       if(n == 0) return 0;
		       if(n == 1) return 1;
		       return fibonacci(n-1) + fibonacci(n-2);
		   }
		   @Override
		public void run()
		{
		long k=System.currentTimeMillis();
		   int p=fibonacci(40);
		   k=System.currentTimeMillis()-k;
		   System.out.println("Using Fibonacci:\n Output is " +p+" \n time taken is "+k+"\n");
		}
		}



		class dp extends Thread {   

		public static int fibonacci(int n){
		   int v1=0,v2=1,v3=0;
		       for(int i=2 ;i <= n;i++){
		           v3 = v1 + v2;
		           v1 = v2;
		           v2 = v3;
		       }
		       return v3;
		   }
		   @Override
		public void run()
		{
		long k=System.currentTimeMillis();
		   int p=fibonacci(40);
		   k=System.currentTimeMillis()-k;
		   System.out.println("Using dp:\n Output is " +p+" \n time taken is "+k+"\n");
		}
		}



		public class driver
		{
		public static void main(String[] args)
		{
		Fibonacci r=new Fibonacci();
		   r.start();
		       dp d=new dp();
		       d.start();
		      
		}
		}
