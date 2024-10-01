public class Scoreboard {
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;
    public int swap = 0;

    public Scoreboard(String one, String two) {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }

    public void recordPlay(int score) {
        if (score > 0 && activeTeam == teamOne) teamOneScore = teamOneScore + score;
        else if (score < 1 && activeTeam == teamOne) activeTeam = teamTwo;
        else if (score > 0 && activeTeam == teamTwo) teamTwoScore = teamTwoScore + score;
        else if (score < 1 && activeTeam == teamTwo) activeTeam = teamOne;
    }

    public String getScore() {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }

}