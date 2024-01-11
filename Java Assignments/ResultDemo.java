class Result {
    public void result() {
        System.out.println("Result is not declared yet!");
    }
}
class UGResult extends Result {
    public void result() {
        System.out.println("UGResult is on 19 June 2023");
    }
}

class PGResult extends Result {
    public void result() {
        System.out.println("PGResult is on 19 March 2023");
    }
}
public class ResultDemo {
    public static void main(String[] args) {
        Result r = new Result();
        UGResult ug = new UGResult();
        PGResult pg = new PGResult();
        r.result(); 
        ug.result(); 
        pg.result(); 
    }
}