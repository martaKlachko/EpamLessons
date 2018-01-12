import com.sun.org.apache.xerces.internal.util.ShadowedSymbolTable;

import java.util.Scanner;

/**
 * Created by User on 10.01.2018.
 */
public class Main {
    static void deleteRepeatableSymbols(String text) {
        StringBuilder modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != modifiedText.length() - 1) {
                if (modifiedText.charAt(i) == modifiedText.charAt(i + 1)) {
                    while (modifiedText.length() > 1 && modifiedText.charAt(i) == modifiedText.charAt(i + 1)) {
                        modifiedText.deleteCharAt(i + 1);
                        if (i > 0) {
                            i -= 1;
                        } else {
                            i = 0;
                        }
                    }
                }
            }

        }


        System.out.println(modifiedText);
    }

    static void toRight(String text) {
        StringBuilder modifiedText = new StringBuilder(text).reverse();
        while (modifiedText.length() < 197) {
            modifiedText.append(" ");
        }
        System.out.println(modifiedText.reverse());
    }


    static void BurrowsWheelerTransform(String text) {
        char[][] words = new char[text.length()][text.length()];
        char[] textToArray = new char[text.length()];
        for (int i = 0; i < textToArray.length; i++) {
            textToArray[i] = text.charAt(i);
        }
        for (int i = 0; i < textToArray.length; i++) {

            char[] transformedArray = new char[text.length()];

            transformedArray[transformedArray.length - 1] = textToArray[0];

            for (int j = 0; j < textToArray.length - 1; j++) {
                transformedArray[j] = textToArray[j + 1];
            }
            words[i] = transformedArray;

            textToArray = transformedArray;

            for (int k = 0; k < transformedArray.length; k++) {
                System.out.print(transformedArray[k]);

            }
            System.out.println();


        }
//        char[][] sorted = new char[4][4];
//        char[] min = words[0];
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (words[i][j] < min[j]) {
//                    min = words[i];
//                    sorted[i] = min;
//                }
//
//            }
//
//        }
//        System.out.println("!!!!!!!!!!!");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(sorted[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//

        System.out.println("last letters:");
        for (char[] word : words
                ) {

            System.out.print(word[3]);

        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text");
        while (sc.hasNext()) {

            String str = sc.nextLine();
            deleteRepeatableSymbols(str);
            toRight(str);

        }
      //  BurrowsWheelerTransform("java");

    }

}
