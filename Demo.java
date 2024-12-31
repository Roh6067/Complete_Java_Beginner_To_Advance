class Mythread extends Thread{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
			
		}
}
}
class Demo{
public static void main(String a[]) throws InterruptedException{
Mythread t=new Mythread();
t.start();
t.join(500); 
for(int i=0;i<4;i++)
{	System.out.println("Main Thread");}
}
}
