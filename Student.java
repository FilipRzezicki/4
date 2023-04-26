public class Student
  {

  private String Name;
  private String Nazwisko;
  private int Age;
  private String Ulica;
  private String Data;

  public Student(String name, String nazwisko, int age, String ulica, String data) 
  {
    Name = name;
    Nazwisko = nazwisko;
    Age = age;
    Ulica = ulica;
    Data = data;
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Nazwisko;}
  public int GetAge() {return Age;}
public String GetUlica() {return Ulica;}
    public String GetData() {return Data;}
    
  public String ToString() {
    return Name + " " + Nazwisko + " " +  Integer.toString(Age) + " " + Ulica + " " + Data;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 5) 
return new Student("Error", "Nazwisko Error", -1, "Ulica Error", "Data Error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3],data[4]);
  }
}