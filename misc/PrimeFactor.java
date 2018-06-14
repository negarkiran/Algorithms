public class PrimeFactor {
    public static void main(String[] args) {
        int n = 315;
        primeFactors(n);
    }

    private static void primeFactors(int n) {
        //print the number of 2s that divide n
        while(n%2==0){
            System.out.println(2+" ");
            n/=2;
        }

        for(int i=3;i<= Math.sqrt(n);i+=2){
            //While i divides n, print i and divide n
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
        if(n > 2)
            System.out.println(n);
    }
}
