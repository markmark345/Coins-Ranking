/**
 * Natapatchara Anuroje (นาย ณัฐพัชร อนุโรจน์)
 * Email: natapatchara.anuroje@gmail.com
 * LINE MAN Wongnai Junior 2022 - Engineering Team
 * Assignment for the Intern-Software Engineer, Android
 */
package com.example.wongnaiandroidassignment.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CoinsItem{

	@SerializedName("symbol")
	private String symbol;

	@SerializedName("marketCap")
	private String marketCap;

	@SerializedName("color")
	private String color;

	@SerializedName("change")
	private String change;

	@SerializedName("btcPrice")
	private String btcPrice;

	@SerializedName("listedAt")
	private int listedAt;

	@SerializedName("uuid")
	private String uuid;

	@SerializedName("sparkline")
	private List<String> sparkline;

	@SerializedName("24hVolume")
	private String jsonMember24hVolume;

	@SerializedName("tier")
	private int tier;

	@SerializedName("coinrankingUrl")
	private String coinrankingUrl;

	@SerializedName("price")
	private String price;

	@SerializedName("name")
	private String name;

	@SerializedName("lowVolume")
	private boolean lowVolume;

	@SerializedName("rank")
	private int rank;

	@SerializedName("iconUrl")
	private String iconUrl;

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setMarketCap(String marketCap){
		this.marketCap = marketCap;
	}

	public String getMarketCap(){
		return marketCap;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setChange(String change){
		this.change = change;
	}

	public String getChange(){
		return change;
	}

	public void setBtcPrice(String btcPrice){
		this.btcPrice = btcPrice;
	}

	public String getBtcPrice(){
		return btcPrice;
	}

	public void setListedAt(int listedAt){
		this.listedAt = listedAt;
	}

	public int getListedAt(){
		return listedAt;
	}

	public void setUuid(String uuid){
		this.uuid = uuid;
	}

	public String getUuid(){
		return uuid;
	}

	public void setSparkline(List<String> sparkline){
		this.sparkline = sparkline;
	}

	public List<String> getSparkline(){
		return sparkline;
	}

	public void setJsonMember24hVolume(String jsonMember24hVolume){
		this.jsonMember24hVolume = jsonMember24hVolume;
	}

	public String getJsonMember24hVolume(){
		return jsonMember24hVolume;
	}

	public void setTier(int tier){
		this.tier = tier;
	}

	public int getTier(){
		return tier;
	}

	public void setCoinrankingUrl(String coinrankingUrl){
		this.coinrankingUrl = coinrankingUrl;
	}

	public String getCoinrankingUrl(){
		return coinrankingUrl;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLowVolume(boolean lowVolume){
		this.lowVolume = lowVolume;
	}

	public boolean isLowVolume(){
		return lowVolume;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	public void setIconUrl(String iconUrl){
		this.iconUrl = iconUrl;
	}

	public String getIconUrl(){
		return iconUrl;
	}

	@Override
 	public String toString(){
		return 
			"CoinsItem{" + 
			"symbol = '" + symbol + '\'' + 
			",marketCap = '" + marketCap + '\'' + 
			",color = '" + color + '\'' + 
			",change = '" + change + '\'' + 
			",btcPrice = '" + btcPrice + '\'' + 
			",listedAt = '" + listedAt + '\'' + 
			",uuid = '" + uuid + '\'' + 
			",sparkline = '" + sparkline + '\'' + 
			",24hVolume = '" + jsonMember24hVolume + '\'' + 
			",tier = '" + tier + '\'' + 
			",coinrankingUrl = '" + coinrankingUrl + '\'' + 
			",price = '" + price + '\'' + 
			",name = '" + name + '\'' + 
			",lowVolume = '" + lowVolume + '\'' + 
			",rank = '" + rank + '\'' + 
			",iconUrl = '" + iconUrl + '\'' + 
			"}";
		}
}