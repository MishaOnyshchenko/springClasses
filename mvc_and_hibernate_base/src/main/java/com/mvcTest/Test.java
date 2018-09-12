package com.mvcTest;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {

        String str = "https://commerc.herokuapp.com/rest/rate/usd/";
        URL url = new URL(str);
//        String urlP = new URL(str).getPath();
//        System.out.println(urlP);

        Scanner in = new Scanner((InputStream) url.getContent());

        String res = "";

        while (in.hasNext()) {
            res += in.nextLine();
        }

        System.out.println(res);

    }

}
