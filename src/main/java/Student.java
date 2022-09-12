public class Student {
    String Firstname;
    String Lastname;
    String Group;
    Double averageMark;

    public Student (String Firstname, String Lastname, String Group, Double averageMark){
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Group = Group;
        this.averageMark = averageMark;
        System.out.println("Имя студента: " + Firstname + "; его фамилия: "+ Lastname + "; группа, в которой он учится: "
                + Group + "; средняя оценка студента: " + averageMark);



    }
    void getSholarship(){
        if (averageMark == 5){
            System.out.println("Стипендия: 10 000 руб");
        }
        else
        {
            System.out.println("Стипендия: 8 000 руб");
        }
    }

}
