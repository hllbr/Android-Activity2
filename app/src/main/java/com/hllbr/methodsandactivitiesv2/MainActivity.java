package com.hllbr.methodsandactivitiesv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String username;

    public void makeSimpson(){
        Simpsons simpsons1 = new Simpsons("HOMOR","NUCLEAR ENGİNEER",58);
        //eğer ben bu alanda homorun yaşını değiştirmek istersem set adı verilerin javada hazır olarak bulunan metoddan faydalanabilirim

        //set ayarlamak get ise getirmek gibi düşünülebilir.Sınıfıma gidip özelliklerim için bu yapıları ayarlamam gerekiyor.

        //Genellikle özellikleri ifade etmek yada başka işlemler yapılacak olsada kullanılacak ifadeleri kullanmak için akıf diagramında özelliklerin tanımlanması constructor ve ardından getter and setter ifadeleri gelmektedir.

        //özellikleri Simpsons sınıfı içerisinde ifade ederken erişilebilirliklerini ifade etmedik default bir şekilde public olarak işlem görüyorlar.

        //eğer getter and setterları yazmadan yapıyı private şekilde ifade etseydik ve ve bu alan içerisinde özellikleri kullanmaya kalksaydık erişim sorunu verliecekti derleyici(aslında java) tarafından

        simpsons1.setAge(75);
        System.out.println("HOMOR YAŞI GÜNCELLENDİ VE EMEKLİ OLMASI İÇİN TÜM ŞARTLAR OLUŞTU \n HOMOR GÜNCEL YAŞI " + simpsons1.getAge());





    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testMethod();

        System.out.println(math(3,5));

        System.out.println(newMethod("hllbr,@prince"));

        makeMusicians();

        makeSimpson();
    }
    /*

    Bu alanda kendime ait kodlar yazmak istiyorum


    Bu alan on create yada on stop içerisinde bir yer değil bu alan sınıfın içerisinde boş bir nokta oalrak ifade edilebilir.

    hazır metodlarımın üzerinde erişilebilirlik seviyesi protected = korunmuş anlamına geliyor

    3 adet erişilebilirlik seviyesi mevcuttur.

    public = kamuya açık (erişilebilirliği en yüksek erişim seviyesi )

    private = özel kimsenin göremeyeceği ....

    protected = korunmuş yapı olarak ifade edebiliriz

    public ile yazılan metod diğer sınıflardanda bu metoda erişilebilir anlamına geliyor.

    Void ifadesi ise methodun ne döndüreceğini ifade ettiğimiz yapımızdır.

    void programlamada anlam karşılığı boşluk demektir.

    Boşluk döndürecek geriye birşey vermeyecek .

    geriye birşey vermek istediğim durumlarda void kelimesi yerine string int vb.. kullanabilirim

     */


    public void testMethod(){
        /*
        bu alanda ne yapıacağı programcıya kalmış durumdadır

        ister yazdırma işlemi yapar,ister internetten veri çeker,ister işlem yapar.
         */

        int x = 4 + 4 ;

        System.out.println("Value of X : " + x) ;

        //bu metod herhangi bir pozisyondan çağrılmadığı sürece anlam ifade etmiyor

        //bu işlemi oncreate onresume onstart gibi yapıların yada normal bir java kodu yazıyorsak android programlama haricinde main içerisinde doğru noktada ifade edersek (Çağırırsak bir anlam ifade etmektedir.)

        //Eğer yapımın butona basıldığı anda çalıştırılmasını istiyorsam constructor'ının içerisine View view şeklinde ifade yazmalı methoda bir görünüm tarafından çağrılacağını belirtmem gerekiyordu.

        //ben methodumu oncreate altında ifade etmek istiyorum

    }
    //sadece boşluk döndürülen metodlar yok ayrıca bazı istediğim şeyleri döndürebileceğim metodlarda mevcut örneğin =

    public int math(int a,int b){

        return a+b;
    }

    public String newMethod(String st){
        return st +"newMethods";

    }

    public void makeMusicians(){
        /*
        sınıfın objesini oluşturma yöntemlerinden biri ...
         */

        Musicians tarkan = new Musicians("hadise","SES",18);//Musicians sınıfında bir referans oluşturdum bu sınıfın özelliklerine bu alandan rahatlıkla erişebilmek için

        //Bu işlemin bir STRİNG oluşturmaktan hiçbir farkı yok

        //Bu obje şuan boş

       /* tarkan.age = 50;

        tarkan.name = "Hadise" ;

        tarkan.instrument = "Ses" ;
        */

        /*
        bu şekilde işlem daha düzenli hale geldi ve büyük projeler için genel değişkenlerimizin sayısı azalmış oldu.
         */
        System.out.println("Müzisyenin yaşı :" + tarkan.age + " Müzisyenin Enstrumanı : " + tarkan.instrument +" Müzisyenin Ismi : " +tarkan.name);

        //Bu metodu bir noktada çağırmam gerek şuan incisible durumda.
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("on start called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("on Destroy called");
    }
    /*
    Genel değişken ve ifadeleri sınıf içerisinde tanımlarız.

    Bu değişkenlere  global değişkenler denir

     */
}