public class DigitSum{
    public static void main(String[] args){
        int sum=0;
        int N=211;
            while(N>0){
                int temp= N%10;
                sum+=temp;
                N = N/10;
               
                
            }
             System.out.println(sum);
        }
       
    }
