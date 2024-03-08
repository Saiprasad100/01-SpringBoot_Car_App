package in.ashokit;

public class Car {
	private IEngine eng;
	  public Car(IEngine eng)
	  {
		  this.eng=eng;
	  }
	public void drive(){
		int status =eng.start();
		if (status>=1) 
		{
			System.out.println("Jurney Started");
		}
		else
		{
			System.out.println("Engine has Trouble");
		}
	}

}
