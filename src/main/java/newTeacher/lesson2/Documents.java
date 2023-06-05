package newTeacher.lesson2;

public class Documents implements Comparable<Documents>{
    int number;
    int sum;

    public Documents(int number, int sum) {
        this.number = number;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "number=" + number +
                ", sum=" + sum +
                '}';
    }

    @Override
    public int compareTo(Documents doc) {
        if(this.number>doc.number) return 1;
        if(this.number==doc.number) return 0;
        if(this.number<doc.number) return -1;
        return 0;
    }
}
