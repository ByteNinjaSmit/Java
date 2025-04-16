class sumeven{
	public static void main(String[] args){
		int sum = 0;
		for(int i=0;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println("The Sum of 0-100 Even Number is: "+sum);
		sum =0;
		for(int i=0;i<=100;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println("The Sum of 0-100 Odd Number is: "+sum);
		
		
	}
	
}
