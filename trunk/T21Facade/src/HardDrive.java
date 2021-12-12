
public class HardDrive {
char[] data= {'1', '1','0','1','0','1','0','0'};
public char[] read(long lba,int size) {
	char[] test=new char[size];
	for(int i=0;i<test.length;i++) {
		test[i]=data[(int) (i+lba)];
	}
	return test;
	
}
}
