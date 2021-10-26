import java.util.*;

public class Kolekcje {

    private HashSet<Student> studentHashSet;
    private TreeSet<Student> studentTreeSet;
    private ArrayList<Student> studentArrayList;
    private LinkedList<Student> studentLinkedList;
    private HashMap<Student, Student> studentHashMap;
    private TreeMap<Student, Student> studentTreeMap;

    public Kolekcje() {
        this.studentHashSet = new HashSet<>();
        this.studentTreeSet = new TreeSet<>();
        this.studentArrayList = new ArrayList<>();
        this.studentLinkedList = new LinkedList<>();
        this.studentHashMap = new HashMap<>();
        this.studentTreeMap = new TreeMap<>();
    }
    public void dodawanieStudenta(Student student){
        studentHashSet.add(student);
        studentTreeSet.add(student);
        studentArrayList.add(student);
        studentLinkedList.add(student);
        studentHashMap.put(student,student);
        studentTreeMap.put(student,student);
    }
    public void usuwanieStudenta(Student student){
        studentHashSet.remove(student);
        studentTreeSet.remove(student);
        studentArrayList.remove(student);
        studentLinkedList.remove(student);
        studentHashMap.remove(student);
        studentTreeMap.remove(student);
    }
    public void pokazKolekcje(){
        System.out.println("HashSet:");
        Iterator<Student> iteratorHashSet = studentHashSet.iterator();
        while (iteratorHashSet.hasNext()) {
            System.out.println(iteratorHashSet.next() + ", ");
        }
        System.out.println();

        System.out.println("TreeSet:");
        Iterator<Student> iteratorTreeSet = studentTreeSet.iterator();
        while (iteratorTreeSet.hasNext()) {
            System.out.println(iteratorTreeSet.next() + ", ");
        }
        System.out.println();

        System.out.println("ArrayList:");
        for(int i = 0; i< studentArrayList.size(); i++){
            System.out.println(studentArrayList.get(i) + ", ");
        }
        System.out.println();

        System.out.println("LinkedList:");
        for(int i = 0; i< studentLinkedList.size(); i++){
            System.out.println(studentLinkedList.get(i) + ", ");
        }
        System.out.println();

        System.out.println("HashMap:");
        for (Student student: studentHashMap.values()) {
            System.out.println(student);

        }
        System.out.println();

        System.out.println("TreeMap:");
        for (Student student: studentTreeMap.values()) {
            System.out.println(student);

        }
        System.out.println();


        }

    }
