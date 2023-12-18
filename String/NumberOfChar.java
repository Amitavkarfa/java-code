package String;

public class NumberOfChar {
    public static void main(String[] args) {
        String str="ammiittt";
        char ch[]=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    }
             }
              System.out.println("value of"+ch[i]+ "is"+ count );
             
        }
       

    }
    
}
