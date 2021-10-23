package application;
import java.util.*;
class snakebiteexception extends Exception{
	public snakebiteexception(String message) {
		super(message);
	}
}
class cricketbiteexception extends Exception{
	public cricketbiteexception(String message) {
		super(message);
	}
}
class vulturebiteexception extends Exception{
	public vulturebiteexception(String message) {
		super(message);
	}
}
class trampolineexception extends Exception{
	public trampolineexception(String message) {
		super(message);
	}
}
class gamewinnerexception extends Exception{
	public gamewinnerexception(String message) {
		super(message);
	}
}
class tile{
	private int steps;
	private int no;
	private final int number;
	tile(int number,int no){
		this.no=no;
		this.number=number;
	}
	public void setno(int no) {
		Random rand=new Random();
		no=rand.nextInt(no)+1;
		this.no=no;
	}
	public void setsteps(int steps) {
		Random rand=new Random();
		steps=rand.nextInt(10)+1;
		this.steps=steps;
	}
	public int getnumber() {
		return number;
	}
	public int getno() {
		
		return no;
	}
	public int getsteps() {
		
		return steps;
	}
}
class snake extends tile{
	snake(int number,int steps){
		super(number,steps);
	}
}
class vultures extends tile{
	vultures(int number,int steps){
		super(number,steps);
	}
}
class cricket extends tile{
	private int steps;
	cricket(int number,int steps){
		super(number,steps);
	}
}
class trampoline extends tile{
	trampoline(int number,int steps){
		super(number,steps);
	}
}
public class lab5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random rand = new Random();
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int white_tiles=0;
		Boolean t1=true;
		Boolean t2=true;
		int snakebite=0;
		int cricketbite=0;
		int vulturebite=0;
		int trampolines=0;
		int race_track;
		ArrayList<tile> tiles=new ArrayList<tile>();
		while(t1!=false) {
		Boolean done=false;
		while(!done) {
		System.out.println("ENTER TOTAL NO. OF TILES ON THE RACE TRACK(LENGTH)");
		int q1=s.nextInt();
		int arr[]=new int[q1+1];
		try {
		race_track=rand.nextInt(q1)+1;
		done=true;
		snake snake=new snake(1,race_track);
		tiles.add(snake);
		tiles.get(0).setno(race_track);
		tiles.get(0).setsteps(10);
		done=true;
		cricket cricket= new cricket(2,race_track-tiles.get(0).getno());
		tiles.add(cricket);
		tiles.get(1).setno(race_track-tiles.get(0).getno());
		tiles.get(1).setsteps(10);
		done=true;
		vultures vultures=new vultures(3,race_track-tiles.get(0).getno()-tiles.get(1).getno());
		tiles.add(vultures);
		tiles.get(2).setno(race_track-tiles.get(0).getno()-tiles.get(1).getno());
		tiles.get(2).setsteps(10);
		done=true;
		trampoline trampoline=new trampoline(4,race_track-tiles.get(0).getno()-tiles.get(1).getno()-tiles.get(2).getno());
		tiles.add(trampoline);
		tiles.get(3).setno(race_track-tiles.get(0).getno()-tiles.get(1).getno()-tiles.get(2).getno());
		tiles.get(3).setsteps(10);
		done=true;
		white_tiles=q1-(tiles.get(0).getno()+tiles.get(1).getno()+tiles.get(2).getno()+tiles.get(3).getno());
		done=true;
		}
		catch(IllegalArgumentException ill){
			//System.out.println(white_tiles);                //for showing no. of available white tiles on the track
			System.out.println("INPUT NOT VERIFY");
			System.out.println("TRY AGAIN");
			t1=false;
			break;
		}
		System.out.println("SETTING UP THE RACE TRACK....");
		for(int i=1;i<=q1;i++) {
			int no=rand.nextInt(4)+1;
			if(no==1&&count1<tiles.get(0).getno()) {
				arr[i]=1;
				count1+=1;
			}
			else if(no==2&&count2<tiles.get(1).getno()) {
				arr[i]=2;
				count2+=1;
			}
			else if(no==3&&count3<tiles.get(2).getno()) {
				arr[i]=3;
				count3+=1;
			}
			else if(no==4&&count4<tiles.get(3).getno()) {
				arr[i]=4;
				count4+=1;
			}
			else {
				arr[i]=5;
			}
		}
		System.out.println("DANGER...THERE ARE "+tiles.get(0).getno()+", "+tiles.get(1).getno()+", "+tiles.get(2).getno()+", "+"SNAKES, CRICKET AND VULTURES RESPECTIVELY ON YOU TRACK!");
		System.out.println("DANGER...EACH SNAKE, CRICKET AND VULTURE CAN THROW YOU BACK BY "+tiles.get(0).getsteps()+", "+tiles.get(1).getsteps()+", "+tiles.get(2).getsteps()+", "+"NO. OF TILES RESPECTIVELY!");
		System.out.println("GOOD NEWS...THERE ARE "+tiles.get(3).getno()+" NUMBER OF TRAMPOLINES ON YOUR TRACK!");
		System.out.println("GOOD NEWS...EACH TRAMPOLINES CAN HELP YOU ADVANCED BY "+tiles.get(3).getsteps()+" NUMBER OF TILES");
		System.out.println("ENTER THE PLAYER NAME");
		String name=s.next();
		System.out.println("STARTING THE GAME WITH "+name+" AT TILE-1");
		System.out.println("CONTROL TRANSFERRED TO COMPUTER FOR ROLLING THE DICE FOR "+name);
		System.out.println("HIT ENTER TO START THE  GAME");
		if(s.hasNextLine()) {
			System.out.println("GAME STARTED.................");
			int tile=1;
			int roll=0;
			while(tile<q1&&t2!=false) {
				int dice=rand.nextInt(6)+1;
				roll+=1;
				if(q1-tile==dice) {
					try {
						throw new gamewinnerexception("EXCEPTION");
					}
					catch(gamewinnerexception e) {
						System.out.println("Caught");
						System.out.println(e.getMessage());
					}
					System.out.println(name+" WINS THE RACE IN "+roll+" ROLLS");
					System.out.println("TOTAL SNAKEBITES:"+snakebite);
					System.out.println("TOTAL CRICKETBITES:"+cricketbite);
					System.out.println("TOTAL VULTUREBITES:"+vulturebite);
					System.out.println("TOTAL TRAMPOLINES:"+trampolines);
					t2=false;
					break;
				}
				else if(dice>q1-tile) {
					System.out.println("[ROLL-"+roll+"]: "+name+" ROLLED "+dice+" AT TILE-"+tile+", ");
				}
				else if(dice==6&&tile==1) {
					System.out.println("[ROLL-"+roll+"]: "+name+" ROLLED "+dice+" AT TILE-"+tile+", "+"YOU ARE OUT OF THE CAGE! YOU GET A FREE ROLL");
					tile+=1;
				}
				else if(dice!=6&&tile==1){
					System.out.println("[ROLL-"+roll+"]: "+name+" ROLLED "+dice+" AT TILE-"+tile+", OOPS YOU NEED 6 TO START");
				}
				else if(tile!=1&&tile<q1) {
					System.out.println("[ROLL-"+roll+"]: "+name+" ROLLED "+dice+" AT TILE-"+tile+", ");
					if(q1-tile==dice) {
						try {
							throw new gamewinnerexception("EXCEPTION");
						}
						catch(gamewinnerexception e) {
							System.out.println("Caught");
							System.out.println(e.getMessage());
						}
						System.out.println(name+" WINS THE RACE IN "+roll+" ROLLS");
						System.out.println("TOTAL SNAKEBITES:"+snakebite);
						System.out.println("TOTAL CRICKETBITES:"+cricketbite);
						System.out.println("TOTAL VULTUREBITES:"+vulturebite);
						System.out.println("TOTAL TRAMPOLINES:"+trampolines);
						t2=false;
						break;
					}
					else if(dice>q1-tile) {
						System.out.println("[ROLL-"+roll+"]: "+name+" ROLLED "+dice+" AT TILE-"+tile+", ");
					}
					tile+=dice;
					System.out.print(" YOU LANDED ON TILE-"+tile);
					System.out.println(" TRYING TO SHAKE THE TILE-"+tile);
					if(arr[tile]==1) {
						snakebite+=1;
						try {
								throw new snakebiteexception("EXCEPTION");
							}
							catch(snakebiteexception e) {
								System.out.println("Caught");
								System.out.println(e.getMessage());
							}
						System.out.println("HISS....! I AM A SNAKE, YOU GO BACK "+tiles.get(0).getsteps()+" TILE");
						if(tile-tiles.get(0).getsteps()<1) {
							tile=1;
							System.out.println(name+" MOVED TO TILE 1 AS IT CAN'T GO BACK FURTHER");
						}
						else {
							tile=tile-tiles.get(0).getsteps();
							System.out.println(name+" MOVED TO TILE-"+tile);
						}
					}
					if(arr[tile]==2) {
						cricketbite+=1;
						try {
							throw new cricketbiteexception("EXCEPTION");
						}
						catch(cricketbiteexception e) {
							System.out.println("Caught");
							System.out.println(e.getMessage());
						}
						System.out.println("CHIRP....! I AM A CRICKET, YOU GO BACK "+tiles.get(1).getsteps()+" TILE");
						if(tile-tiles.get(1).getsteps()<1) {
							tile=1;
							System.out.println(name+" MOVED TO TILE 1 AS IT CAN'T GO BACK FURTHER");
						}
						else {
							tile=tile-tiles.get(1).getsteps();
							System.out.println(name+" MOVED TO TILE-"+tile);
						}
					}
					if(arr[tile]==3) {
						vulturebite+=1;
						try {
							throw new vulturebiteexception("EXCEPTION");
						}
						catch(vulturebiteexception e) {
							System.out.println("Caught");
							System.out.println(e.getMessage());
						}
						System.out.println("YAPPING....! I AM A VULTURE, YOU GO BACK "+tiles.get(2).getsteps()+" TILE");
						if(tile-tiles.get(2).getsteps()<1) {
							tile=1;
							System.out.println(name+" MOVED TO TILE 1 AS IT CAN'T GO BACK FURTHER");
						}
						else {
							tile=tile-tiles.get(2).getsteps();
							System.out.println(name+" MOVED TO TILE-"+tile);
						}
					}
					if(arr[tile]==4) {
						trampolines+=1;
						try {
							throw new trampolineexception("EXCEPTION");
						}
						catch(trampolineexception e) {
							System.out.println("Caught");
							System.out.println(e.getMessage());
						}
						System.out.println("PINGPONG....! I AM A TRAMPOLINE, YOU ADVANCED "+tiles.get(3).getsteps()+" TILE");
							tile=tile+tiles.get(3).getsteps();
							System.out.println(name+" MOVED TO TILE-"+tile);
							/*if(tile<100) {
								//tile=100;
								//System.out.println(name+" MOVED TO TILE 1 AS IT CAN'T GO BACK FURTHER");
								System.out.println(name+" MOVED TO TILE-100");
							}
							else {
								tile=tile-tiles.get(3).getsteps();
								System.out.println(name+" MOVED TO TILE-"+tile);
							}*/
						
					}
					if(arr[tile]==5) {
						System.out.println("I AM A WHITE TILE ");
						System.out.println(name+" MOVED TO TILE-"+tile);
					}
				}
				
			}
		}
		}
		}
	}
	}
