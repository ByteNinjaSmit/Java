class arm{
	public static void main(String[] args){
		int number = 153;
		int sum = 0;
		int num = number;
		
		while(number>0){
			int rem = number%10;
			sum = (rem * rem * rem) + sum;
			number = number /10;
		}
		if(sum==num){
			System.out.println("This is ArmStrong");
		}else{
			System.out.println("This is Not Armstrong");
		}
	}
}
