package com.hllbr.methodsandactivitiesv2;

public class Simpsons {
    /*
    Erişilebilirlik Seviyeleri = accessibility features

     */

    private String name ;
    private String job ;
    private int age ;

    public Simpsons(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*
    private ve protected neredeyse aynı fakat bazı sınıflar diğerini extends ederse kullanılabilsin manasına geliyor protected örnek vermek gerekirse mainactivity içerisinde...

    Oncreat,Onresemu,Onpause protected bunlar kullanılabilsin diye mainactivity sınıfı AppCompatActivity extends etmekte(inheritance deniyor bu olaya kalıtımsal miras alma gibi düşünülebilir.)

    Bir çocuğun görünüşünü anne ve babasından miras almasıyla aynı temele dayanmaktadır.

    gibi gibi ...

   Bir proje üzerinde birden fazla developer çalışıyorsa büyük projelerde çalışıyorsan bu yapılara çok fazla ihtiyac oluyor hatalara düşmemek için
   



     */
}
