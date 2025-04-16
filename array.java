class array{
	public static void main(String[] args){
		int[] a = new int[10];
		for(int i = 0;i<10;i++){
			a[i]=i;
		}
		
		System.out.print("Data of an Array: ");
		for(int i=0;i<10;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println("");
	}
}
