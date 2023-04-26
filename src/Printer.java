public class Printer {
    private String model;
    private boolean isLeaserJet;

    public Printer(String model, boolean isLeaserJet) {
        this.model = model;
        this.isLeaserJet = isLeaserJet;
    }

    public void info(){
        System.out.println(model +" "+ isLeaserJet);
    }
    public void print(String filePath){
        try {

            System.out.println("{");
            Thread.sleep(100);
            System.out.println(filePath);
            Thread.sleep(100);
            System.out.println("}");
        }
        catch (Exception e){}
    }
     /*public synchronized void print(String filePath) {
        try {
            System.out.println("{");
            Thread.sleep(100);
            System.out.println(filePath);
            Thread.sleep(100);
            System.out.println("}");
        }
        catch (Exception e) {}
    }*/

}
