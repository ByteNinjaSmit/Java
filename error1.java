class error1{
	public static void main(String[] args){
		try{
			int a;
			int b;
			int sum = 10;
			for(int i = -1;i<3;++i){
				sum = (sum / i);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Try and Catch is Finished");
		
		}
	}
}
