import java.io.*;
import sun.audio.*;
import java.util.Scanner;

public class Music{
	public static void main(String[]args)throws Exception{
	    String musicFile = null;
	    InputStream in = null;
	    AudioStream audioStream = null;
	    String soundOptions = "1.tada  2.win1(3rd)  3.win2(movie)  4.win3(1st)  5.lose1(4th)  6.lose2(3rd)  7.lose3(2nd)  8.bikehorn 9.lose4(1st)  10.cheer  11.applause 12.banana  0.stop  99.exit";
	    System.out.println(soundOptions);

	    Scanner s = new Scanner(System.in);
		int option = s.nextInt();

	    while(option != 99){
	    	switch(option){
	    	case 1:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/tada.wav";
	    		break;

	    	case 2:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/win1.wav";
	    		break;

	    	case 3:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/win2.wav";
	    		break;		

	    	case 4:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/win3.wav";
	    		break;

	    	case 5:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/lose1.wav";
	    		break;

	    	case 6:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/lose2.wav";
	    		break;

	    	case 7:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/lose3.wav";
	    		break;

	    	case 8:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/bikehorn.wav";
	    		break;

	    	case 9:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/lose4.wav";
	    		break;

	    	case 10:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/cheer.wav";
	    		break;

	    	case 11:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/applause.wav";
	    		break;

	    	case 12:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/banana.wav";
	    		break;

	    	case 0:
	    		AudioPlayer.player.stop(audioStream);
	    		break;

	    	default:
	    		musicFile = "/Users/Bill_Cheng/Desktop/TSA/music/win1.wav";
	    		break;
	    	}
	    	if(option != 0){
		    	in = new FileInputStream(musicFile);
	    		audioStream = new AudioStream(in);
	    		AudioPlayer.player.start(audioStream);
 			}

	    	System.out.println(soundOptions);
	    	option = s.nextInt();
	    	if(option != 0)
	    		AudioPlayer.player.stop(audioStream); 
	    }
	}
}
