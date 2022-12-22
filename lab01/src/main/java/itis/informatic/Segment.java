package itis.informatic;

public class Segment {
    public Point start;
    public Point end;
    public Distance disX;
    public Distance disY;

    public Segment(Point start, Point end, Distance disx, Distance disy) {
        this.start = start;
        this.end = end;
        this.disX = disx;
        this.disY = disy;
    }

    public Point Average() {
        Point middle = new Point((this.start.x + this.end.x) / 2,
                (this.start.y + this.end.y) / 2);
        return middle;
    }

    public String TransferFP() {
        double nx1 = this.start.x + this.disX.z1;
        double ny1 = this.start.y + this.disY.z2;
        String rez = ("[" + start.x + "," + start.y + ']' + "=>" + "[" + nx1 + "," + ny1 + "]");
        return rez;
    }

    public String TransferSP() {
        double nx2 = this.end.x + this.disX.z1;
        double ny2 = this.end.y + this.disY.z2;
        String rez = ("[" + end.x + "," + end.y + ']' + "=>" + "[" + nx2 + "," + ny2 + "]");
        return rez;
    }



}



