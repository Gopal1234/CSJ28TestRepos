package cyber.demos;

class Validator
{
	
	public static boolean validatePhone(String phone)
	{
		String mobileRegex="[678]{1}[0-9]{9}";
		boolean status=phone.matches(mobileRegex);
		return status;
	}
	public static boolean validateEmail(String email)
	{
	
		String regEx="[A-Za-z0-9_]+[@]{1}[a-z]+[.]{1}[a-z]{3}";
		boolean status1=email.matches(regEx);
		return status1;
		
	}
	
	
	
}




public class TestStringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean b=Validator.validatePhone("1147117572");
System.out.println(b);

boolean b1=Validator.validateEmail("upadhyay076gmail.com");
System.out.println(b1);
	}

}
