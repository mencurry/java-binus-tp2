import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // status program set default to true
        boolean status = true;
        // scanner
        Scanner scan = new Scanner(System.in);

        // run program while the status is true
        while (status) {
            // print program name
            System.out.println("Belajar Deret Aritmatika, Geometri, dan menghitung Faktorial");
            System.out.println("============================================================");

            // get and set banyakAngka, check validation using try catch
            System.out.print("Masukkan banyak angka yang mau dicetak [2..10] \t: ");
            int banyakAngka = scan.nextInt();
            try {
                if (banyakAngka < 2 || banyakAngka > 10) {
                    throw new Exception("Hanya angka 2 - 10 yang bisa diinputkan");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            // get and set bedaAngka, check validation using try catch
            System.out.print("Masukkan beda masing-masing angka [2..9] \t\t: ");
            int bedaAngka = scan.nextInt();
            try {
                if (bedaAngka < 2 || bedaAngka > 9) {
                    throw new Exception("Hanya angka 2 - 9 yang bisa diinputkan");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            // set aritmatika default value to 1, loop based on banyakAngka
            // then aritmatika add equals to bedaAngka
            int aritmatika = 1;
            System.out.println("Deret Aritmatika : ");
            for(int x = 1; x <= banyakAngka; x++){
                System.out.print(aritmatika + " ");
                aritmatika += bedaAngka;
            }

            // set geometri default value to 1, loop based on banyakAngka
            // then geometri multiply equals to bedaAngka
            int geometri = 1;
            System.out.println("\nDeret Geometri : ");
            for(int x = 1; x <= banyakAngka; x++){
                System.out.print(geometri + " ");
                geometri *= bedaAngka;
            }

            // set faktorial to 1 then multiply equals to banyakAngka
            int faktorial = 1;
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

            // had to add scan here, otherwise it bugs out
            scan.nextLine();
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