package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute( String function ) {
		if (function.equals("앱") ) {
	          startApp();
	          return;
	      }
	      
	      super.execute( function );

	}
	
	  protected void startApp(){
		    System.out.print("앱 실행");
		  }
}
