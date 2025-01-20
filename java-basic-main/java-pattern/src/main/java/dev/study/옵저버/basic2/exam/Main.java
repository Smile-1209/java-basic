package dev.study.옵저버.basic2.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * 주식 가격 알림 시스템 설계
 *
 * 주체(Subject) : StockMarket
 *
 * 필드: String stockName, double stockPrice
 *
 * 메서드: setStockData(String name, double price)
 *
 * 옵저버(observer) : Investor
 *
 * 관심있는 주식 이름과 가격 변동 알림을 수신
 *
 *
 *  Alice notified: AAPL is now $145.5
 *  Bob notified: AAPL is now $145.5
 *  Alice notified: GOOG is now $2725.6
 *  Bob notified: GOOG is now $2725.6
 */


interface StockInvestor{
    void update(String stockName, double stockPrice);
}

class StockMarket{
    private final List<StockInvestor> investors = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    public void addInvestor(StockInvestor investor){
        investors.add(investor);
    }

    public void deleteInvestor(StockInvestor investor){
        investors.remove(investor);
    }

    public void notifyInvestor(){
        for(StockInvestor investor : investors){
            investor.update(stockName, stockPrice);
        }
    }

    public void setStockData(String name, double price){
        this.stockName = name;
        this.stockPrice = price;
        notifyInvestor();
    }
}

class VIP implements StockInvestor{
    private final String name;

    public VIP(String name){
        this.name = name;
    }

    @Override
    public void update(String stockName, double stockPrice){
        System.out.println( name + " notified: " + stockName + " is now $" + stockPrice);
    }


}
/**
 * Alice notified: AAPL is now $145.5
 * Bob notified: AAPL is now $145.5
 * Alice notified: GOOG is now $2725.6
 * Bob notified: GOOG is now $2725.6
 */

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        VIP user1 = new VIP("Alice");
        VIP user2 = new VIP("Bob");

        stockMarket.addInvestor(user1);
        stockMarket.addInvestor(user2);

        stockMarket.setStockData("AAPL", 145.5);
        stockMarket.setStockData("6006", 2725.6);
    }
}
