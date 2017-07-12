package part_04;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

class Queue {
    private int q[];
    private int putloc;
    private int getloc;

    Queue(int size) {
        q = new int[size];
        putloc = 0;
        getloc = 0;
    }

    public void put(int ch) {
        if(putloc==q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putloc] = ch;
        putloc++;
    }

    public int get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (int) 0;
        }

        return q[getloc++];
    }
}


class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        int ch;
        int i;

        for(i=0; i < 100; i++)
            bigQ.put(i);


        System.out.print("Queue: ");
        for(i=0; i <= 100; i++) {
            ch = bigQ.get();
            if( ch % 2 == 0) System.out.print(ch+" ");
        }

    }
}
