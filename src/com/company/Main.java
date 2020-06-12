package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "Циклопентанпергидрофенантрен";    //вырезать подстроку с первого вхождения символа(А) до последнего вхождения символа(В)
        String str1 = str.substring(str.indexOf('п'), str.lastIndexOf('е'));
        System.out.println(str1);

        String str2=str.replace(str.charAt(3),str.charAt(0)); //поменять все вхождения символа, стоящего в позиции (3) на символ в позиции (0)
        System.out.println(str2);

        String[] strings = {"sos", "cake","place","wow"}; //найти в массиве строк слова-палиндромы
        for (int i=0; i<strings.length; i++){
            StringBuilder stringBuilder=new StringBuilder(strings[i]);
            stringBuilder.reverse();
            String word=stringBuilder.toString();
            if (word.equals(strings[i])){
                System.out.println(strings[i]);
            }
        }
    }
}
