package condition;

public class Main05 {

	public static void main(String[] args) {

		/*
	       * 1. 만약 3000원 이상의 돈을 가지고 있으면 
	       * '택시를 타고 가라', 
	       * 그렇지 않으면 '걸어가라'
	       */
	      
		int money = 2000;
		
		if (money >= 3000) {
			System.out.println("택시를 타고 가라");
		}
		else {
				System.out.println("걸어가라");
			}
		
		
		
	      /*
	       * 2. 돈이 3000원 이상 있거나, 카드가 있다면 
	       * '택시를 타고 가라'
	       * 그렇지 않다면 '걸어가라'
	       */
	    boolean HaveCard = true;  
		
		if ( money >= 3000 || HaveCard == true) {
			System.out.println("택시를 타고 가라");
		}
		else {
			System.out.println("걸어가라");
		}
		
	      /*
	       * 3. 어떤 특정 정수 값 a가 짝수이면 "짝수",
	       * 홀수이면 "홀수" 
	       */
		
		int a = 8;
		if (a%2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	      
	      /*
	       * 4. 국어, 영어, 수학 점수의 평균이 95점 이상이면
	       * '장학생'을 출력,
	       * 국어점수가 70점 이상이면 "국어 : 합격",
	       * 그렇지 않으면 "국어 : 불합격"
	       */
		
		int korean = 100;
		int english = 89;
		int math = 95;
		int average = (korean + english + math) / 3;
		
		if ( average >= 95 )
		{
			System.out.println("장학생");
			}
	
		
		if ( korean >= 70) {
			   System.out.println("국어 : 합격");
		   }
			
		 else if ( korean < 70) {
			   System.out.println("국어 : 불합격");
		   }
		
	   
	      /*
	       * 5. 수학점수가 90점 이상이면 "A"학점, 
	       * 80점 이상이면 "B"학점, 70점 이상이면 "C"학점,
	       * 60점 이상이면 "D"학점, 나머지 "F"학점
	       */
		
		if ( math >= 90) {
			System.out.println("A");
			
		}
		else if ( math >= 80 ) {
			System.out.println("B");
		}
		else if ( math >= 70)
		{
			System.out.println("C");
		}
		else if ( math >= 60)
		{
			System.out.println("D");
		}
		else  
			{System.out.println("F");
	}
		}
		
		
	}

