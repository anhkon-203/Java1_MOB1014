/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_8_XuLyChuoi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author dungna29
 */
public class S3_BieThucChinhQuy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("Mời bạn nhập số: ");
            input = sc.nextLine();
        } while (!checkSo_Chu(input, 1));
        System.out.println("bạn thông minh lắm");
    }

    public static boolean checkSo_Chu(String text, int kieuCheck) {
        if (kieuCheck == 1) {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(text);
            return matcher.matches();
        }
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

}
