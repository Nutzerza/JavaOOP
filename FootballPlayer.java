
public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;
    public void setPlayerNumber(int n) {
        this.playerNumber = n;
    }
    public int getPlayerNumber() {
        return this.playerNumber;
    }
    public void setPosition(String p) {
        this.position = p;
    }
    public String getPosition() {
        return this.position;
    }
    public boolean isSamePosition(FootballPlayer p) {
        return isSameTeam(p) & (this.position.equals(p.position));
//        if ((p.getPosition().equals(this.getPosition())) & (p.getTeam().equals(this.getPosition()))) {
//        if ((p.getPosition().equals(this.position)) & (p.getTeam().equals(this.team))) {
//            return true;
//        }
//        else {
//            return false;
//        }
    }
}
