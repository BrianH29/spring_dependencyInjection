package com.bh.DI.Argument;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerArgumentResolver implements ArgumentResolver{
    @Override
    public Argument resolve(InputStream stream) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return new Argument(a,b);
    }
}
