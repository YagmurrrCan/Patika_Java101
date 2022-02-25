/*
Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
Fizik Ortalaması : (90 * 0.20) + (60* 0.80); */
package patika_java101_oop.OgrSistemi;

public class Main {
    
    public static void main (String[] args){
        
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "05555555555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "08488484875");
        Teacher t3 = new Teacher("Külyutmaz", "MAT", "08456685875");
       
        Course tarih = new Course("Tarih", "101", "TRH"); 
        tarih.addTeacher(t1);  
        
        Course fizik = new Course("Fizik", "102", "FZK"); 
        fizik.addTeacher(t2);  
        
        Course mat = new Course("Matematik", "201", "MAT"); 
        mat.addTeacher(t3);  
        
              
        // tarih.addTeacher(t2);
        
        Student s1 = new Student("İnek Şaban" , 123, "4", tarih,fizik,mat);
        s1.addBulkExamNote(100, 78, 50);
        s1.isPass();
        
        Student s2 = new Student("Düdük Necmi" , 444, "4", tarih,fizik,mat);
        s2.addBulkExamNote(50, 40, 50);
        s2.isPass();
    }
       
}
