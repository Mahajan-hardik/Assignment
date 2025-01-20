public class Prime{
    public static void main(String[] args){
        int n=50;
        //int a=2;
        int count;
        for(int i=1; i<=n; i++){
            count = 0;
          for(int j=2;j<=i/2;j++){
            
            if(i%j==0){
                count++;
                break;
                // System.out.println(a+"is prime");
            }
        }
        

        if(count == 0){
           System.out.println(i + "is prime");

        }
    }}
}
