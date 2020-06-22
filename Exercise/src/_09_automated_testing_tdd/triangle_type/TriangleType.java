package _09_automated_testing_tdd.triangle_type;

public class TriangleType {
    public static String triangleClassifier(int side1, int side2, int side3) {
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if ((side1 == side2) && (side1 == side3)) {
                return "Tam giac deu";
            } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
                return "Tam giac can";
            } else if ((side1 < (side2 + side3)) && (side2 < (side1 + side3)) && (side3 < (side1 + side2))) {
                return "Tam giac thuong";
            }
        }
        return "khong phai tam giac";
    }
}
