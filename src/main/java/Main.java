public class Main {
    public static void main(String[] args) {
    Student s1 = new Student("Славик","Леонтьев","Л-320",5.00);
    Student s2 = new Student("Толик", "Алкоголик","Т-320", 4.00);
    Aspirant a1 = new Aspirant("Эрик", "Хан", "ПКС-320", 5.00,"1С");
    Student[]vse= {s1,s2,a1};

    {
        for (int i = 0; i < vse.length; i++) {
            vse[i].getSholarship();
        }
    }

}
}

