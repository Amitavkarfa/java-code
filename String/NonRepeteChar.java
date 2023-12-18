package String;

public class NonRepeteChar {
    public static void main(String[] args) {
        String str1="amitavkarfa";
        String str2="ananyaghosh";

        char[] arrstr1= str1.toCharArray();
        char[] arrstr2=str2.toCharArray();

        for(int i=0;i<arrstr1.length;i++){
            for(int j=0;j<arrstr2.length;j++){
                if(arrstr1[i] != arrstr2[j]){
                    System.out.println(arrstr1[i]);
                }

            }
            
            
            
        }

    }
    
}
