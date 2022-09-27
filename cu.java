import java.util.Scanner;

/* klavyeden girilen sayıdan küçük , tek ve çift sayıların adetleri ve toplamlarını bulan java kodu*/
public class cu{    

    public static void main(String[] args){ 
      int a[]={4,8,3,1,18,9,21,20,5,17};
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int t=0,c=0,toplam=0;
      for(int i=0;i<a.length;i++){
        if(a[i]<x){
            if(a[i]%2==0){
                c++;
                toplam=toplam+a[i];
            }
            else{
                t++;
                toplam=toplam+a[i];
            }
        }
      }
    System.out.println(x+" sayısından küçük "+t+" adet tek ve "+c+" adet çift sayı bulunuyor ve toplamları da "+ toplam);

    }

}
