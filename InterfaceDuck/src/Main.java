
import Attack.*;
import Defense.*;
import Fly.*;
import Sound.*;


class Main {

    
    public static void main(String[] args) {
        Duck superDuck = new Duck(new RocketFly(), new ToaSound(), new SwordsAttack(), new ArmorDefense());
        System.out.println("Super Duck Behaviour");
        superDuck.fly();
        superDuck.sound();
        superDuck.attack();
        superDuck.defense();
        
        System.out.println("");
        System.out.println("Noob Duck Behaviour");
        Duck noobDuck = new Duck (new WingsFly(), new NormalSound(), new ArrowAttack(), new ShieldDefense());
        noobDuck.fly();
        noobDuck.sound();
        noobDuck.attack();
        noobDuck.defense();
        
        System.out.println("");
        System.out.println("Super Duck change fly behaviour : ");
        superDuck.setFlyBehaviour(new PlaneFly());
        superDuck.fly();
        superDuck.sound();
        superDuck.attack();
        noobDuck.defense();
    }
    
}
