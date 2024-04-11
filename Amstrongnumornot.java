public class Amstrongnumornot{
    public static void main (String []args){
        int num=383;
        int temp=num;
        int res=0;
        int rem;
        int fact=0;
        while(num>0){
            rem=num%10;
            fact=rem*rem;
            num=num/10;
            res=res+fact;
        }
        System.out.println((res==temp)?"Amstrong number":"NOT Amstrong number");

    }
}