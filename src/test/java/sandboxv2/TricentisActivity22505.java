package sandboxv2;

import org.testng.annotations.Test;

import sandboxv2.Base.BaseTest;
import sandboxv2.PageObjects.Tricentis2205Page;
//EASY-5pts
public class TricentisActivity22505 extends BaseTest{
	
	@Test
	public void ID22505() throws Exception{
		Tricentis2205Page tricentis2205Page = tricentisHomePage.clickObstacle22505();
		tricentis2205Page.obstacle25505Btn();
		
	}

}
