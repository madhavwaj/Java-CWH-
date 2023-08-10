

class Employee {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

class Cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrating(){
        System.out.println("Vibrating");
    }
    public void callfriend(){
        System.out.println(("Calling raj"));
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }


}
class tommy {
    public void hit() {
        System.out.println("Hitting the enemy");
    }

    public void run() {
        System.out.println("Running from the enemy");
    }

    public void fire() {
        System.out.println("Firing on the enemy");
    }
}

public class cwh_38_ps_8 {
    public static void main(String[] args) {

        /*
        //problem 1

        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 223;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        //problem 2
        Cellphone asus = new Cellphone();
        asus.callfriend();
        asus.vibrating();
        asus.ring();
         */

        //problem 3

       /* Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        }
        */

        //problem 5
        tommy player1 = new tommy();
        player1.fire();
        player1.run();


    }
}

