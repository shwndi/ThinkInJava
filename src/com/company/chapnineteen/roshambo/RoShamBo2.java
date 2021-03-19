package com.company.chapnineteen.roshambo;

/**
 * @author czy
 * @date 2021/3/18
 */
public class RoShamBo2 implements Competitor<RoShamBo2> {
    void PAPER(DRAW, LOSE, WIN),

    SCISSORS(WIN, DRAW, LOSE),

    ROCK(LOSE, WIN, DRAW);

    private Outcome vPAPER, vSCISSORS, vROCK;

    public RoShamBo2(Outcome PAPER, Outcome SCISSORS, Outcome ROCK) {
        this.vPAPER = PAPER;
        this.vSCISSORS = SCISSORS;
        this.vROCK = ROCK;
    }
    public Outcome compet(RoShamBo2 it){
        switch (it){
            default:
            case PAPER: return vPAPER;
            case SCISSIORS:return vSCISSORS;
            case ROCK:return vROCK;
        }
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo2.class,20);
    }
}
