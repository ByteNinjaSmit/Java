class sumnumber{
	public static void main(String[] args){
		int num = 251025;
		int sum = 0;
		while(num>0){
			int rem = num %10;
			sum = sum +rem;
			num = num /10;
		}
		System.out.println("The Sum Of the Number is: "+sum);
	}
}
