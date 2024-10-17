public class std3 {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Jino Dev";
        s1.mark = 99;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Adarsh";
        s2.mark =97;

        Student s3 =new Student();
        s3.rollno = 3;
        s3.name = "Abhijith";
        s3.mark =98;

        Student students[] = new student [3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(int i=0;i<students.length;i++){
            System.out.println(students [i].name + " :"+student[i].mark);
        }
    }
}
