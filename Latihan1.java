import java.util.Scanner;

public class Latihan1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Masukan nilai (A/B/C/D/E):");
    String nilai = input.next();
    
    if(nilai == "A"){
      System.out.println("Excellent!");
    } else if(nilai == "B"){
      System.out.println("Good Job!");
    } else if(nilai == "C"){
      System.out.println("Study Harder!");
    } else {
      System.out.println("Sorry, you failed.");
    }
    
    System.out.println("Masukan tiga nilai ujian:");
    double nilai1 = input.nextDouble();
    double nilai2 = input.nextDouble();
    double nilai3 = input.nextDouble();
    
    double hasil = (nilai1+nilai2+nilai3)/3;
    if(hasil < 60){
      System.out.println(":-(");
    } else {
      System.out.println(":-)");
    }
  }
}
