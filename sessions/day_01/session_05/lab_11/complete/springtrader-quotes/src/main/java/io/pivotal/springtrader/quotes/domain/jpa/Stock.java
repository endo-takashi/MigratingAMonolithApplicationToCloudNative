package io.pivotal.springtrader.quotes.domain.jpa;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;
import org.springframework.data.annotation.LastModifiedDate;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by cq on 18/1/16.
 */
@Entity(name = "STOCKS")
@Table(name = "STOCKS", indexes = @Index(name = "name_idx", columnList = "name"))
public class Stock {

        @Id
        @JsonProperty("Symbol")
        private String symbol;

        @LastModifiedDate
        @JsonIgnore
        private DateTime lastModifiedDate;


        @JsonProperty("Name")
        private String name;

        @JsonProperty("Exchange")
        private String exchange;

        @JsonProperty("Status")
        private String status;

        @JsonProperty(value = "LastPrice")
        @Column(name = "lastprice")
        private Double lastPrice;

        @JsonProperty("Change")
        private Double change;

        @JsonProperty("ChangePercent")
        @Column(name = "changepercent")
        private Double changePercent;

        @JsonProperty("Timestamp")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "EEE MMM dd HH:mm:ss zzzXXX yyyy", locale = "ENGLISH")
        @Temporal(TemporalType.TIMESTAMP)
        private Date ts;

        @JsonProperty("MSDate")
        private Double mSDate;

        @JsonProperty("MarketCap")
        @Column(name = "marketcap")
        private Double marketCap;

        @JsonProperty("Volume")
        private Integer volume;

        @JsonProperty("ChangeYTD")
        @Column(name = "changeytd")
        private Double changeYTD;

        @JsonProperty("ChangePercentYTD")
        @Column(name = "changepercentytd")
        private Double changePercentYTD;

        @JsonProperty("High")
        private Double high;

        @JsonProperty("Low")
        private Double low;

        @JsonProperty("Open")
        private Double open;

        public DateTime getLastModifiedDate() {
            return lastModifiedDate;
        }

        public void setLastModifiedDate(DateTime lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getExchange() {
            return exchange;
        }

        public void setExchange(String exchange) {
            this.exchange = exchange;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Double getLastPrice() {
            return lastPrice;
        }

        public void setLastPrice(Double lastPrice) {
            this.lastPrice = lastPrice;
        }

        public Double getChange() {
            return change;
        }

        public void setChange(Double change) {
            this.change = change;
        }

        public Double getChangePercent() {
            return changePercent;
        }

        public void setChangePercent(Double changePercent) {
            this.changePercent = changePercent;
        }

        public Date getTimestamp() {
            return ts;
        }

        public void setTimestamp(Date timestamp) {
            this.ts = timestamp;
        }

        public Double getmSDate() {
            return mSDate;
        }

        public void setmSDate(Double mSDate) {
            this.mSDate = mSDate;
        }

        public Double getMarketCap() {
            return marketCap;
        }

        public void setMarketCap(Double marketCap) {
            this.marketCap = marketCap;
        }

        public Integer getVolume() {
            return volume;
        }

        public void setVolume(Integer volume) {
            this.volume = volume;
        }

        public Double getChangeYTD() {
            return changeYTD;
        }

        public void setChangeYTD(Double changeYTD) {
            this.changeYTD = changeYTD;
        }

        public Double getChangePercentYTD() {
            return changePercentYTD;
        }

        public void setChangePercentYTD(Double changePercentYTD) {
            this.changePercentYTD = changePercentYTD;
        }

        public Double getHigh() {
            return high;
        }

        public void setHigh(Double high) {
            this.high = high;
        }

        public Double getLow() {
            return low;
        }

        public void setLow(Double low) {
            this.low = low;
        }

        public Double getOpen() {
            return open;
        }

        public void setOpen(Double open) {
            this.open = open;
        }

        @Override
        public String toString() {
            return "Stock{" +
                    "symbol='" + symbol + '\'' +
                    ", name='" + name + '\'' +
                    ", exchange='" + exchange + '\'' +
                    ", status='" + status + '\'' +
                    ", lastPrice=" + lastPrice +
                    ", change=" + change +
                    ", changePercent=" + changePercent +
                    ", timestamp=" + ts +
                    ", mSDate=" + mSDate +
                    ", marketCap=" + marketCap +
                    ", volume=" + volume +
                    ", changeYTD=" + changeYTD +
                    ", changePercentYTD=" + changePercentYTD +
                    ", high=" + high +
                    ", low=" + low +
                    ", open=" + open +
                    '}';
        }
}