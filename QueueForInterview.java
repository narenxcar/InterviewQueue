import java.util.*;
public class QueueForInterview {
Scanner in=new Scanner(System.in);
		Queue<String> reception=new LinkedList<>();
		Queue<String>conferenceRoom=new LinkedList<>();
		void enqueue() {
			System.out.print("Enter the Name of Applicant : ");
			String name=in.nextLine();
			reception.add(name);
		}
		void dequeue() {
			String name=conferenceRoom.remove();
			System.out.println(name+" is completed an interview ");
			String completedPerson=reception.remove();
			conferenceRoom.add(completedPerson);
			
		}
		void display() {
			System.out.println();
		}
		void choice() {
			while(true) {
			System.out.println("*****************************************");
			System.out.println("Press 1 for Enqueue ");
			System.out.println("Press 2 for Dequeue ");
			System.out.println("Press 3 for number of person in reception ");
			System.out.println("Press 4 for number of person in outside of conference room");
			System.out.println("press 5 for total number of person came for interview and list ");
			System.out.println("Press 6 to exit");
			System.out.println("*****************************************");
			int select=in.nextInt();
			switch(select) {
			case 1:
				if(conferenceRoom.size()<4) {
					System.out.print("Enter the Name of Applicant : ");
					String name=in.nextLine();
					conferenceRoom.add(name);
				}else {
				enqueue();
				}
				break;
			case 2:
				dequeue();
				break;
			case 3:
				System.out.println(reception.size()+" person are in reception ");
				System.out.println(reception);
				break;
			case 4:
				System.out.println(conferenceRoom.size()+" person are in Conference Room ");
				System.out.println(conferenceRoom);
				break;
			case 5:
				System.out.println("Total number of person remaining is "+conferenceRoom.size()+reception.size());
				System.out.print(conferenceRoom);
				System.out.println(reception);
			}
		}

}
}
