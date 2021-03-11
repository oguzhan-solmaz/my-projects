
import java.util.Scanner;//input için fix gerekli

public class program {

    public static void main(String[] args) {
        int a,b,c,d,i,k,j;
        Scanner scan=new Scanner(System.in);
        System.out.println("ilk matrisin satir ve sutununu girin: ");
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println("ikinci matrisin satir ve sutununu girin: ");
        c=scan.nextInt();
        d=scan.nextInt();
        int matris1[][]=new int [a][b];
        int matris2 [][]=new int[c][d];
        int matris3[][]=new int[a][d];
        if(b!=c){
            System.out.println("matrisler carpilamaz çünkü birincinin sutun sayisi ikincinin satir sayisinden farkli");
        }
        else{
            System.out.println("birinci matrisin elemanlarini girin");
            for(i=0;i<a;i++){
                for(j=0;j<b;j++){
                    matris1[i][j]=scan.nextInt();//birinci matrisin elemanlarını alır
                }
                
            }
            System.out.println("ikinci matrisin elemanlarini girin");
            for(i=0;i<c;i++){
                for(j=0;j<d;j++){
                    matris2[i][j]=scan.nextInt();//ikinci matrisin elemanlarını alır
                }
            }
            //üçüncü matris tanımlama ve çarpma işlemi
            for(i=0;i<a;i++){
                for(j=0;j<d;j++){
                    for(k=0;k<b;k++){//ilk matris sütün sayısı ile ikinci matrisin satır sayısı aynı olmak zorunda olduğu için üçüncü for'u kullandık
                        matris3[i][j]=matris3[i][j]+matris1[i][k]*matris2[k][j];
                    }
                }
            }
            for(i=0;i<a;i++){//çarpım sonucu oluşan matrisi yazdırır
                for(j=0;j<d;j++){
                    System.out.print(matris3[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        
       

    }
}
