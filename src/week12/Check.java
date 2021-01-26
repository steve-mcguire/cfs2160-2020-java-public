package week12;

public class Check {

    private boolean x;
    private boolean y;
    private int num;

    public Check() {
        this.x = true;
        this.y = true;
        this.num = 10;
    }

    public boolean someCheck(){

        if(x || num < 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void loopAStatement(){
        int x = 1000;
        while (x >= 20){
            System.out.println(x);
            x -= 1;
        }
    }

    public static void main(String[] args) {
        Check c = new Check();
        if(c.someCheck()){
            System.out.println("Tis true");
        }else{
            System.out.println("Very false");
        }

        c.loopAStatement();
    }
}
