import java.util.Scanner;

class Week6{
	public static void main(String [] args){
		if(args.length<1) {
			System.out.println("[�Է¿���]�ϳ��� ���ڿ��� �Է����� �ʾ� ���α׷��� �����մϴ�.");
			System.exit(1);
		}
		String word, st = args[0];
		int small=0, big=0;
		
		word = st.toUpperCase();
		
	 for(int i=0; i<st.length()-1; i++){
		 switch(word.charAt(i)){
		 case 'A': case 'E': case 'I': case 'O': case 'U': small++; break;
		 }
		 
		switch(word.charAt(i)){
		 case 'B': case 'C': case 'D': case 'F': case 'G': case 'H':
		 case 'J': case 'K': case 'L': case 'M': case 'N': case 'P': case 'Q':
		 case 'R': case 'S': case 'T': case 'V': case 'W': case 'X': case 'Y': case 'Z': big++; 
		 break;}
	 }
	
	System.out.printf("���� ����: %d\n",small);  	  
	System.out.printf("���� ����: %d\n",big);
	
	for(int i=st.length()-1; i>=0; i--)
		System.out.printf("%c",st.charAt(i));
	}
}