package orai24319;

import java.util.Scanner;

public class Orai24319 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        bmiSzamitas();
    }

    private static void bmiSzamitas() {
        focim();
        int m = bekeres(100, 200, "Testmagasság(cm)[100;200]: ");
        int t = bekeres(40, 150, "Testtömeg(cm)[40;150]: ");
        double bmi = bmiSzamit(t, m);
        ertekeles(bmi,m, t);
    }

    private static void focim() {
        System.out.println("BMI kiszátmiítása");
    }

    private static int bekeres(int also, int felso, String szoveg) {
        System.out.print(szoveg);
        int szam = sc.nextInt();
        if (szam < also || szam > felso){
            szam = sc.nextInt();
        }
        return szam;
    }

    private static double bmiSzamit(int tomeg, int magassag) {
        double bmi = tomeg / (((double)magassag/100)*((double)magassag/100));
        return bmi;
    }

    private static void ertekeles(double bmi, int m, int t) {
        String szoveg = "";
        if(bmi < 20){
            szoveg = "sovány";
        }
        else if(bmi > 20 && bmi <25 ){
            szoveg = "normal";
        }
        else if(bmi > 25 && bmi < 30){
            szoveg = "túlsúlyos";
        }
        else if(bmi > 30 && bmi < 40){
            szoveg = "elhízott";
        }
        else{
            szoveg = "kórosan elhízott";
        }
        System.out.printf("Ön %dcm magas és %dkg tömegű,\nígy a BMI indexe %.2f\nTehát ön %s testalkatú",m,t,bmi, szoveg);
    }
    
}
