package design_patterns_course.state;

public class Fan {
    State fanOffState;
    State fanLowState;
    State fanMediumState;
    State fanHighState;
    State state;

    public Fan(){
        this.fanOffState = new FanOffState(this);
        this.fanLowState = new FanLowState(this);
        this.fanMediumState = new FanMediumState(this);
        this.fanHighState = new FanHighState(this);
        this.state = this.fanOffState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    public void pullChain(){
        state.handleRequest();
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public void setFanOffState(State fanOffState) {
        this.fanOffState = fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public void setFanLowState(State fanLowState) {
        this.fanLowState = fanLowState;
    }

    public State getFanMediumState() {
        return fanMediumState;
    }

    public void setFanMediumState(State fanMediumState) {
        this.fanMediumState = fanMediumState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
