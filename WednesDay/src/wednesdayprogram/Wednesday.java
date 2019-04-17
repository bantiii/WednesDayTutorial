package wednesdayprogram;

public class Wednesday {

	public static void main(String[] args) {
		String Name = "Bantamelak";
		char[] charone = Name.toLowerCase().toCharArray();
		for(int i=0; i<=charone.length; i++){
			for(int j=i+1; j<=charone.length; j++){
				if(charone[i] == charone[j]){
					System.out.println("the duplicated value is then"+ i);
					System.out.println("First Conflicate  two");
					
				}
			}
		}
	}

}
