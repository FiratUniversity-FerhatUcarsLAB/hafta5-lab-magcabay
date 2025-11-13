/*
 * Ad Soyad: Miraç Özcan Ağcabay
 * Ogrenci No: 250541002
 * Tarih: 13.11.2025
 * Açıklama: Görev 1 - Geometrik Şekil Hesaplayıcı
 *
 * Bu program temel geometrik şekillerin alan ve
 * çevre hesaplamalarını yapar.
 */
package Kasım7Hafta7;
import java.util.Scanner;

public class GeometriHesap {


    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }


    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }


    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }


    public static double calculateTrianglePerimeter(double a, double b, double c) {

        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRİK ŞEKİL HESAPLAYICI ===");
        System.out.println();

        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunluğu (cm): ");
        double squareSide = input.nextDouble();

        // DİKDÖRTGEN bilgileri
        System.out.println("\nDİKDÖRTGEN:");
        System.out.print("Kısa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();

        // DAİRE bilgileri
        System.out.println("\nDAİRE:");
        System.out.print("Yarıçap (cm): ");
        double radius = input.nextDouble();

        // ÜÇGEN bilgileri
        System.out.println("\nÜÇGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yükseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();

        // HESAPLAMALAR
        double kareAlan = calculateSquareArea(squareSide);
        double kareCevre = calculateSquarePerimeter(squareSide);

        double dikdortgenAlan = calculateRectangleArea(rectWidth, rectHeight);
        double dikdortgenCevre = calculateRectanglePerimeter(rectWidth, rectHeight);

        double daireAlan = calculateCircleArea(radius);
        double daireCevre = calculateCircleCircumference(radius);

        double ucgenAlan = calculateTriangleArea(base, height);
        double ucgenCevre = calculateTrianglePerimeter(side1, side2, side3);


        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUÇLARI");
        System.out.println("========================================");

        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        System.out.printf("Alan: %.2f cm² | Çevre: %.2f cm\n", kareAlan, kareCevre);

        System.out.printf("\nDİKDÖRTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        System.out.printf("Alan: %.2f cm² | Çevre: %.2f cm\n", dikdortgenAlan, dikdortgenCevre);

        System.out.printf("\nDAİRE (yarıçap: %.1f cm):\n", radius);
        System.out.printf("Alan: %.2f cm² | Çevre: %.2f cm\n", daireAlan, daireCevre);

        System.out.printf("\nÜÇGEN (taban: %.1f cm, yükseklik: %.1f cm):\n", base, height);
        System.out.printf("Alan: %.2f cm² | Çevre: %.2f cm\n", ucgenAlan, ucgenCevre);

        System.out.println("========================================");

        input.close();
    }
}
