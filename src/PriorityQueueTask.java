import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * You have to deal with 2 types of events: ENTER (a student enters the queue) or SERVED.
 *
 * A unique token is assigned to any student entering the queue. The queue serves the
 * students based on the following criteria:
 *
 * The student having the highest Cumulative Grade Point Average (CGPA) is served first
 * Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
 * Any students having the same CGPA and name will be served in ascending token order.
 * Given a sequence of n events, print the names of students who are yet to be served(based
 * on above criteria). If the queue is empty, print EMPTY.
 *
 * Sample Input:
 *  12
 *  ENTER John 3.75 50
 *  ENTER Mark 3.8 24
 *  ENTER Shafaet 3.7 35
 *  SERVED
 *  SERVED
 *  ENTER Samiha 3.85 36
 *  SERVED
 *  ENTER Ashley 3.9 42
 *  ENTER Maria 3.6 46
 *  ENTER Anik 3.95 49
 *  ENTER Dan 3.95 50
 *  SERVED
 *
 * Sample Output:
 *  Dan
 *  Ashley
 *  Shafaet
 *  Maria
 */
class Students implements Comparable{
    private int token;
    private String fname;
    private double cgpa;
    public Students(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Object o){
        Students s=(Students)o;
        if(cgpa==s.getCgpa()){
            if(fname.equals(s.getFname())){
                return token-s.getToken();
            }else{
                return fname.compareTo(s.getFname());
            }
        }else{
            if(s.getCgpa()-cgpa>0)
                return 1;
            else
                return -1;
        }
    }
}

public class PriorityQueueTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Students> pq = new PriorityQueue<>();
        while (totalEvents > 0) {
            String event = in.next();

            if (event.equals("ENTER")) {

                String name = in.next();
                double cgpa = in.nextDouble();
                int id = in.nextInt();
                Students st = new Students(id, name, cgpa);
                pq.add(st);

            } else if (event.equals("SERVED")) {

                pq.poll();

            }
            totalEvents--;
        }

        if (pq.isEmpty()){
            System.out.println("EMPTY");
         } else {
            while(!pq.isEmpty())
                System.out.println(pq.poll().getFname());
        }

    }
}