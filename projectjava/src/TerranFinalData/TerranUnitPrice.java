package TerranFinalData;

public abstract class TerranUnitPrice {
	//	미네랄은 	M
	//	가스는 	G 
	//	인구수는 	P
	//유닛을 구매할때 미네랄과 가스는 바뀌지 않으므로 전부 상수 처리를 해주자
		public static final int SCV_M = 50;
		public static final int SCV_G = 0;
		public static final int SCV_P = 1;
		
		public static final int MARINE_M = 50;
		public static final int MARINE_G = 0;
		public static final int MARINE_P = 1;
		
		public static final int MEDIC_M = 50;
		public static final int MEDIC_G = 25;
		public static final int MEDIC_P = 1;
		
		public static final int VULTURE_M = 75;
		public static final int VULTURE_G = 0;
		public static final int VULTURE_P = 2;
		
		public static final int TANK_M = 150;
		public static final int TANK_G = 100;
		public static final int TANK_P = 3;
		
		public static final int WRAITH_M = 150;
		public static final int WRAITH_G = 100;
		public static final int WRAITH_P = 2;
		
		public static final int DROPSHIP_M = 100;
		public static final int DROPSHIP_G = 100;
		public static final int DROPSHIP_p = 3;
		
		public static final int VALKYRIE_M = 250;
		public static final int VALKYRIE_G = 125;
		public static final int VALKYRIE_P = 4;
}

