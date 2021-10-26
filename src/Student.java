import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{

    private String imie;
    private String nazwisko;
    private int indeks;


    public Student(String imie, String nazwisko, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public Student() {
        this.imie = " ";
        this.nazwisko = " ";
        this.indeks = 0;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getIndeks() {
        return indeks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return indeks == student.indeks && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, indeks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", indeks=" + indeks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(!this.imie.equals(o.imie)) return -1;
        if(!this.nazwisko.equals(o.nazwisko)) return -1;
        if(!(this.indeks == o.indeks)) return -1;
        else return 0;
    }
}
