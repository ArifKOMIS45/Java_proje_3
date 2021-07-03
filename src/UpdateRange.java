import java.util.Arrays;

public class UpdateRange {


    /*

    Update a method uRange

    parameters are int array and two ints

    if the int array has a number between the two int change it to -1

    for Example
    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    result should be 1,6,-1,-1,22,-1,30,-1

     */


    /*

    method URange update edin

    parametreler int array ve iki int olmalı

    Eğer int arrayde,  parametre olarak secilen iki int degeri arasında bir sayı veya sayılar  varsa,  sayı veya sayıları  -1 olarak değiştirin


    Örnek:

    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.

     */

    public static int[] uRange (int[] arr,int min,int max) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < max) arr[i] = -1;
        }
            return arr;
    }



}
