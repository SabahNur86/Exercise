package Exercise;

import java.util.Arrays;

public class ArrayNegatifToplaPozitifSay {
    public static void main(String[] args) {
//        Bir dizi içerisindeki pozitif tam sayı sayısını ve
//        negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.

        int arr1[]={5,9,-11,-14,36,3,-22};
        int arr2[]=new int[2];
        int toplam=0;
        int count=0;
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] < 0) {
                toplam += arr1[i];
            }
              else if (arr1[i] > 0) {
                    count++;

            }
        }
          arr2[0]=toplam;
          arr2[1]=count;
        System.out.println(Arrays.toString(arr2));

    }
}
