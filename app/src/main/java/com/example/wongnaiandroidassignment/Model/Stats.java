/**
 * Natapatchara Anuroje (นาย ณัฐพัชร อนุโรจน์)
 * Email: natapatchara.anuroje@gmail.com
 * LINE MAN Wongnai Junior 2022 - Engineering Team
 * Assignment for the Intern-Software Engineer, Android
 */
package com.example.wongnaiandroidassignment.Model;

import com.google.gson.annotations.SerializedName;

public class Stats{

	@SerializedName("total")
	private int total;

	@SerializedName("totalExchanges")
	private int totalExchanges;

	@SerializedName("totalMarkets")
	private int totalMarkets;

	@SerializedName("totalMarketCap")
	private String totalMarketCap;

	@SerializedName("total24hVolume")
	private String total24hVolume;

	@SerializedName("totalCoins")
	private int totalCoins;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setTotalExchanges(int totalExchanges){
		this.totalExchanges = totalExchanges;
	}

	public int getTotalExchanges(){
		return totalExchanges;
	}

	public void setTotalMarkets(int totalMarkets){
		this.totalMarkets = totalMarkets;
	}

	public int getTotalMarkets(){
		return totalMarkets;
	}

	public void setTotalMarketCap(String totalMarketCap){
		this.totalMarketCap = totalMarketCap;
	}

	public String getTotalMarketCap(){
		return totalMarketCap;
	}

	public void setTotal24hVolume(String total24hVolume){
		this.total24hVolume = total24hVolume;
	}

	public String getTotal24hVolume(){
		return total24hVolume;
	}

	public void setTotalCoins(int totalCoins){
		this.totalCoins = totalCoins;
	}

	public int getTotalCoins(){
		return totalCoins;
	}

	@Override
 	public String toString(){
		return 
			"Stats{" + 
			"total = '" + total + '\'' + 
			",totalExchanges = '" + totalExchanges + '\'' + 
			",totalMarkets = '" + totalMarkets + '\'' + 
			",totalMarketCap = '" + totalMarketCap + '\'' + 
			",total24hVolume = '" + total24hVolume + '\'' + 
			",totalCoins = '" + totalCoins + '\'' + 
			"}";
		}
}