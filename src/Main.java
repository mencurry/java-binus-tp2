import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // setup status to be true by default, then also setup scanner object
        boolean status = true;
        Scanner scan = new Scanner(System.in);

        // variable declaration
        int banyakAngka = 0,
                bedaAngka = 0,
                aritmatika = 1,
                geometri = 1,
                faktorial = 1;

        // run program while the status is true
        while (status) {
            // print program name
            System.out.println("Belajar Deret Aritmatika, Geometri, dan menghitung Faktorial");
            System.out.println("============================================================");

            // get and set banyakAngka, check validation using do while loop and try catch
            do {
                System.out.print("Masukkan banyak angka yang mau dicetak [2..10] \t: ");
                try {
                    banyakAngka = Integer.parseInt(scan.nextLine());
                    if (banyakAngka < 2 || banyakAngka > 10) {
                        System.out.println("Coba lagi, hanya angka 2 sampai dengan 10 yang bisa dimasukkan");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            } while (banyakAngka < 2 || banyakAngka > 10);

            // get and set bedaAngka, check validation using do while loop and try catch
            do {
                System.out.print("Masukkan beda masing-masing angka [2..9] \t\t: ");
                try {
                    bedaAngka = Integer.parseInt(scan.nextLine());
                    if (bedaAngka < 2 || bedaAngka > 9) {
                        System.out.println("Coba lagi, hanya angka 2 sampai dengan 10 yang bisa dimasukkan");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            } while (bedaAngka < 2 || bedaAngka > 9);

            // loop based on banyakAngka, then aritmatika add equals to bedaAngka
            System.out.println("Deret Aritmatika : ");
            for(int x = 1; x <= banyakAngka; x++){
                System.out.print(aritmatika + " ");
                aritmatika += bedaAngka;
            }

            // loop based on banyakAngka, then geometri multiply equals to bedaAngka
            System.out.println("\nDeret Geometri : ");
            for(int x = 1; x <= banyakAngka; x++){
                System.out.print(geometri + " ");
                geometri *= bedaAngka;
            }

            // every loop x = banyakAngka (e.g 5), then every loop it subtract x by 1, then multiply it by the next number
            System.out.println("\nFaktorial dari " + banyakAngka + " : ");
            for(int x = banyakAngka; x>=1; x--){
                if (x == 1){
                    System.out.print(x);
                } else {
                    System.out.print(x + " * ");
                }
                faktorial *= x;
            }
            System.out.println(" = " + faktorial);

            // print retry program
            System.out.print("Apakah anda mau ulangi programnya? [y/t] = ");
            String konfirmasi = scan.nextLine();

            // validate if the String given is t or y, if anything else close program
            if (konfirmasi.equalsIgnoreCase("t")){
                status = false;
            } else if (konfirmasi.equalsIgnoreCase("y")) {
                status = true;
            } else {
                status = false;
            }
        }
    }
}
