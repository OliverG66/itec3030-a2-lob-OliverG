package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.events.Event;

public class ConservativeTradingStrategy implements ITradingStrategy {
    @Override
    public void executeTrade(TradingAgent agent, Event event) {
        System.out.println(agent + " is trading conservatively based on event for " + event.getTicker());
    }
}

