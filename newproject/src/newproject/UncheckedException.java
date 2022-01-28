package newproject;

public class UncheckedException {

	public static void main(String[] args)  {
		String pass = "techno";
		if(pass.length()>7);
		{
			throw new passwordException() ("password is Weak");
			
			
		}
		else
		{
			System.out.println("Password is Good");
		}
    public passwordException extends RuntimeException
    {
    	passwordException(String msg)
    	{
    		super(msg)
    	}
    }
	}

}
