
public class Memory {
	char[] data1;
public void load(long position, char[] data) {
	this.data1=new char[data.length];
	for(int i=0;i<data1.length;i++) {
		data1[i]=data[(int) (i+position)];
		System.out.println(data[i] +" ladataan RAM");
	}
}
}
