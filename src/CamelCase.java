import java.util.ArrayList;
import java.util.Arrays;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       For Example:

            my family live in united states

      Result should be

            My Family Live In United States

     */

    /*
           camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
           büyük harfe çevirip geri döndüren metodun yazınız.

           Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel

     */
//    public static void camelcase(String ceviri) {
//        String[] yeni=ceviri.split(" ");
//       // char sonuc=new charArray<>
//        for (int i = 0; i < ceviri.length(); i++) {
//          // sonuc=yeni[i].toUpperCase().charAt(0);
//        }
    public static String camelcase(String cumle)
    {
    String yeni="";
    String yeni1="";
    String [] kelimeler=cumle.split(" ");

        for (int i = 0; i < kelimeler.length ; i++)
    {

        yeni=yeni+" " + kelimeler[i].substring(0, 1).toUpperCase() + kelimeler[i].substring(1);

    } yeni1=yeni.trim();

        return yeni1;

}

        


}
