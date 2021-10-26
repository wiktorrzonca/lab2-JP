import java.util.Scanner;

public class Konsola {

    Scanner scanner;
    Kolekcje studenci;

    public Konsola() {
        this.scanner = new Scanner(System.in);
        this.studenci = new Kolekcje();
    }

    public void wczytajStudenta(){
        System.out.println("Podaj imie studenta, ktorego chcesz zapisac: ");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko studenta, ktorego chcesz zapisac: ");
        String nazwisko = scanner.next();
        System.out.println("Podaj indeks studenta, ktorego chcesz dodac");
        int indeks = scanner.nextInt();
        studenci.dodawanieStudenta(new Student(imie,nazwisko,indeks));
    }

    public void usunStudenta(){
        System.out.println("Podaj imie studenta, ktorego chcesz usunac: ");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko studenta, ktorego chcesz usunac: ");
        String nazwisko = scanner.next();
        System.out.println("Podaj indeks studenta, ktorego chcesz usunac");
        int indeks = scanner.nextInt();
        studenci.usuwanieStudenta(new Student(imie,nazwisko,indeks));
    }
    public void pokazStudentow(){
        studenci.pokazKolekcje();
    }
    public void menu() {
        int q = 0;
        while (q != 4) {
            System.out.println("Witaj, wybierz operacje ktora chcesz wykonac:\n" +
                    "1 - Dodaj imie do kolekcji\n" +
                    "2 - Usun imie z kolekcji\n" +
                    "3 - Wyswietl kolekcje\n" +
                    "4 - Zakoncz program");
            q=scanner.nextInt();
            if(q==1) wczytajStudenta();
            else if(q==2) usunStudenta();
            else if(q==3) pokazStudentow();
            else if(q!=4) System.out.println("wprowadzono niepoprawna liczbe");
        }
    }
}