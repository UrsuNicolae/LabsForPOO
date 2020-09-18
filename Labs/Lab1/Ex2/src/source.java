import java.util.LinkedList;
import java.util.List;

public class source {
    public static int CalculateMedia(List<University> universityList)
    {
        int media = 0;
        int count = 0;
        for (University univ: universityList)
        {
            for(student st: univ.studentList){
                media += st.mark;
                count++;
            }
        }
        return media / count;
    }


    public static void main(String[] args){
        student firstStudent = new student();
        firstStudent.name = "Nicolae";
        firstStudent.age = "20";
        firstStudent.mark = 8;

        University UTM = new University("utm", "1966");
        UTM.studentList.add(firstStudent);
        University USME = new University("usem", "1233");
        USME.studentList.add(firstStudent);
        University ASEM = new University("asem", "21312");
        ASEM.studentList.add(firstStudent);

        List<University> universities = new LinkedList<>();
        universities.add(UTM);
        universities.add(USME);
        universities.add(ASEM);

        System.out.println(CalculateMedia(universities));
    }
}
