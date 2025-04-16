class error{

	static void checkAge(int age){
		if(age<18){
			throw new ArithmeticException("Access Denied -  You Must Be Atleast 18 Year Old.");
		}else{
			System.out.println("Access Granted.");
		}
	}
	public static void main(String[] args){
		try{
			// int a[] = new int[5];
			// a[5] = 30/0;
			 // a[5]=10;
			 checkAge(17);
			 checkAge(19);
		}catch(ArithmeticException e){
			System.out.println("Error is Occurred: "+ e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error is Occurred: "+ e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error is Occurred: "+ e.getMessage());
		}
		
		try{
			checkAge(19);
				}catch(ArithmeticException e){
			System.out.println("Error is Occurred: "+ e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error is Occurred: "+ e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error is Occurred: "+ e.getMessage());
		}
		System.out.println("Program is Ended");
	}
}
