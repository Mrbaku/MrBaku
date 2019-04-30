package day07_comparison_operators;

public class PreAndPost2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int messages=10;
        messages++;
        ++messages;
        System.out.println("messages: " +messages);
        
        System.out.println();
        
        int readMessages= --messages;
        System.out.println("Read messages: " +readMessages);
        System.out.println("Messages: "+ messages);
        
        
        
        int unreadMessages=readMessages--;
        
        System.out.println("unread messages "+ unreadMessages);
        System.out.println("read messages: "+ readMessages);
        
        int total= unreadMessages++-readMessages--;
        
        System.out.println();
        
        System.out.println("unread: "+ unreadMessages);
        System.out.println("read: "+ readMessages);
        System.out.println(total);
        
        
        System.out.println();
      
         int count=20;
         int count2=10;
                 //30           //21        //9
         int totalCount=++count+--count2;
        
        System.out.println("count: "+ count);
        System.out.println("count2: "+ count2);
        System.out.println("total: "+ totalCount);
        
        System.out.println();
                    //21      +1+1=23
        int myCount=count++ + ++count;
        
        System.out.println("My count: "+myCount);
        
        
        System.out.println(++count);
	}

}
