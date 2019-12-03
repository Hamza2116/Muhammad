public class MathConflicated {
    public static void main(String[] args) {
        int a = 4;
        int b= 3;
        MathConflicated myapp = new MathConflicated();
        myapp.add(a,b);
        myapp.sub(a,b);
    }
    public int add(int first,int second){
        return first+second;
    }
    public int sub(int first,int second){
<<<<<<< HEAD
        System.out.println("Hello World"+(first+second));
        return first-second;
=======
	short res = (short)first - (short)second;
        return res;
>>>>>>> origin/master
    }
}