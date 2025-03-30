package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;
import ca.yorku.cmg.lob.stockexchange.tradingagent.TradingAgent;

public interface AbstractTradingAgentFactory {
    TradingAgent createTradingAgent(String type, String style, Trader t, StockExchange e, NewsBoard n);
}
