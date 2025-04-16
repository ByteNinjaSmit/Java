class base final{
	public void showb(){
		System.out.println("This is base class");
	}	
}

class derived extends base{
	public void showd(){
		System.out.println("This is derived class");
	}
}

class singli{
	public static void main(String[] args){
		derived d = new derived();
		d.showb();
		d.showd();
	}
}
