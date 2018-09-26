package com.janas.rewardssimulator;

public class Main {
	
	enum InternetContracts {
		TORTOISE(100),
		RABBIT(300);
		
		private int value;
		
		InternetContracts(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
	}
	
	enum Rewards {
		ANT(5),
		BEE(7),
		CAT(9),
		DOG(12),
		ELEPHANT(19);
		
		private int reward;
		
		Rewards(int reward) {
			this.reward = reward;
		}
		
		public int getReward() {
			return reward;
		}
		
	}
	class Sell {
		
	}
	
	class Partner {
		long partnerId;
		long parentId;
		
		int soldContracts;
	}
	
	public void registerPartner() {
		
	}
	
	public void loadCSV() {
		
	}
	
	public void partnerLevel() {
		
	}
	
	public void listRewards() {
		
	}
	
	public void listAllRewards() {
		
	}
	
	public static void main(String[] args) {
		
	}

}
