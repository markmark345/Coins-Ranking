/**
 * Natapatchara Anuroje (นาย ณัฐพัชร อนุโรจน์)
 * Email: natapatchara.anuroje@gmail.com
 * LINE MAN Wongnai Junior 2022 - Engineering Team
 * Assignment for the Intern-Software Engineer, Android
 */
package com.example.wongnaiandroidassignment.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data{

	@SerializedName("stats")
	private Stats stats;

	@SerializedName("coins")
	private List<CoinsItem> coins;

	public void setStats(Stats stats){
		this.stats = stats;
	}

	public Stats getStats(){
		return stats;
	}

	public void setCoins(List<CoinsItem> coins){
		this.coins = coins;
	}

	public List<CoinsItem> getCoins(){
		return coins;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"stats = '" + stats + '\'' + 
			",coins = '" + coins + '\'' + 
			"}";
		}
}