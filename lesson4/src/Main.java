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

    static void rightJustify(String text) {
        StringBuilder modifiedText = new StringBuilder(text).reverse();
        while (modifiedText.length() < 197) {//197 is size of the console
            modifiedText.append(" ");
        }
        System.out.println(modifiedText.reverse());


    }


    static void BurrowsWheelerTransform() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text to transform:");
        String text = sc.next();
        String[] transformations = new String[text.length()];
        System.out.println("transformations:");
        //make transformations with a word
        for (int i = 0; i < transformations.length; i++) {
            transformations[i] = text.substring(1, transformations.length) + text.substring(0, 1);
            text = transformations[i];
            System.out.println(transformations[i]);
        }
        //sorting these transformations
        for (int i = transformations.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (transformations[j].compareTo(transformations[j + 1]) > 0) {
                    String tmp = transformations[j];
                    transformations[j] = transformations[j + 1];
                    transformations[j + 1] = tmp;
                }
            }
        }
        System.out.println("sorted in alphabetical order:");
        for (int i = 0; i < transformations.length; i++) {
            System.out.println(transformations[i]);
        }

        //taking last letters of sorted transformations
        StringBuilder lastLetters = new StringBuilder();

        for (int i = 0; i < transformations.length; i++) {
            lastLetters.append(transformations[i].charAt(transformations[i].length() - 1));
        }
        System.out.println("last letters:");
        System.out.println(lastLetters);

        sc.close();

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text");
        while (sc.hasNext()) {

            String str = sc.nextLine();
            deleteRepeatableSymbols(str);
            rightJustify(str);

        }
         BurrowsWheelerTransform();

    }

}
