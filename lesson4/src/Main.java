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
       while(modifiedText.length()<197){
           modifiedText.append(" ");
       }
        System.out.println(modifiedText.reverse());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text");
        while (sc.hasNext()) {

            String str = sc.nextLine();
           // deleteRepeatableSymbols(str);
            toRight(str);

        }


    }

}
