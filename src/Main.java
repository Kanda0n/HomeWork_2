public class Main {
    public static void main(String[] args) {
       System.out.println("Task 1:");
        var dog = 8.0 ;
        var cat = 3.6 ;
        var paper = 763789 ;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task 2:");
        dog = dog + 4 ;
        cat = cat + 4 ;
        paper = paper + 4 ;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task 3:");
        dog = dog - 3.5 ;
        cat = cat - 1.6 ;
        paper = paper - 7639 ;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task 4:");
        var friend = 19 ;
        System.out.println(friend);
        friend = friend +2 ;
        System.out.println(friend);
        friend = friend / 7 ;
        System.out.println(friend);

        System.out.println("Task 5:");
        var frog = 3.5 ;
        System.out.println(frog);
        frog = frog * 10 ;
        System.out.println(frog);
        frog = frog / 3.5 ;
        System.out.println(frog);
        frog = frog +4 ;
        System.out.println(frog);

        System.out.println("Task 6:");
        var firstBoxer = 78.2 ;
        var secondBoxer = 82.7 ;
        var summWeight = firstBoxer + secondBoxer ;
        System.out.println(summWeight);
        var diffWeight = firstBoxer - secondBoxer ;
        System.out.println(diffWeight);

        System.out.println("Task 7:");
        var ostatokWeight = secondBoxer % firstBoxer ;
        System.out.println(ostatokWeight);

        System.out.println("Task 8:");
        var allHours = 640 ;
        var workHours = 8 ;
        var kolvo = allHours / workHours ;
        System.out.println("Всего работников в компании — " + kolvo + " человек");
        kolvo = kolvo + 94 ;
        allHours = kolvo * workHours ;
        System.out.println("Если в компании работает " + kolvo + " человекa, то всего "
                + allHours + " часов работы может быть поделено между сотрудниками");

    }
}