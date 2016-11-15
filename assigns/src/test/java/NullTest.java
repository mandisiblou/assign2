import java.util.ArrayList;

/**
 * Created by Mandisi on 11/15/2016.
 */
public class NullTest {
    private Staff staff;
    private Students students;

    @Before
    public void setUp() throws Exception {

        staff = new Staff("Rasta", 30 );
        students = new Students("Terra", 25);

    }
    //Nullness
    @Test
    public void NullTest() throws Exception {

        students = null;
        Assert.assertNull(students);

    }
}
