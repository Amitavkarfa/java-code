package String;

public class reverse2 {
    public static void main(String[] args) {
        String str="ama";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        
        if(sb.equals(str)){
            System.out.println("lol");
        }
        else{
            System.out.println("ami jab");
        }
    }
    
}
