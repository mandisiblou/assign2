import java.util.ArrayList;

/**
 * Created by Mandisi on 11/15/2016.
 */
public class IntergersTest {

    private Staff staff;
    private Students students;

    @Before
    public void setUp() throws Exception {

        staff = new Staff("Rasta", 30 );
        students = new Students("Thembile", 20);

    }

    //Integers
    @Test
    public void integerTest() throws Exception {

        Assert.assertEquals(4, 4);

    }
}