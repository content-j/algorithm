	
  
  
최근에 개발된 지능형 기차가 1번역(출발역)부터 4번역(종착역)까지 4개의 정차역이 있는 노선에서 운행되고 있다. 
이 기차에는 타거나 내리는 사람 수를 자동으로 인식할 수 있는 장치가 있다. 
이 장치를 이용하여 출발역에서 종착역까지 가는 도중 기차 안에 사람이 가장 많을 때의 사람 수를 계산하려고 한다.
단, 이 기차를 이용하는 사람들은 질서 의식이 투철하여, 역에서 기차에 탈 때, 내릴 사람이 모두 내린 후에 기차에 탄다고 가정한다.


예)
내린 사람 수	탄 사람 수
1번역(출발역)	0	 32
2번역	        3	 13
3번역	        28 25
4번역(종착역)	39  0


예를 들어, 위와 같은 경우를 살펴보자. 
이 경우, 기차 안에 사람이 가장 많은 때는 2번역에서 3명의 사람이 기차에서 내리고, 
13명의 사람이 기차에 탔을 때로, 총 42명의 사람이 기차 안에 있다.

이 기차는 다음 조건을 만족하면서 운행된다고 가정한다.

기차는 역 번호 순서대로 운행한다.
출발역에서 내린 사람 수와 종착역에서 탄 사람 수는 0이다.
각 역에서 현재 기차에 있는 사람보다 더 많은 사람이 내리는 경우는 없다.
기차의 정원은 최대 10,000명이고, 정원을 초과하여 타는 경우는 없다.
4개의 역에 대해 기차에서 내린 사람 수와 탄 사람 수가 주어졌을 때, 기차에 사람이 가장 많을 때의 사람 수를 계산하는 프로그램을 작성하시오.
  
  
  
  
  
  
  
  
  
  
  
  public static void main(String[] args) {
		
		
		//지능형기차
		Scanner scanner = new Scanner(System.in);
		
		int maxPeople = 0;
		
		//탑승한 승객수
		int inPeople = 0;
		
		//하차한 승객수
		int outPeople = 0;
		
		//전역에서 탑승한 승객수
		int prePeople = 0;
		Random random = new Random();
		
		//역번호
		int stationNum = 1;

		while(true){

			if(stationNum==1){
				//출발역
				
				//탑승!
				inPeople = random.nextInt(100);
				
				prePeople=inPeople;
				
				//처음 탑승이 가장 많은 사람들이 탑승하게 된다.
				maxPeople = inPeople;
				
			}else{
				
				//하차한 승객 수
				outPeople = random.nextInt(prePeople);
				
				//탑승한 승객수
				inPeople = random.nextInt(100);
				
				
				
				if(maxPeople < inPeople+(prePeople - outPeople)){
					maxPeople = inPeople+(prePeople - outPeople);
				}
				
				prePeople = inPeople+(prePeople - outPeople);
				
			}//if ~ else

			System.out.println("========================================");
			System.out.println(stationNum+"번역");
			System.out.println("최대 탑승객수 : "+maxPeople);
			System.out.println("내린 승객수 :"+outPeople+" / 탑승객 :"+inPeople);
			System.out.println("========================================");
			
			if(stationNum==4){
				//종착역
				break;
			}
			stationNum++;
			
		}//while
		

		System.out.println("가장 많은 탑승해있던 승객수 : "+maxPeople );
	}//main




---------------------결과-----------------------------------

1번역
최대 탑승객수 : 49
내린 승객수 :0 / 탑승객 :49


2번역
최대 탑승객수 : 136
내린 승객수 :7 / 탑승객 :94


3번역
최대 탑승객수 : 146
내린 승객수 :6 / 탑승객 :16

4번역
최대 탑승객수 : 146
내린 승객수 :139 / 탑승객 :46


가장 많은 탑승해있던 승객수 : 146
