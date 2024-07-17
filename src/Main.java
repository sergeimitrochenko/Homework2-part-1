public class Main {
    public static void main(String[] args) {
        System.out.println("Hello people,check are out");


        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение переменной dog с типом var равно " + dog);
        System.out.println("Значение переменной cat с типом var равно " + cat);
        System.out.println("Значение переменной paper с типом var равно " + paper);


        System.out.println("Задача 2");
        var dog1 = 8;
        var cat2 = 3.6;
        var paper3 = 763789;
        var box1=2;
        var box2=2;
        var box3=2;
        System.out.println(" dog1=  " + dog1);
        System.out.println(" cat2= " + cat2);
        System.out.println(" paper3= " + paper3);
        System.out.println(" box1= "+box1);
        System.out.println(" box2= " +box2);
        System.out.println(" box3=" + box3);
        var result1 =dog1+box1+2;
        var result2=cat2+box2+2;
        var result3=paper3+box3+2;
        System.out.println("dog1+box1+2="+result1);
        System.out.println("cat2+box2+2=" +result2);
        System.out.println("paper3+box3+2=" +result3);

        System.out.println("Задача 3");
        var dog4=12;
        var cat5=7.6;
        var paper6=763793;
        System.out.println(" dog4=  " + dog4);
        System.out.println(" cat5= " + cat5);
        System.out.println(" paper6= " + paper6);
        var box4=3.5;
        var box5=1.6;
        var box6=7639;
        System.out.println(" box4="+box4);
        System.out.println(" box5="+box5);
        System.out.println(" box6="+box6);
        var result4=dog4-box4;
        var result5=cat5-box5;
        var result6=paper6-box6;
        System.out.println("dog4-box4="+result4);
        System.out.println("cat5-box5=" +result5);
        System.out.println("paper6-box6=" +result6);
        System.out.println("Задача 4");
        var friend=19;
        var brother=2;
        var enemy=7;
        System.out.println(" friend= " +friend);
        System.out.println(" brother="+brother);
        System.out.println("enemy="+enemy);
        var result7=friend+brother;
        System.out.println("friend+brother="+result7);
        var result8=result7/enemy;
        System.out.println("result7/enemy="+result8);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var OneBoxer = 78.2;
        System.out.println(OneBoxer);
        var TwoBoxer = 82.7;
        System.out.println(TwoBoxer);
        var sumWeight = OneBoxer + TwoBoxer;
        System.out.println("Общий вес боксеров составляет " + sumWeight + " кг");
        var differenceWeight = TwoBoxer - OneBoxer;
        System.out.println("Разница масс составляет " + differenceWeight + " кг!");

        System.out.println("Задача 7");

        var divisionWeight = TwoBoxer % OneBoxer;
        System.out.println("Разница в весе " + divisionWeight + " кг!");

        System.out.println("Задача 8");
        var totalHours = 640;
        var normHours = 8;
        var staff = totalHours / normHours;
        System.out.println(" Всего работников в компании " + staff );
        staff = staff + 94;
        var newHours = totalHours / staff;
        System.out.println("Если в компании работает " + staff + " человек, то всего " + newHours + " часа работы может быть поделено между сотрудниками.");




    }
}