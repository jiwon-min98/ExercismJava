class BowlingGame{
    private int score =0;
    private int currentFrame = 1;
    private int throwsLeft = 2;
    private int pinsOnLane = 10;
    private boolean lastFrameWasSpare = false;
    private int afterStrikeThrows = 0;
    private int bonusRolls = 0;

    public void roll(int pins){
        if (afterStrikeThrows > 0) {
            int consecutiveStrikesMultiplier = (int) Math.ceil(afterStrikeThrows / 2.0);
            score += pins * consecutiveStrikesMultiplier;
            afterStrikeThrows -= consecutiveStrikesMultiplier;
        }

        if (pinsOnLane == 0 || throwsLeft == 0) {
            if (bonusRolls == 0) {
                currentFrame++;
                throwsLeft = 2;
            }
            pinsOnLane = 10;
        }

        validateRoll(pins);

        if (bonusRolls >0){
            score+=pins;
            throwsLeft = --bonusRolls;
            pinsOnLane -= pins;
            return;
        }

        if (lastFrameWasSpare) {
            score += pins;
            lastFrameWasSpare = false;
        }

        if (throwsLeft == 2) { //first throw
            if (pins == 10) { //strike
                afterStrikeThrows += currentFrame == 10 ? 0 : 2;
                bonusRolls = currentFrame == 10 ? 2 : 0;
            }
            pinsOnLane -= pins;
        } else {
            if (pinsOnLane - pins == 0) { //spare
                lastFrameWasSpare = true;
                pinsOnLane -= pins;
                bonusRolls = currentFrame == 10 ? 1 : 0;
            } else { //open
                pinsOnLane = 0;
            }
        }
        score += pins;
        throwsLeft--;
    }

    public int score(){
        if (currentFrame < 10 || bonusRolls > 0) {
            throw new IllegalStateException("Score cannot be taken until the end of the game");
        }
        return this.score;
    }

    private void validateRoll(int pins) {
                if (pins < 0) {
                    throw new IllegalStateException("Negative roll is invalid");
                }
                if (pinsOnLane < pins) {
                    throw new IllegalStateException("Pin count exceeds pins on the lane");
                }
                if (currentFrame > 10) {
                    throw new IllegalStateException("Cannot roll after game is over");
                }
            }
}