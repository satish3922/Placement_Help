package project3;
import java.util.*;

class Video{
	String videoName;
	boolean checkout;
	int rating=-1;
	Video(String name){
		videoName=name;
	}
	String getName() {
		return videoName;
	}
	void doCheckout() {
		this.checkout=true;
		System.out.println("	Video "+"\""+getName()+"\""+" checked out  successfully.");
	}
	void doReturn() {
		this.checkout=false;
		System.out.println("	Video "+"\""+getName()+"\""+" Returned  successfully.");
	}
	void receiveRating(int rating) {
		this.rating=rating;
		System.out.println("	Rating "+"\""+rating+"\""+" has been mapped to the video"+"\""+getName()+"\"");
	}
	int getRating() {
		return rating;
	}
	boolean getCheckout() {
		return checkout;
	}
}
class VideoStore {
	Video [] store=new Video[100];
	 int c=-1;
	void addVideo(String name) {
	c=c+1;
	store[c] =new Video(name);
	
	}
	void doCheckout(String name) {
		int f=0;
		for(int i=0;store[i]!=null;i++)
			if(store[i].videoName.equals(name)) {
					f=1;
					store[i].checkout=true;
					store[i].doCheckout();
		}
		if(f==0)
			System.out.println("\n"+"No such video available to checked out ");
	}
	void doReturn(String name) {
		int f=0;
		for(int i=0;store[i]!=null;i++)
			if(store[i].videoName.equals(name)) {
				f=1;
				store[i].checkout=false;
				store[i].doReturn();
				break;
		}
		if(f==0)
			System.out.println("\n"+"No such video available to return");
	}
	void receiveRating(String name,int rating) {
		int f=0;
		for(int i=0;store[i]!=null;i++)
			if(store[i].videoName.equals(name)){
				f=1;
				store[i].rating=rating;
				store[i].receiveRating(rating);
				break;
		}
		if(f==0)
			System.out.println("\n"+"No such video available to rate");
	}
	void listInventory() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Video Name\t|\tCheckout Status  |\tRating");
		for(int i=0;store[i]!=null;i++) {
			if(store[i].checkout==true)
				System.out.println(store[i].getName()+"\t\t"+"|"+"\t\t"+store[i].getCheckout()+"     |\t"+store[i].getRating());
			else
				System.out.println(store[i].getName()+"\t\t"+"|"+"\t\t"+store[i].getCheckout()+"    |\t"+store[i].getRating());
		}
		System.out.println("------------------------------------------------------------");
	}

}

class VideoLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		VideoStore vs=new VideoStore();
		while(true) {
		System.out.println();
		System.out.println("MAIN MENU");
		System.out.println("=========");
		System.out.println("1.Add Videos :");
		System.out.println("2.Check out Video :");
		System.out.println("3.Return Video :");
		System.out.println("4.Receive Rating :");
		System.out.println("5.List Inventry :");
		System.out.println("6.Exit :");
		System.out.print("Enter your choice (1..6):");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.print("Enter the name of the video you want to add: ");
			String name=sc.next();
			vs.addVideo(name);
			System.out.println("	Video "+"\""+name+"\""+" added successfully.");
			break;
		case 2:
			System.out.print("Enter the name of video you want to check out :");
			name=sc.next();
			vs.doCheckout(name);
			break;
		case 3:
			System.out.print("Enter the name of video you want to Return :");
			name=sc.next();
			vs.doReturn(name);
			break;
		case 4 :
			System.out.print("Enter the name of video you want to Rate :");
			name=sc.next();
			System.out.print("Enter the rating for this video:");
			int rating=sc.nextInt();
			vs.receiveRating(name, rating);
			break;
		case 5:
			vs.listInventory();
			break;
		case 6:
			System.exit(0);
		}
	  }
	}

}






















