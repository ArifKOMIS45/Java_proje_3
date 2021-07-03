public class SubtractionSquare {

    /*

     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */




    /*
   substSquare isminde bir method verildiğinde
   bu method parametre olara iki int alır
   return tipi int olur
   Parametresi iki tane int ve return tipi int olan substSquare methodu oluşturun
   getSumOfSquares methodunu kullanarak


Parameter 1 toplamin karesi+Parameter 1 toplamin karesi= sonuc


   Örnek:

    int 1 = 10;              yazacağınız method 10 u kullanarak 3250 sonucu verir

    int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir

    3025 + 225 = 3250

    return 3250
    */


    /*


    Create one method name is getSumOfSquares
    This method get one int as parameter
    Return type is int

    Find the sum of the numbers from 1 to your number
    Then find the square of the sum



    Parametresi bir tane int ve return tipi int olan getSumOfSquares methodu oluşturun.
    1 den girdiğiniz sayıya kadar olan sayıların toplamını bulun
    Sonra toplamın karesini bulun.



    for example:

    int is 10
     (1+2+...+10)²=55²=3025
     return 3025

     */

    public static int substSquare(int a, int b) {

        return (getSumOfSquares(a) +getSumOfSquares(b));

    }

    public static int getSumOfSquares(int a) {
int toplam=0;
int kare=0;
        for (int i = 1; i <=a ; i++) {
         toplam=toplam+i;

        }kare=toplam*toplam;
        return kare;

    }




}
