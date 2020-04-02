public class Test {
	public static void main(String as[]) {
		System.out.println("Kedar"+"\n"+new kd("kedar","Muchte"));
	}
}

class kd{
	String name;
	String ls;

	kd(String n, String s){

		name = n;
		ls = s;
	}

	public String toString(){
	System.out.println(name+"\n"+ls);
	return name + ls;
}
}

