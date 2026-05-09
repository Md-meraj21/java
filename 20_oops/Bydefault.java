public class Bydefault {
    
    public static void main(String[] args) {
        Baby q = new Baby();
        q.setname("Sona");
        q.setcollage(143);
        System.out.println(q.getname());
        System.out.println(q.getcollage());
        
    }
    
}
class Baby {
    private String name;
    private int collage;
    String getname() {
        return this.name;
    }
    int getcollage() {
        return this.collage;
    }
    void setname(String name) {
        this.name = name;
    } 
    void setcollage(int collage) {
        this.collage = collage;
    }
}

