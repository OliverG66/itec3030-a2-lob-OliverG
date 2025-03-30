package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.events.Event;

public class AggressiveTradingStrategy implements ITradingStrategy {
    @Override
    public void executeTrade(TradingAgent agent, Event event) {
        System.out.println(agent + " is trading aggressively based on event for " + event.getTicker());
    }
}


