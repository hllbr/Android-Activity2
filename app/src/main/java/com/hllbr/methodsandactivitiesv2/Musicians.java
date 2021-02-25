package com.hllbr.methodsandactivitiesv2;

public class Musicians {//Sınıf isimleri daima büyük harfle başlar

    /*
    öncelikli olarak oluşturuluacak sınıfın özelliklerini yazmam gerek akış diagramında
     */
    //Attribute = Özellik
    String name ;
    String instrument ;
    int age ;

    /*
    Sınıfın özellikleri bitmiş durumda.Bu özellikleri MainActivity içerisinde kullanabiliriz.

    Eğer özelliklerimizin erişilebilirlikleri özel yada korunmuş olsaydı ulaşmak zor olacaktı genellikle constructor adı verilen bir yapı kullanarak bu yapıalrın erişilebilirliklerini sağlayabiliriz.


     */

    public Musicians(String name, String instrument, int age) {//Bu alan sınıf oluşturulurken verilen input yada inputları gösteriyor.Yapı içerisinde verilenleri yukarıdaki sınıf özelliklerine eşitle diyoruz

        this.name = name;
        this.instrument = instrument;
        this.age = age;//Bunlar hazır gelen kodlarımız

        System.out.println("Instance is OK.");
    }
    //Constructor tanımı = bir instance (olay) oluşturulduğunda oluşturulacak (Çağrılacak) ilk metod.

    //İnstance örnekleme/obje/referans şeklinde ifade edilebilir.OnCreate yapısına benzer bir çalışma mantığı var farklılıklar söz konusudur.

    //Refrans oluşturulduğunda yapılmak istenen işlemler constructor içerisinde ifade edilir.

    //sadece tanımlamalar yapılmak zorunda değildir bunun dışında yazdırma ,indirme ,bildiri....


}
