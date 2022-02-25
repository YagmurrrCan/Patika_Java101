/*
 Course Sınıfı Özellikleri :
Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
 */
package patika_java101_oop.OgrSistemi;
public class Course {
    Teacher teacher;
    String name;
    String code;    //101 mesela
    String prefix;  //TRH
    int note;

    
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }
    
     public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(teacher.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
         
}
