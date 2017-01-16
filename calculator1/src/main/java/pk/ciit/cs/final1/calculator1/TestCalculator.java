package pk.ciit.cs.final1.calculator1;

public class TestCalculator {

	private static Calculator calculator  = new Calculator();
	//@Test
	public void testfindMax(){
		int result = calculator.findMax(3, 4,3);
		assertEquals(4, result);
	}
	
	//@Test
	public void testfindMax1(){
		int result = calculator.findMax(-1, -4,-3);
		assertEquals(3, result);
	}
	//@Test
		public void testfindMax2(){
			int result = calculator.findMax(-1, 4,0);
			assertEquals(3, result);
		}
		
		//@Test
		public void testfindMax3(){
			int result = calculator.findMax(6, 2,4);
			assertEquals(3, result);
		}
	
	//@Test
	public void square(){
		int result = calculator.square(3);
		assertEquals(9, result);
	}
	//@Test
	public void square1(){
		int result = calculator.square(-2);
		assertEquals(4, result);
	}
	//@Test
	public void testFindCube()
	{
		int cube = calculator.cube(-2);
		
		//assertEquals(8, cube);
		assertEquals(4, cube);
	}
	private void assertEquals(int i, int result) {
		// TODO Auto-generated method stub
		
	}

}
