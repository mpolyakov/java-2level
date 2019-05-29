package Marathon.Obstacle;

import Marathon.Competitors.Competitor;
import Marathon.Competitors.Team;

public class Course {
    private Obstacle[] course;

    public Course(Obstacle[] course) {
        this.course = course;
    }

    public void doItPlease(Team team){
        for (Competitor c : team.comps) {
            for (Obstacle o : this.course){
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }

        }


    }


}
