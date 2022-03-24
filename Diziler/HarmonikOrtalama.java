package Diziler;

public class HarmonikOrtalama {
    public static void main(String[] args) {

    double[] dizi={1,2,3,4,5};
    double total=0.0;
    for(int i=0;i<dizi.length;i++){
        total= total+(1/dizi[i]);
    }
        System.out.println("Harmonik Ortalama:"+dizi.length/total);
}
}
