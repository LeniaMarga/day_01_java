import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ArrayListEightBallTest {
    ArrayListEightBall arrayListEightBall;

    @Before
    public void before(){
        arrayListEightBall = new ArrayListEightBall ();
        arrayListEightBall.addAnswer ("cookie");
        arrayListEightBall.addAnswer ("pancake");
        arrayListEightBall.addAnswer ("oats");
    }

    @Test
    public void hasNumber0fEntries(){
        assertEquals (0, arrayListEightBall.getAnswerCount());
    }

    @Test
    public void canAddAnswerToArray(){
        arrayListEightBall.addAnswer("peanuts");
        assertEquals (1, arrayListEightBall.getAnswerCount());
    }


    @Test
    public void canRemoveAnswerFromArray(){
        arrayListEightBall.removeAnswer("peanuts");
        assertEquals (0, arrayListEightBall.getAnswerCount());
    }

    @Test
    public void canShuffleAnswer(){
        ArrayListEightBall.shuffleAnswer(arrayListEightBall);
        assertEquals (3, arrayListEightBall.getAnswerCount());
    }


}
