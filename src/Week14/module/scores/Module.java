package Week14.module.scores;

public class Module implements Comparable<Module>{
    private String code, name;
    private int score;
    private boolean active;

    public Module(String code, String name, int score) {
        this.code = code;
        this.name = name;
        this.score = score;
        this.active = true;
    }

    public Module(){

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void toggleFinished(){
        if(this.active){
          this.active = false;
        }else{
            this.active = true;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %-40s | Code: %6s | Score: %2d | ACTIVE: %2s ",
                this.name, this.code, this.score, this.active);
    }


    @Override
    public int compareTo(Module m) {
        //compare by score
        int result = Double.compare(m.getScore(), this.getScore());

        //if equal compare by code
        if(result == 0){
            result = this.getCode().compareTo(m.getCode());
        }

        return result;
    }
}
