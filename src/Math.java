public class Math{
    public static void main(String[] args) {
        int a = 4;
        int b= 3;
        Math myapp = new Math();
        myapp.add(a,b);
        myapp.sub(a,b);
    }
    public int add(int first,int second){
        return first+second;
    }
    public int sub(int first,int second){
	short res = (short)first - (short)second;
        return res;
    }
}