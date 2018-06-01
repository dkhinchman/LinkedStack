import javax.sound.sampled.Line;

public class LinkedStackMain {
    public static void main(String[] args){
        LinkedStack lsInts = new LinkedStack();

        lsInts.push(50 );
        lsInts.push(60 );
        lsInts.push(70 );
        lsInts.push(80 );
        lsInts.push(90 );

        while(!lsInts.isEmpty()){
            System.out.println(lsInts.pop().toString());
        }

        LinkedStack lsDoubles = new LinkedStack();
        lsDoubles.push(1.1);
        lsDoubles.push(1.2);
        lsDoubles.push(1.3);
        lsDoubles.push(1.4);
        lsDoubles.push(1.5);

        while(!lsDoubles.isEmpty()){
            System.out.println(lsDoubles.pop().toString());
        }

        LinkedStack lsChars = new LinkedStack();
        lsChars.push('a');
        lsChars.push('b');
        lsChars.push('c');
        lsChars.push('d');
        lsChars.push('e');

        while(!lsChars.isEmpty()){
            System.out.println(lsChars.pop().toString());
        }

    }
}
