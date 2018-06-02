package lib.natives;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Territoire {

	private int posMouseY;
	private int posMouseX;

	private GameContainer container;
	private map map;
	private Graphics g;

	
	private int [] TableauTerritoires = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
			23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42};
	

	 private int [] Tableau_terr_x_debut= {623, 594, 686, 691, 706, 755, 631,
			  130, 209, 194, 301, 479, 243, 320, 387, 173,
			  724, 784, 705, 832, 593, 695,
			  1229, 1114, 1200, 1110,
			  365, 419, 355, 331,
			  859, 964, 904, 1011, 1175, 1132, 796, 1007, 1034, 935, 859, 1025};
			
			
	  private int [] Tableau_terr_y_debut= {300, 269, 314, 255, 350, 272, 341,
			  248, 298, 420, 348, 219, 238, 300, 296, 347,
			  539, 495, 418, 624, 408, 630,
			  620, 485, 553, 629,
			  693, 557, 614, 511,
			  337, 377, 428, 304, 363, 243, 395, 343, 469, 225, 278, 236};
		
	  private int [] Tableau_terr_x_fin= {663, 617, 734, 743, 757, 840, 680,
			  193, 290, 335, 399, 610, 349, 366, 461, 285,
			  770, 875, 800, 863, 693, 805,
			  1282, 1180, 1340, 1170,
			  468, 507, 402, 438,
			  948, 1137, 1031, 1084, 1211, 1258, 899, 1150, 1123, 993, 943, 1095};
			
	  private int [] Tableau_terr_y_fin= {339, 287, 342, 300, 390, 353, 380,
			  296, 342, 501, 440, 265, 296, 348, 349, 395,
			  599, 575, 457, 671, 537, 720,
			  751, 598, 613, 708,
			  811, 662, 642, 541,
			  379, 421, 527, 332, 423, 327, 475, 374, 532, 287, 318, 291};
	  
	  //Territoire alentours Europe
	  private int [] terri_alentour_terr1_EU = {1,2,3,6};
	  private int [] terri_alentour_terr2_EU = {0,3,11};
	  private int [] terri_alentour_terr3_EU = {0,3,4,5,6};
	  private int [] terri_alentour_terr4_EU = {0,1,2,5};
	  private int [] terri_alentour_terr5_EU = {2,5,6,18,36};
	  private int [] terri_alentour_terr6_EU = {2,3,4,30,36,40};
	  private int [] terri_alentour_terr7_EU = {0,2,4,20};

	  //Territoire alentours Amérique du Nord
	  private int [] terri_alentour_terr1_NA = {8,12,35};
     private int [] terri_alentour_terr2_NA = {7,12,13,15};
	  private int [] terri_alentour_terr3_NA = {10,15,29};
	  private int [] terri_alentour_terr4_NA = {9,13,14,15};
	  private int [] terri_alentour_terr5_NA = {1,12,13,14};
	  private int [] terri_alentour_terr6_NA = {7,8,11,13};
	  private int [] terri_alentour_terr7_NA = {8,10,11,12,14};
	  private int [] terri_alentour_terr8_NA = {10,11,13};
	  private int [] terri_alentour_terr9_NA = {8,9,10,13};

	//Territoire alentours Afrique
	  private int [] terri_alentour_terr1_AF = {17,20,21};
     private int [] terri_alentour_terr2_AF = {16,18,19,20,21,36};
	  private int [] terri_alentour_terr3_AF = {4,20,17,36};
	  private int [] terri_alentour_terr4_AF = {17,21};
	  private int [] terri_alentour_terr5_AF = {6,16,17,18,27};
	  private int [] terri_alentour_terr6_AF = {16,19};

	//Territoire alentours Australie
	  private int [] terri_alentour_terr1_AUSTR = {24,25};
     private int [] terri_alentour_terr2_AUSTR = {24,25,38};
	  private int [] terri_alentour_terr3_AUSTR = {22,23,25};
	  private int [] terri_alentour_terr4_AUSTR = {22,23,24};
	  
	//Territoire alentours Amérique du Sud
	  private int [] terri_alentour_terr1_AS = {27,28};
     private int [] terri_alentour_terr2_AS = {20,26,28,29};
	  private int [] terri_alentour_terr3_AS = {26,27,29};
	  private int [] terri_alentour_terr4_AS = {9,27,28};
	  
	//Territoire alentours Asie
	  private int [] terri_alentour_terr1_ASIE = {5,31,32,36,40};
     private int [] terri_alentour_terr2_ASIE = {30,32,37,38,39};
	  private int [] terri_alentour_terr3_ASIE = {30,31,36,38};
	  private int [] terri_alentour_terr4_ASIE = {35,37,39,41};
	  private int [] terri_alentour_terr5_ASIE = {35,37};
     private int [] terri_alentour_terr6_ASIE = {7,33,34,37,41};
	  private int [] terri_alentour_terr7_ASIE = {4,5,17,18,30,32};
	  private int [] terri_alentour_terr8_ASIE = {31,33,35};
	  private int [] terri_alentour_terr9_ASIE = {23,31,32};
	  private int [] terri_alentour_terr10_ASIE = {31,33,40,41};
	  private int [] terri_alentour_terr11_ASIE = {5,30,31,39};
	  private int [] terri_alentour_terr12_ASIE = {33,35,39};
	  

	
	 public void update(GameContainer container) throws SlickException {
		 	posMouseY = container.getInput().getMouseY();
			posMouseX= container.getInput().getMouseX();
		
	  }
	  
	  public void init(GameContainer container) throws SlickException {

			
	  }
	  
	  public void render(GameContainer container, Graphics g) throws SlickException {
		  for(int i = 0; i < Tableau_terr_y_debut.length; i++) {
			  
			  g.setColor(Color.red);
				 g.drawRect(Tableau_terr_x_debut[i], Tableau_terr_y_debut[i], Tableau_terr_x_fin[i]-Tableau_terr_x_debut[i], Tableau_terr_y_fin[i]-Tableau_terr_y_debut[i]);
		  }
		  }
		 

	  
	  
	  
	  public int[] getTableauTerritoires() {
		  return TableauTerritoires;
		 }
	  
	  public int[] getTableau_terr_x_debut() {
		  return Tableau_terr_x_debut;
		 }
	  
	  public int[] getTableau_terr_y_debut() {
		  return Tableau_terr_y_debut;
		 }
	  
	  public int[] getTableau_terr_x_fin() {
		  return Tableau_terr_x_fin;
		 }
	  
	  public int[] getTableau_terr_y_fin() {
		  return Tableau_terr_y_fin;
		 }
	  
}
