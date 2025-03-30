package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

public abstract class TradingAgent {
    protected Trader t;
    protected StockExchange exc;
    protected NewsBoard news;
    protected ITradingStrategy strategy;

    public TradingAgent(Trader t, StockExchange e, NewsBoard n) {
        this.t = t;
        this.exc = e;
        this.news = n;
    }

    public Trader getTrader() {
        return this.t;
    }

    public int getPosition(String ticker) {
        return this.exc.getPosition(t, ticker);
    }

    public StockExchange getExchange() {
        return this.exc;
    }

    public abstract void actOnEvent(ca.yorku.cmg.lob.stockexchange.events.Event e, int pos, int price);
}

