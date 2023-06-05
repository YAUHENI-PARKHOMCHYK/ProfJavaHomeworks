package newTeacher.lesson1.practic;


import newTeacher.lesson1.BaseFigure;

public class Test {
    public static void main(String[] args) {

        Alarm alarm = new Alarm(1);
        Dishwasher dishwasher = new Dishwasher(0);
        Light light = new Light(1);
        TV tv = new TV(0);

        Technique[] techniques = new Technique[10];
        techniques[0] = alarm;
        techniques[1] = dishwasher;
        techniques[2] = light;
        techniques[3] = tv;

        for (int i = 0; i<techniques.length; i++){
            BaseTechnique technique = (BaseTechnique) techniques[i];
            technique.draw();
            technique.workStatus();

        }
    }
}
