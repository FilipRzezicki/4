/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
//commit 4.1
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scan = new Scanner(System.in);
      while(true){
      System.out.println("Dokonaj wyboru");
      System.out.println("1.Dodaj studenta");
      System.out.println("2. Wyswietl liste studentow");
      int x = scan.nextInt();scan.nextLine();
      switch(x){
        case 1:{
          System.out.println("Wprowadz imie:");
          String name = scan.nextLine();
          System.out.println("Wprowadz nazwisko:");
          String nazwisko = scan.nextLine();
          System.out.println("Wprowadz wiek:");
          int age = scan.nextInt();
          System.out.println("Wprowadz ulice:");scan.nextLine();
         String ulica = scan.nextLine();
          System.out.println("Wprowadz date:");
         String data = scan.nextLine();
          s.addStudent(new Student(name, nazwisko, age, ulica, data));
        } break;
        case 2:{
          var students = s.getStudents();
          for(Student current : students){
            System.out.println(current.ToString());
          }
        } break;
        case 0:{
          return;
        }
      }
    } 
    }
    catch (IOException e) {

    }
  }
}