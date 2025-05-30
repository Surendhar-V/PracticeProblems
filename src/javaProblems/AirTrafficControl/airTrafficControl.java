package javaProblems.AirTrafficControl;

import java.util.*;
import java.lang.*;

class airTrafficControl extends Thread{
	String fname;
	int fweight;
	int compTime;
	int ch;//for choice
	String cho="";// for choice
	ArrayList<flight> flights = new ArrayList<flight>();
	ArrayList<runWay> runWays = new ArrayList<runWay>();
	airTrafficControl(){
		//for flight initalization
		flight atr = new flight("atr",12,30);//name,max weight,time to halt
		flight airbus = new flight("airbus",20,40);
		flight boeing = new flight("boeing",40,50);
		flight cargo = new flight("cargo",100,60);
		
		flights.add(atr);
		flights.add(airbus);
		flights.add(boeing);
		flights.add(cargo);
		//for runway initalization
		runWay r1=new runWay("run way one",40,true);
		runWay r2=new runWay("run way two",60,true);
		runWay r3=new runWay("run way three",80,true);
		runWay r4=new runWay("run way four",90,true);
		
		runWays.add(r1);
		runWays.add(r2);
		runWays.add(r3);
		runWays.add(r4);
		
	}
	Scanner sc = new Scanner(System.in);
	public void getDetails(int ch){
		System.out.println("Enter name of flight:");
		fname=sc.nextLine();
		System.out.println("Enter weight of flight(in tons):");
		fweight=sc.nextInt();
		if(ch==1) cho="Take Off";
		else if(ch==2) cho="Landing";
		else cho="Emergency Landing";
	}
	public void runwayAssign(){
		int all=0;
		for(int i=0;i<runWays.size();i++){
			if(compTime<=runWays.get(i).time && runWays.get(i).status){
				all=1;
				request r=new request(fname,fweight,cho,compTime,runWays.get(i));
				r.start();
				try{Thread.sleep(50);} catch(Exception e){}	//for don't interrupt two thread
				break;
			}
		}
		if(all==0) System.out.println("you have to wait");
	}
	public void getChoice(){

		System.out.println("1.Take off");
		System.out.println("2.Landing ");
		System.out.println("3.Emergency Landing");
		System.out.println("4.show RunWays");
		System.out.println("5.Exit");
		System.out.println("Enter Your Choice :");
		ch =sc.nextInt();

		switch(ch){
			case 1:{
				sc.nextLine();//eat empty line
				getDetails(ch);
				for(flight f:flights){
					if((f.fName).equalsIgnoreCase(fname)){
						compTime=f.computeTime(fweight);
						runwayAssign();
					}
				}
                //getChoice();
				break;
			}
			case 2:{
				sc.nextLine();
				getDetails(ch);
				for(flight f:flights){
					if((f.fName).equalsIgnoreCase(fname)){
						compTime=f.computeTime(fweight);
						runwayAssign();
					}
				}
				//getChoice();
				break;
			}
			case 3:{
				sc.nextLine();
				getDetails(ch);
				for(flight f:flights){
					if((f.fName).equalsIgnoreCase(fname)){
						compTime=f.computeTime(fweight);
						runwayAssign();
					}
				}
			   	//getChoice();
				break;
			}
			case 4:{
					for(runWay rw:runWays){
						if(rw.status)
							System.out.println(rw.name+" is free");
						else
							System.out.println(rw.name+" is busy");
					}
				break;
			}
			case 5:
        }
	}
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		int ans=1;
		airTrafficControl atc = new airTrafficControl();
	   	while(ans==1){
			atc.getChoice();
			System.out.println(" Do you want to continue.......(yes-1 no-0)");
			ans=s1.nextInt();
		}
	}
}