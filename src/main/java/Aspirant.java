public class Aspirant extends Student{
    String vibrantema;
    @Override
    void getSholarship() {
        if(averageMark == 5)
            System.out.println("Стипендия: 20 000 руб");
        else
            System.out.println("Стипендия: 18 000 руб");
    }

    public Aspirant(String Firstname, String Lastname, String Group, Double averageMark, String vibrantema) {
        super(Firstname, Lastname, Group, averageMark);
        this.vibrantema = vibrantema;
    }
}
