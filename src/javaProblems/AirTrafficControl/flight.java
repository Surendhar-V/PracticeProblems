package javaProblems.AirTrafficControl;

class flight{
	String fName;
	int maxWeight;
	int timeHalt;
	flight(String fName,int maxWeight,int timeHalt){
		this.fName=fName;
		this.maxWeight=maxWeight;
		this.timeHalt=timeHalt;
	}
	int computeTime(int fweight){
		int per= (fweight/maxWeight)*100;//to get percentage of weight
		int ans=0;
		if(per>=75){
			ans=timeHalt;
		}
		else if(per>50 && per<75){
			ans=timeHalt-(0);//10 perc reduction
		}
		else{
			ans=timeHalt-(0);//20 perc reduction
		}
		return ans+10;//always add 10 sec extra...// 15 sec not include
	}
}