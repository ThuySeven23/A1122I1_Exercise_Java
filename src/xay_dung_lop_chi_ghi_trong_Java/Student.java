package xay_dung_lop_chi_ghi_trong_Java;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }


    @Override
    public String toString() {
        return "Student's CodeGym" + "\n" +
                "Name: " + name + "\n" +
                "Classes: " + classes;
    }
}
