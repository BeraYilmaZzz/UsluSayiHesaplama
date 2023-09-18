import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in) ;
        int n,k,total = 1;
        System.out.print("Üssünü almak istediğiniz değer : ");
        n= inp.nextInt();
        System.out.print("üs değeri :");
        k=inp.nextInt();
        //n çarpı k kere for döngüsü ile
        for (int i = 1 ; i<=k ; i++) {
            total =total *n ;
        }
        System.out.println("SONUÇ = " +total);
    }
}
