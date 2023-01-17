package reportngcl;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Reporter;
import Utilities1.browserClass;

public class reportngtesting extends browserClass{
	@Test
	public void reportngcheck1 () {
		driver.get("https://mvnrepository.com/artifact/org.uncommons/reportng/1.1.4");
	
	}
	
	@Test
	public void reportngcheck2 () {
		driver.get("https://www.youtube.com");
		Assert.assertTrue(false);
		
	}
	@Test
	public void reportngcheck3 () {
		driver.get("https://www.yahoo.com");
		
	}
	@Test
	public void reportngcheck4 () {
		driver.get("https://google.com");
		
	}

}
