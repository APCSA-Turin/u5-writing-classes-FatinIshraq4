public class Prism {
    int len;
    int wid;
    int hei;

    public Prism(int length, int width, int height) {
        len = length;
        wid = width;
        hei = height;
    }  

    public Prism() {
        len = (int) ((Math.random()*91)+10);
        wid = (int) ((Math.random()*91)+10);
        hei = (int) ((Math.random()*91)+10);
    }

    public Prism(int i) {
        len = i;
        wid = i;
        hei = i;
    }

    public String dimensions() {
        return "Length = " + len + "\nWidth = " + wid + "\nHeight = " + hei;
    }

    public int volume() {
        return len*wid*hei;
    }

    public int surfaceArea() {
        int i = 2*len*wid + 2*len*hei + 2*hei*wid;
        return i;
    }

    public void setLength(int l) {len=l;}
    public void setWidth(int l) {wid=l;}
    public void setHeight(int l) {hei=l;}

}
