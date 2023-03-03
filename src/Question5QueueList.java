import java.util.*;
class queue<T> {

    int Front = -1, Rear = -1;

    ArrayList<T> A = new ArrayList<>();


    T Front()
    {
        if (Front == -1)

            return null;

        return A.get(Front);
    }

    T Rear()
    {
        if (Rear == -1)
            return null;
        return A.get(Rear);
    }

    void enqueue(T X)
    {
        if (this.empty()) {
            Front = 0;
            Rear = 0;
            A.add(X);
        }

        else {
            Front++;
            if (A.size() > Front) {

                A.set(Front, X);
            }
            else

                A.add(X);
        }
    }

    void dequeue()
    {
        if (this.empty())

            System.out.println("Queue is already empty");

        else if (Front == Rear) {

            // Both are pointing to same element
            Front = Rear = -1;
        }

        else {

            Rear++;
        }
    }

    // Checks whether the queue is empty
    boolean empty()
    {
        
        if (Front == -1 && Rear == -1)
            return true;
        return false;
    }


    // @Override
    public String toString()
    {
        if (this.empty())
            return "";

        String Answer = "";

        for (int i = Rear; i < Front; i++) {
            Answer += String.valueOf(A.get(i)) + " ";
        }

        Answer += String.valueOf(A.get(Front));

        return Answer;
    }
}

// Class 2
// Main class
class Question5QueueList {

    // Main driver method
    public static void main(String args[])
    {

        queue<Integer> queue1 = new queue<>();


        queue1.enqueue(43);
        queue1.enqueue(55);
        queue1.enqueue(33);

        // Print the queue after inserting integer elements
        System.out.println("queue1 after enqueue of 3 elements:\n" + queue1);
        queue1.dequeue();
        System.out.println("queue1 after dequeue :\n" + queue1);


        queue<String> queue2 = new queue<>();

        queue2.enqueue("yes");
        queue2.enqueue("as");
        queue2.enqueue("vi");

        // Print the queue after inserting string elements
        System.out.println("\n queue2 after enqueue of 3 elements:\n" + queue2);

        // Printing Front and Rear of the above queue
        System.out.println("queue2 Front = " + queue2.Front()+ ", queue2 Rear = " + queue2.Rear());

        queue<Float> queue3 = new queue<>();

        System.out.println("\nCreated new Float type queue queue3...");


        System.out.println("Checking if queue is empty or not :\n"+ queue3.empty());
    }
}