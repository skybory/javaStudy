package loop;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. 아래 그림을 찍으세요
 * 
 * 8*8 별모양 찍기\
 * /*
       * 1. 아래 그림을 찍으세요(8*8)
       *     ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
       */
		int starlength = 8;
		for(int i =1; i<= starlength;i++) {
			for (int j =1; j < starlength; j++)
			{
				System.out.print("★");
			}
			System.out.println("★");
		}
		
		System.out.println("-----------------------------------------");
      
      /*
       * 2. 아래 그림을 찍으세요(8*8)
       *     ★★★★★★★★
	         ★★★★★★★
	         ★★★★★★
	         ★★★★★
	         ★★★★
	         ★★★
	         ★★
	         ★
       */
	    int starlength2_v = 8;
	    int starlength2_h = 8;
	      for (int i = 1; i <= starlength2_v; i++) {
	    	  	
	    	  for (int j = 1; j < starlength2_h; j++) {
	    		  System.out.print("★");
	    	  }
	    	  starlength2_h -= 1; 
	      System.out.println("★");
	      }
			
	      System.out.println("---------------------------------");
		
      /*
       * 3. 아래 그림을 찍으세요(8*8)
       * 	 ★
	         ★★
	         ★★★
	         ★★★★
	         ★★★★★
	         ★★★★★★
	         ★★★★★★★
	         ★★★★★★★★
       */
	     
	      int starlength3 = 1;
	      for (int i = 1; i <= 8; i++) {
	    	  	
	    	  for (int j = 1; j < starlength3; j++) {
	    		  System.out.print("★");
	    	  }
	    	  starlength3 += 1; 
	      System.out.println("★");
	      }
	      System.out.println("---------------------------------");
		
	      
	      
	      System.out.println("soft coding 부분 수정 해야함");
	       
	      
	      int starlength3_v = 8;
		  int starlength3_h = 8;
		  for (int i = 1; i <= starlength3_v; i++) {
		 	
		    	  for (int j = 1; j < starlength3_v - starlength3_h + 1; j++) {
		    		  System.out.print("★");
		    	  }
		    	  starlength3_h -= 1; 
		      System.out.println("★");
		      }
				
		      System.out.println("---------------------------------");
		
		
		
	/*
	 * 3v = 8 ,3h =8
	 * i= 1
	 */
	}
}
