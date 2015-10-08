//Had to leave at 2:00 for tennis match. 

public class HashFunction extends Hasher
{
	public int hash( Object obj )
	{
		String st = obj.toString(); 
		int code = 0;

		for ( int i = 0; i < st.length(); i++ )
		{
			code += (int) st.charAt(i);
		}

		return code;

	}

	public String getCoderName()
	{
		return "Jessica!";
	}
}