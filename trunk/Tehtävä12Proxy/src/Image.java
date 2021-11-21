
public interface Image {
	 public void displayImage();
	 public void showData();
}
//On System A
class RealImage implements Image {
 private final String filename;

 /**
  * Constructor
  * @param filename
  */
 public RealImage(String filename) {
     this.filename = filename;
     loadImageFromDisk();
 }

 /**
  * Loads the image from the disk
  */
 private void loadImageFromDisk() {
     System.out.println("Loading   " + filename);
 }

 /**
  * Displays the image
  */
 public void displayImage() {
     System.out.println("Displaying " + filename);
 }

@Override
public void showData() {
	System.out.println("File name:" +filename);
	
}
}

//On System B
class ProxyImage implements Image {
 private final String filename;
 private RealImage image;
 
 /**
  * Constructor
  * @param filename
  */
 public ProxyImage(String filename) {
     this.filename = filename;
 }

 /**
  * Displays the image
  */
 public void displayImage() {
     if (image == null) {
        image = new RealImage(filename);
     }
     image.displayImage();
 }

@Override
public void showData() {
	System.out.println("File name:" +filename);

	
}
}



