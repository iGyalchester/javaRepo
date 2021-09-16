package dahood;

public class Projex {

    public String cornerStore, hoes, streetSweepers, bootlegLiquorStore, piece;
    public int crackHeads;

    //actions
    public boolean getRobbed (String piece){
        if (this.piece.equalsIgnoreCase(piece)){
            return true;
        }
        return false;
    }
    public Projex(int crackHeads, String cornerStore, String hoes, String streetSweepers, String bootlegLiquorStore, String piece){
        this.crackHeads = crackHeads;
        this.cornerStore = cornerStore;
        this.hoes = hoes;
        this.streetSweepers = streetSweepers;
        this.bootlegLiquorStore = bootlegLiquorStore;
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Projex{" +
                "cornerStore='" + cornerStore + '\'' +
                ", hoes='" + hoes + '\'' +
                ", streetSweepers='" + streetSweepers + '\'' +
                ", bootlegLiquorStore='" + bootlegLiquorStore + '\'' +
                ", crackHeads=" + crackHeads +
                '}';
    }
}
