package lib.natives;

import java.util.Arrays;

import org.newdawn.slick.Color;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Armee {
	
	private map map;
	private int posMouseY;
	private int posMouseX;
	private int x_terr1_EU, y_terr1_EU,x_terr2_EU, y_terr2_EU,x_terr3_EU, y_terr3_EU,x_terr4_EU, y_terr4_EU,x_terr5_EU,
	y_terr5_EU, x_terr6_EU, y_terr6_EU, x_terr7_EU, y_terr7_EU;
	private int x_terr1_NA, y_terr1_NA,x_terr2_NA, y_terr2_NA,x_terr3_NA, y_terr3_NA,x_terr4_NA, y_terr4_NA,x_terr5_NA,
	y_terr5_NA, x_terr6_NA, y_terr6_NA, x_terr7_NA, y_terr7_NA, x_terr8_NA, y_terr8_NA, x_terr9_NA, y_terr9_NA;
	private int x_terr1_AF, y_terr1_AF,x_terr2_AF, y_terr2_AF,x_terr3_AF, y_terr3_AF,x_terr4_AF, y_terr4_AF,x_terr5_AF,
	y_terr5_AF, x_terr6_AF, y_terr6_AF;
	private int x_terr1_AUSTR, y_terr1_AUSTR,x_terr2_AUSTR, y_terr2_AUSTR,x_terr3_AUSTR, y_terr3_AUSTR,x_terr4_AUSTR, y_terr4_AUSTR;
	private int x_terr1_AS, y_terr1_AS,x_terr2_AS, y_terr2_AS,x_terr3_AS, y_terr3_AS,x_terr4_AS, y_terr4_AS;
	private int x_terr1_ASIE, y_terr1_ASIE,x_terr2_ASIE, y_terr2_ASIE,x_terr3_ASIE, y_terr3_ASIE,x_terr4_ASIE, y_terr4_ASIE,x_terr5_ASIE,
	y_terr5_ASIE, x_terr6_ASIE, y_terr6_ASIE, x_terr7_ASIE, y_terr7_ASIE, x_terr8_ASIE, y_terr8_ASIE, x_terr9_ASIE, y_terr9_ASIE,
	x_terr10_ASIE, y_terr10_ASIE, x_terr11_ASIE, y_terr11_ASIE, x_terr12_ASIE, y_terr12_ASIE, x_terr13_ASIE, y_terr13_ASIE,
	x_terr14_ASIE, y_terr14_ASIE;
	
	
	private float x,y = 0;

	private Initialisation initialisatio= new Initialisation(map, 6);
	private boolean init=initialisatio.getIni();
	private int [] territoirejoueur1_2=new int[7];
	private Integer [] territoirejoueur1=new Integer[7];
	


	private GameContainer container;

	 public void update(GameContainer container) throws SlickException {
		 posMouseX=container.getInput().getMouseX();
		 posMouseY=container.getInput().getMouseY();
		
		
	  }
	  
	  public void init(GameContainer container) throws SlickException {
		  this.initialisatio.init();
		  territoirejoueur1_2= initialisatio.getTerritoirejoueur1();
		  for(int i = 0; i < territoirejoueur1_2.length; i++) {
			  territoirejoueur1[i]=Integer.valueOf(territoirejoueur1_2[i]);
		  }
		  
		  
		 System.out.print(Arrays.toString(territoirejoueur1)+"couc");
		  	
	  }
	  
	  public void render(GameContainer container, Graphics g) throws SlickException {
		  if(init==true) {
		  g.setColor( Color.black );
		  g.drawString("Joueur 1 placer vos armées sur vos territoires", 500, 150);
		  g.drawString("Joueur 1 :pions rouges", 1200, 20);
		  
		  
		  
		  if(Arrays.asList(territoirejoueur1).contains(6)) {			//Europe
			    x_terr6_EU=800;
			    y_terr6_EU=300;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(5)) {
			    x_terr5_EU=743;
			    y_terr5_EU=355;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(1)) {
			    x_terr1_EU=640;
			    y_terr1_EU=315;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(2)) {
			    x_terr2_EU=600;
			    y_terr2_EU=270;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(3)) {
			    x_terr3_EU=710;
			    y_terr3_EU=323;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(4)) {
			    x_terr4_EU=710;
			    y_terr4_EU=270;
			    
		 }if(Arrays.asList(territoirejoueur1).contains(7)) {
			    x_terr7_EU=655;
			    y_terr7_EU=350;
			    
		 }
		 
		 
		 
		 
		 
		 if(Arrays.asList(territoirejoueur1).contains(8)) {				//Amerique du Nord  
			    x_terr6_NA=293;
			    y_terr6_NA=268;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(9)) {
			    x_terr5_NA=543;
			    y_terr5_NA=230;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(10)) {
			    x_terr1_NA=185;
			    y_terr1_NA=260;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(11)) {
			    x_terr2_NA=260;
			    y_terr2_NA=310;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(12)) {
			    x_terr3_NA=230;
			    y_terr3_NA=467;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(13)) {
			    x_terr4_NA=320;
			    y_terr4_NA=390;
			    
		 }if(Arrays.asList(territoirejoueur1).contains(14)) {
			    x_terr7_NA=343;
			    y_terr7_NA=320;
			    
		 }
		 if(Arrays.asList(territoirejoueur1).contains(15)) {
			    x_terr8_NA=420;
			    y_terr8_NA=305;
			    
		 }if(Arrays.asList(territoirejoueur1).contains(16)) {
			    x_terr9_NA=235;
			    y_terr9_NA=360;
			    
		 }
		 
		 
		 
		 
		 
		 
		 if(Arrays.asList(territoirejoueur1).contains(17)) {				//Afrique 
			    x_terr6_AF=760;
			    y_terr6_AF=640;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(28)) {
			    x_terr5_AF=670;
			    y_terr5_AF=470;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(19)) {
			    x_terr1_AF=745;
			    y_terr1_AF=550;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(20)) {
			    x_terr2_AF=785;
			    y_terr2_AF=512;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(21)) {
			    x_terr3_AF=755;
			    y_terr3_AF=435;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(22)) {
			    x_terr4_AF=843;
			    y_terr4_AF=635;
			    
		 }
		  
		  
		 
		  
		  
		  
		  if(Arrays.asList(territoirejoueur1).contains(23)) {				//Australie
			    x_terr1_AUSTR=1220;
			    y_terr1_AUSTR=660;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(24)) {
			    x_terr2_AUSTR=1135;
			    y_terr2_AUSTR=547;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(25)) {
			    x_terr3_AUSTR=1230;
			    y_terr3_AUSTR=575;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(26)) {
			    x_terr4_AUSTR=1150;
			    y_terr4_AUSTR=675;
			    
		 }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  if(Arrays.asList(territoirejoueur1).contains(27)) {				//Amerique du Sud
			    x_terr1_AS=400;
			    y_terr1_AS=700;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(28)) {
			    x_terr2_AS=450;
			    y_terr2_AS=600;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(29)) {
			    x_terr3_AS=350;
			    y_terr3_AS=615;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(30)) {
			    x_terr4_AS=340;
			    y_terr4_AS=530;
		  }
			    
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  if(Arrays.asList(territoirejoueur1).contains(31)) {				//Asie
			    x_terr6_ASIE=1180;
			    y_terr6_ASIE=265;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(32)) {
			    x_terr5_ASIE=1190;
			    y_terr5_ASIE=395;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(33)) {
			    x_terr1_ASIE=907;
			    y_terr1_ASIE=350;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(34)) {
			    x_terr2_ASIE=1017;
			    y_terr2_ASIE=395;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(35)) {
			    x_terr3_ASIE=980;
			    y_terr3_ASIE=445;
			    
		 }
		  if(Arrays.asList(territoirejoueur1).contains(36)) {
			    x_terr4_ASIE=1030;
			    y_terr4_ASIE=305;
			    
		 }if(Arrays.asList(territoirejoueur1).contains(37)) {
			    x_terr7_ASIE=812;
			    y_terr7_ASIE=423;
			    
		 }
		 if(Arrays.asList(territoirejoueur1).contains(38)) {
			    x_terr8_ASIE=420;
			    y_terr8_ASIE=305;
			    
		 }if(Arrays.asList(territoirejoueur1).contains(39)) {
			    x_terr9_ASIE=1055;
			    y_terr9_ASIE=470;
			    
		 } 
		 
		 if(Arrays.asList(territoirejoueur1).contains(40)) {
			    x_terr10_ASIE=945;
			    y_terr10_ASIE=250;
			    
		 }if(Arrays.asList(territoirejoueur1).contains(41)) {
			    x_terr11_ASIE=905;
			    y_terr11_ASIE=280;
			    
		 }
		 
		 if(Arrays.asList(territoirejoueur1).contains(42)) {
			    x_terr12_ASIE=1075;
			    y_terr12_ASIE=264;
			    
		 }
		 
		 
		 
		 if (container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON) && posMouseX<608 && posMouseX>482 && posMouseY<272 && posMouseY>212) {
		         System.out.println("coucou");
		         x=posMouseX;
		         y=posMouseY;
		         
		      }
		 g.setColor( Color.red );
		 g.fillOval(x_terr1_EU, y_terr1_EU, 15, 15);
		 g.fillOval(x_terr2_EU, y_terr2_EU, 15, 15);
		 g.fillOval(x_terr3_EU, y_terr3_EU, 15, 15);
		 g.fillOval(x_terr4_EU, y_terr4_EU, 15, 15);
		 g.fillOval(x_terr5_EU, y_terr5_EU, 15, 15);
		 g.fillOval(x_terr6_EU, y_terr6_EU, 15, 15);
		 g.fillOval(x_terr7_EU, y_terr7_EU, 15, 15);
		 
		 g.fillOval(x_terr1_NA, y_terr1_NA, 15, 15);
		 g.fillOval(x_terr2_NA, y_terr2_NA, 15, 15);
		 g.fillOval(x_terr3_NA, y_terr3_NA, 15, 15);
		 g.fillOval(x_terr4_NA, y_terr4_NA, 15, 15);
		 g.fillOval(x_terr5_NA, y_terr5_NA, 15, 15);
		 g.fillOval(x_terr6_NA, y_terr6_NA, 15, 15);
		 g.fillOval(x_terr7_NA, y_terr7_NA, 15, 15);
		 g.fillOval(x_terr8_NA, y_terr8_NA, 15, 15);
		 g.fillOval(x_terr9_NA, y_terr9_NA, 15, 15);
		 

		 
		 g.fillOval(x_terr1_AF, y_terr1_AF, 15, 15);
		 g.fillOval(x_terr2_AF, y_terr2_AF, 15, 15);
		 g.fillOval(x_terr3_AF, y_terr3_AF, 15, 15);
		 g.fillOval(x_terr4_AF, y_terr4_AF, 15, 15);
		 g.fillOval(x_terr5_AF, y_terr5_AF, 15, 15);
		 g.fillOval(x_terr6_AF, y_terr6_AF, 15, 15);
		 
		 
		 g.fillOval(x_terr1_AUSTR, y_terr1_AUSTR, 15, 15);
		 g.fillOval(x_terr2_AUSTR, y_terr2_AUSTR, 15, 15);
		 g.fillOval(x_terr3_AUSTR, y_terr3_AUSTR, 15, 15);
		 g.fillOval(x_terr4_AUSTR, y_terr4_AUSTR, 15, 15);
		 
		 g.fillOval(x_terr1_AS, y_terr1_AS, 15, 15);
		 g.drawOval(x_terr1_AS, y_terr1_AS, 15, 15);
		 g.fillOval(x_terr2_AS, y_terr2_AS, 15, 15);
		 g.fillOval(x_terr3_AS, y_terr3_AS, 15, 15);
		 g.fillOval(x_terr4_AS, y_terr4_AS, 15, 15);
		 g.setColor( Color.black );

		 g.drawOval(x_terr1_AS, y_terr1_AS, 15, 15);
		 
		 
		 g.setColor( Color.red );
		 
		 g.fillOval(x_terr1_ASIE, y_terr1_ASIE, 15, 15);
		 g.fillOval(x_terr1_ASIE, y_terr1_ASIE, 15, 15);
		 g.fillOval(x_terr2_ASIE, y_terr2_ASIE, 15, 15);
		 g.fillOval(x_terr3_ASIE, y_terr3_ASIE, 15, 15);
		 g.fillOval(x_terr4_ASIE, y_terr4_ASIE, 15, 15);
		 g.fillOval(x_terr5_ASIE, y_terr5_ASIE, 15, 15);
		 g.fillOval(x_terr6_ASIE, y_terr6_ASIE, 15, 15);
		 g.fillOval(x_terr7_ASIE, y_terr7_ASIE, 15, 15);
		 g.fillOval(x_terr8_ASIE, y_terr8_ASIE, 15, 15);
		 g.fillOval(x_terr9_ASIE, y_terr9_ASIE, 15, 15);
		 g.fillOval(x_terr10_ASIE, y_terr10_ASIE, 15, 15);
		 g.fillOval(x_terr11_ASIE, y_terr11_ASIE, 15, 15);
		 g.fillOval(x_terr12_ASIE, y_terr12_ASIE, 15, 15);
		  }
	  }
	  
	  public Armee(map map) {
		    this.map = map;
		  }
	  

}
