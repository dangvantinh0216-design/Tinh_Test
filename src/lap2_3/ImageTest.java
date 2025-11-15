package lap2_3;

import junit.framework.TestCase;

public class ImageTest extends TestCase {
	public void testIsPortrait () {
		Image img1 = new Image (800, 1200, "pic1.jpg", "HD");
		     assertTrue(img1.isPortrait());
		Image img2 = new Image (1200, 800,  "pic2.jpg", "HD");
		     assertFalse(img2.isPortrait());
	     Image img3 = new Image (1000, 1200, "pic3.jpg", "HD");
	         assertTrue(img3.isPortrait());
	}
   public void testSize () {
	   Image img1 = new Image (100, 50, "pic1.jpg", "HD");
	       assertEquals(img1.size(), 5000 );
	   Image img2 = new Image (150, 100, "pic1.jpg", "HD");
	       assertEquals(img2.size(), 15000 );
	   Image img3 = new Image (200, 150, "pic3.jpg", "HD");  
	       assertEquals(img3.size(), 30000 );
   }
   public void testIsLarger() {
	   Image img1 = new Image (800, 600, "pic1.jpg", "HD");
	   Image img2 = new Image (1000, 800, "pic2.jpg", "HD");
	   Image img3 = new Image (600, 400, "pic3.jpg", "HD");
	   assertFalse(img1.isLarger(img2));
	   assertTrue(img2.isLarger(img1));
	   assertTrue(img2.isLarger(img3));
   }
   public void testSame() {
	   Image img1 = new Image (800, 600, "pic1.jpg", "HD");
	   Image img2 = new Image (800, 600, "pic1.jpg", "HD");
	   Image img3 = new Image (1000, 600, "pic3.jpg", "HD");
	   assertTrue(img1.same(img2));
	   assertFalse(img2.same(img3));
	   assertFalse(img1.same(img3));
   }
   public void testSizeString() {
	   Image img1 = new Image (100, 100, "pic1.jpg", "HD");
	   assertEquals(img1.sizeString(), "small");
	   Image img2 = new Image (500, 500, "pic2.jpg", "HD");
	   assertEquals(img2.sizeString(), "medium");
	   Image img3 = new Image (2000, 2000, "pic3.jpg", "HD");
	   assertEquals(img3.sizeString(), "large");
   }
}
