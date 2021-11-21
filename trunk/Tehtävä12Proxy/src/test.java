import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<Image> arr=new ArrayList();
		 Image image1 = new ProxyImage("HiRes_10MB_Photo1");
	     Image image2 = new ProxyImage("HiRes_10MB_Photo2");
	     Image image3 = new ProxyImage("HiRes_10MB_Photo3");
	     Image image4 = new ProxyImage("HiRes_10MB_Photo4");
	     arr.add(image1);
	     arr.add(image2);
	     arr.add(image3);
	     arr.add(image4);
	     
	     //sisältö kuvien nimet
	     System.out.println("Kansion sisältö");
	     for(Image a:arr) {
	    	 a.showData();
	     }
	     System.out.println("Kuvien Selaaminen");
	     //kuvien selaaminen
	     for(Image a:arr) {
	    	 a.displayImage();
	     }
	  
	}

}
