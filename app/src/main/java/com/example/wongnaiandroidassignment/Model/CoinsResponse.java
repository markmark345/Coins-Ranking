/**
 * Natapatchara Anuroje (นาย ณัฐพัชร อนุโรจน์)
 * Email: natapatchara.anuroje@gmail.com
 * LINE MAN Wongnai Junior 2022 - Engineering Team
 * Assignment for the Intern-Software Engineer, Android
 */
package com.example.wongnaiandroidassignment.Model;

import com.google.gson.annotations.SerializedName;

public class CoinsResponse{

	@SerializedName("data")
	private Data data;

	@SerializedName("status")
	private String status;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"CoinsResponse{" + 
			"data = '" + data + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}