import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main 
{	
     public static void main(String[] args) 
     {
        //setup Queue of arriving customers 
      	Queue q = null;
      	try{
      		q = parseToQueue("customers.dat");
      	}catch(IOException e)
      	{
      		System.out.println("Error finding or reading file.");
      		System.exit(-1);
      	}

        //calculate statistics
      	int totalWaitTime = 0;
      	int nextAvailTimeA= 0;
      	int nextAvailTimeB= 0;
      		
      	//dequeue each customer and calculate his wait-time.
      	//while there are still customers in the queue
      	{
      	     //Get next customer's data from the queue
         
      	     //Choose the representative with the closest nextAvailTime
      	     int waitTime = 0;
                   //decide which rep to use
      	     if(nextAvailTimeA <= nextAvailTimeB) 
      	     {
                //calculate wait time for this customer
                //calculate the nextAvailTimeB
                //keep in mind that in some cases, the customer may arrive AFTER the nextAvailTime
      
      	     }
      	     else // if nextAvailTimeB < nextAvailTimeA
             {
                //calculate wait time for this customer
                //calculate the nextAvailTimeA
                //keep in mind that in some cases, the customer may arrive AFTER the nextAvailTime
             }
      
             totalWaitTime += waitTime;
         }
         System.out.println(totalWaitTime);
     }
 
     //Precondition:  File fileName must exist, and must have two integers per line, separated by a space.
     //               The first number is the arrival time, and the file must be sorted by arrival time with 
     //               earliest arrival time at the top of the file, and latest arrival time at the bottom of the file.
     public static Queue parseToQueue(String fileName) throws NumberFormatException, IOException 
     {
        Queue queue = new LinkedListQueue<CustomerRecord>(); //change to your Queue
        File file = new File(fileName); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String line; 
        String[] splitRecord;
       
        //read each line of the data file
        while ((line = br.readLine()) != null) 
        {
           splitRecord = line.split(" ");
           //use the data to create a CustomerRecord object
           queue.enqueue(new CustomerRecord(Integer.parseInt(splitRecord[0]), 
                                            Integer.parseInt(splitRecord[1])));
        } 
        br.close();
        return queue;
      }
}
