package Marathon.Competitors;

import Marathon.Competitors.Competitor;

public class Team {
    private String nameTeam;
    public Competitor[] comps;

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public Team(String nameTeam, Competitor[] comps) {
        this.nameTeam = nameTeam;
        this.comps = comps;
    }

    public void infoAllTeam(){
        for (Competitor c : comps) {
            c.info();
        }
    }
    public void infoTeam(){
        for (Competitor c : comps) {
            c.info();
        }
    }
}
