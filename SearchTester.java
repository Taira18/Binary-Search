import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SearchTester {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int[] test1 = {13,2,7,12,15,4,11,6,10,9,3,1,14,5,8};
		MergeSorter.mergeSort(test1, 0, 14);
		assertEquals(0, BinarySearcher.binarySearch(test1, 0, 14, 1));
		assertEquals(7, BinarySearcher.binarySearch(test1, 0, 14, 8));
		assertEquals(13, BinarySearcher.binarySearch(test1, 0, 14, 14));
		assertEquals(14, BinarySearcher.binarySearch(test1, 0, 14, 15));
		assertEquals(2, BinarySearcher.binarySearch(test1, 0, 14, 3));
		assertEquals(10, BinarySearcher.binarySearch(test1, 0, 14, 11));
		assertEquals(8, BinarySearcher.binarySearch(test1, 0, 14, 9));


		
	}

}
