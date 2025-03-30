package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

public class TradingAgentFactory implements AbstractTradingAgentFactory {
    @Override
    public TradingAgent createTradingAgent(String type, String style, Trader t, StockExchange e, NewsBoard n) {
        ITradingStrategy strategy;

        if ("Aggressive".equalsIgnoreCase(style)) {
            strategy = new AggressiveTradingStrategy();
        } else if ("Conservative".equalsIgnoreCase(style)) {
            strategy = new ConservativeTradingStrategy();
        } else {
            throw new IllegalArgumentException("Unknown trading style: " + style);
        }

        if ("Retail".equalsIgnoreCase(type)) {
            return new TradingAgentRetail(t, e, n, strategy);
        } else if ("Institutional".equalsIgnoreCase(type)) {
            return new TradingAgentInstitutional(t, e, n, strategy);
        } else {
            throw new IllegalArgumentException("Unknown trading type: " + type);
        }
    }
}
