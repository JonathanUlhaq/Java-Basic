import java.util.Scanner; // memanggil program java Scanner
public class sekuens { // Nama class 
public static void main(String[]args){ // Bertugasn untuk menyimpan nilai argumen yang diberikan dari CMD atau terminal, sehingga kita bisa mengolahnya dalam program.

Scanner sekuen = new Scanner(System.in); // memasukan fungsi Scanner

double F, C, R; // Deklarasi
System out print("masukan nilai dari celcius"); // menampilkan text di layar
C = sekuen.nextDouble(); // memanggil type daata double dengan nextDouble

// Operator rumus matematika
F = 9/5 * C + 32;
R = 4/5 * C;

System.out.printl ("Fahrenheit =  " + F);//memanggil F untuk ditampilkan dilayar
System.out.printl ("Reamur =  " + F);//memanggil R untuk ditampilkan dilayar
}
}
