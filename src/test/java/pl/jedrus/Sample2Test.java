package pl.jedrus;

import org.junit.*;

public class Sample2Test {


    @Test
    public void sampleMethod() {
        System.out.println("sample 1");
    }


    @Test
    public void sample2Method() {
        System.out.println("sample 2");
    }

    @Before
    public void setUp() throws Exception {

        System.out.println("before");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        System.out.println("before class");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("after class");
    }

    @Test
    public void sampleEx() {
//        Sample.sampleEx();

        System.out.println("exception");
    }
}