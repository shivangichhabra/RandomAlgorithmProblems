import java.util.*;

/**
 * Created by Shivangi on 6/15/2017.
 */
public class MeetingRoomsProblem {

    static class Interval{
        int start;
        int end;

        public Interval(int s, int e){
            start = s;
            end = e;
        }
    }

    /*
    Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei),
    determine if a person could attend all meetings. For example, Given [[0, 30],[5, 10],[15, 20]], return false.
     */
    public boolean problemOne(Interval[] intervals){
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });

        for(int i=0; i<intervals.length-1; i++){
            if(intervals[i+1].start < intervals[i].end)
                return false;
        }

        return true;
    }


    /*
    Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] find the minimum
     number of conference rooms required.
     */
    public int problemTwo(Interval[] intervals){


        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });

        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        queue.add(intervals[0].end);

        for(int i=1; i<intervals.length; i++){
            if(intervals[i].start < queue.peek())
                count++;
            else
                queue.poll();

            queue.add(intervals[i].end);
        }

        return count;
    }

    public static void main(String args[]){
        MeetingRoomsProblem mp = new MeetingRoomsProblem();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Interval[] intervals = new Interval[n];
        for(int i=0;i <intervals.length; i++){
            intervals[i] = new Interval(sc.nextInt(), sc.nextInt());
        }

        System.out.println(mp.problemOne(intervals));
        System.out.println(mp.problemTwo(intervals));
    }

}

