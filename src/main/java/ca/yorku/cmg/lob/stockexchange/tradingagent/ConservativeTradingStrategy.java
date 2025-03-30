package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.Event;
import ca.yorku.cmg.lob.stockexchange.orders.*;

public class ConservativeTradingStrategy implements ITradingStrategy {
    @Override
    public void executeTrade(TradingAgent agent, Event event) {
        int qty = 100; // Smaller quantity
        String ticker = event.getTicker();
        int price = agent.getExchange().getCurrentPrice(ticker);
        int pos = agent.getPosition(ticker);

        if (event.isPositive()) {
            agent.getExchange().submitOrder(
                new Bid(agent.getTrader(), ticker, price, qty, 0), 0
            );
        } else {
            agent.getExchange().submitOrder(
                new Ask(agent.getTrader(), ticker, price, Math.max(pos, qty), 0), 0
            );
        }
    }
}

