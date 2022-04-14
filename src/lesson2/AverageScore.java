package lesson2;

public class AverageScore {
    public Double[] GetDoubleArray(String str){
        String[] arr = str.split(",");
        Double[] douarr = new Double[arr.length];
        for(int i = 0;i<arr.length;i++){
            douarr[i] = Double.parseDouble(arr[i]);
        }
        return douarr;
    }

    public Double GetAverage(Double[] douarr){
        Double sum = 0.0;
        for(int i = 0;i<douarr.length;i++){
            sum+=douarr[i];
        }
        return  sum / douarr.length;
    }
}
