import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;
        String jawab;


        while (running) {

            String nama, nim;
            byte angka;

            do {
                System.out.print("Masukan Nama Anda [1..25] : ");
                nama = input.next();
            } while (nama.length() < 1 ||nama.length() > 25);

            do {
                System.out.print("Masukan NIM Anda [harus 10 karakter] : ");
                nim = input.next();
            } while (nim.length() != 10);
            System.out.println();

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println();

            System.out.println("Registrasi Sukses..");
            System.out.println("Selamat datang " + nama + " [NIM : " + nim + "].. ^^u");
            System.out.println();

            System.out.println("Mari belajar macam - macam deret bilangan..");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println();

            do {
                System.out.print("Masukkan Sembarang angka [5..20] : ");
                angka = input.nextByte();
            } while (angka < 5 || angka > 20);
            System.out.println();
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            System.out.println("Deret Bilangan");
            System.out.println("###############");
            System.out.println();

            int totalGenap = 0;
            int genap;
            System.out.println(angka + " Bilangan Genap :");
            for (byte i = 1; i <= angka; i++) {
                genap = i * 2;
                System.out.print(genap + " ");
                totalGenap += genap;
            }
            System.out.print("\n");
            System.out.println("Hasil Penjumlahan = " + totalGenap);
            System.out.println();

            int ganjil;
            int totalGanjil = 0;
            System.out.println(angka + " Bilangan Ganjil :");
            for (byte i = 1; i <= angka; i++) {
                ganjil = i * 2 - 1;
                System.out.print(ganjil + " ");
                totalGanjil += ganjil;
            }
            System.out.print("\n");
            System.out.println("Hasil Penjumlahan = " + totalGanjil);
            System.out.println();

            int fibonacci, bil1 = 0, bil2 = 1, i = 0, totalFibonacci = 0;
            System.out.println(angka + " Bilangan Fibonacci :");
            while (i < angka) {
                fibonacci = bil1 + bil2;
                bil2 = bil1;
                bil1 = fibonacci;

                System.out.print(fibonacci + " ");
                totalFibonacci += fibonacci;
                i++;
            }
            System.out.print("\n");
            System.out.println("Hasil Penjumlahan = " + totalFibonacci);
            System.out.println();


            System.out.print("Anda Ingin mengulang [y/t] : ");
            jawab = input.next();
            System.out.println();

            if( jawab.equalsIgnoreCase("y") ){
                running = true;
                System.out.println("-------------------------------------------");
            } else if (jawab.equalsIgnoreCase("y")) {
                running = true;
                System.out.println("-------------------------------------------");
            } else if (jawab.equalsIgnoreCase("T")){
                System.out.println();
                System.out.println("Terima kasih telah menggunakan program ini");
                running = false;
            } else if (jawab.equalsIgnoreCase("t")) {
                System.out.println();
                System.out.println("Terima kasih telah menggunakan program ini");
                running = false;
            }

        }

    }
}