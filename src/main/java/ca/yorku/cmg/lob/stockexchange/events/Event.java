package ca.yorku.cmg.lob.stockexchange.events;

public class Event {
    private String ticker;
    private boolean positive;

    public Event(String ticker, boolean positive) {
        this.ticker = ticker;
        this.positive = positive;
    }

    public String getTicker() {
        return ticker;
    }

    public boolean isPositive() {
        return positive;
    }

    @Override
    public String toString() {
        return "Event{" +
                "ticker='" + ticker + '\'' +
                ", positive=" + positive +
                '}';
    }
}

