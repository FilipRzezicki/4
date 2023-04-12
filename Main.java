import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main {
public static void main(String[] args) throws IOException {
try {
	Service s = new Service();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	// tworze bufor sluzacy do pobierania danych z konsoli

	for (;;) {  // nieskonczona petla
		System.out.println("wybierz opcje: 0 -> exit | 1 -> dodanie do bazy danych");
		String num = reader.readLine();  // pobieranie danych z konsoli
		int option = Integer.parseInt(num);  // konwersja stringa do inta

		switch (option) {
			case 0:
				System.exit(0);  // wyjscie z programu
				break;
			case 1:
				System.out.println("wprowadz dane w formacie 'imie wiek'");
        String toParse = reader.readLine();
				Student newStudent = Student.Parse(toParse);
				s.addStudent(newStudent);  // dodanie do bazy
				break;
			default:
				System.out.println("bledna opcja!");
				break;
		}
	}
} catch (IOException e) {
	}
}
}