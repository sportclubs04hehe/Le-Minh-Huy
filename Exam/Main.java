package Exam;

public class Main {

    public static Complex sum(Complex otherNumber1, Complex otherNumber2) {
        Complex temp= new Complex(0,0);
        temp.realPart= otherNumber1.realPart + otherNumber2.realPart;  // cộng phần thực.
        temp.imaginaryPart= otherNumber1.imaginaryPart + otherNumber2.imaginaryPart;  // cộng phần ảo.

        return temp;
    }

    public static void TinhTong() {
        Complex phanthuc= new Complex(5.2, 4.4);
        Complex phanao= new Complex(2.0, 7.3);
        Complex temp= sum(phanthuc,phanao);
        System.out.printf("Tong la: "+ temp.realPart+" + "+ temp.imaginaryPart +"i");
        System.out.println("\nPhan thuc la: " + temp.realPart);
        System.out.println("\nPhan ao la: " + temp.realPart + "i");
        System.out.println("---------------------------------------------");

    }

    public static Complex brand(Complex otherNumber1, Complex otherNumber2) {
        Complex temp= new Complex(0,0);
        temp.realPart= otherNumber1.realPart - otherNumber2.realPart;
        temp.imaginaryPart= otherNumber1.imaginaryPart - otherNumber2.imaginaryPart;
        return temp;
    }

    public static void TinhHieu() {
        Complex phanthuc1= new Complex(5.2, 4.4);
        Complex phanao1= new Complex(2.0, 7.3);
        Complex temp1= brand(phanthuc1,phanao1);
        System.out.printf("\nHieu là: "+ temp1.realPart+" + "+ temp1.imaginaryPart +"i");
        System.out.println("\nPhan thuc la: " + temp1.realPart);
        System.out.println("\nPhan ao la: " + temp1.realPart + "i");
        System.out.println("---------------------------------------------");

    }

    public static Complex volume(Complex otherNumber1, Complex otherNumber2) {
        Complex temp= new Complex(0,0);
        temp.realPart= otherNumber1.realPart * otherNumber2.realPart  - otherNumber1.imaginaryPart* otherNumber2.imaginaryPart;
        temp.imaginaryPart= otherNumber1.realPart* otherNumber2.imaginaryPart + otherNumber1.imaginaryPart* otherNumber2.realPart;
        return temp;
    }

    public static void TinhTich() {
        Complex phanthuc1= new Complex(5.2, 4.4);
        Complex phanao1= new Complex(2.0, 7.3);
        Complex temp1= volume(phanthuc1,phanao1);
        System.out.printf("\nTich là: "+ temp1.realPart+" + "+ temp1.imaginaryPart +"i");
        System.out.println("\nPhan thuc la: " + temp1.realPart);
        System.out.println("\nPhan ao la: " + temp1.realPart + "i");
        System.out.println("---------------------------------------------");
    }

    public static Complex compassion(Complex otherNumber1, Complex otherNumber2) {
        Complex temp= new Complex(0,0);
        temp.realPart= otherNumber1.realPart * otherNumber2.realPart  - otherNumber1.imaginaryPart* otherNumber2.imaginaryPart;
        temp.imaginaryPart= otherNumber1.realPart* otherNumber2.imaginaryPart + otherNumber1.imaginaryPart* otherNumber2.realPart;
        return temp;
    }

    public static Complex divide(Complex otherNumber, Complex phanao1){
        double thuc = (otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart) / ( otherNumber.realPart* otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart);
        double ao = (otherNumber.realPart * otherNumber.imaginaryPart - otherNumber.realPart * otherNumber.imaginaryPart) / (otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart);
        return new  Complex(thuc, ao);
    }

    public static void TinhThuong() {
        Complex phanthuc1= new Complex(5.2, 4.4);
        Complex phanao1= new Complex(2.0, 7.3);
        Complex temp1= divide(phanthuc1,phanao1);
        System.out.printf("\nThuong là: "+ temp1.realPart+" + "+ temp1.imaginaryPart +"i");
        System.out.println("\nPhan thuc la: " + temp1.realPart);
        System.out.println("\nPhan ao la: " + temp1.realPart + "i");
    }


    public static void main(String args[]){
//        sum
        TinhTong();
//        brand
        TinhHieu();
//        Volume
        TinhTich();
//        divide
        TinhThuong();
    }

}
