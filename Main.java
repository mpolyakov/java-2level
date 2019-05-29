package Marathon;

import Marathon.Competitors.*;
import Marathon.Obstacle.*;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course(new Obstacle[] {
                new Wall(5),
                new Water(5),
                new Cross(500)
        });

        Team t1 = new Team("Team odin", new Competitor[] {
                new Human("Ilya"),
                new Cat("Barsik"),
                new Dog("Kuzick"),
                new Cat("Murzik")
        });

        c1.doItPlease(t1);
        t1.infoAllTeam();
    }
}
