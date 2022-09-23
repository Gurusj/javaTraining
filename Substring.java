class Substring{
	public static void main(String args[]){

		String s = "I have joined Amantya on 01-09-2022";
		
		System.out.println(s.substring(s.lastIndexOf(" "),s.indexOf("-")));
		
	}
}