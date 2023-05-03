
/* Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("yarıçapı girin: ");
        double r = input.nextDouble();

        System.out.print("merkez açısının ölçüsü girin: ");
        double alpha = input.nextDouble();

        final double PI = 3.14;

        double alan = (PI * r * r * alpha) / 360;

        System.out.println("Daire diliminin alanı: " + alan);
    }
}