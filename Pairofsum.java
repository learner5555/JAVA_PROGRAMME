public class Pairofsum{
    public static void main (String []args){
        int a[]={2,3,4,5,6,7,8,};
        int n=0;
        System.out.println("Pair of 9:");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i]+a[j]==9){
                    System.out.println(+a[i]+","a[j]);
                }
            }
        }
    }
}