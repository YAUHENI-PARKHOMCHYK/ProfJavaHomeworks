package newTeacher.lesson1.practic;

public abstract class BaseTechnique implements Technique{
    int peopleInHome;
    boolean behaviour;

    public BaseTechnique(int peopleInHome) {
        this.peopleInHome = peopleInHome;
    }
    public void workStatus(){

        if(peopleInHome == 0){
            behaviour = false;
        }else{
            behaviour = true;

        }
        if(behaviour = false){
            System.out.println("Не работает");
        }else {
            System.out.println("Работает");
        }
    }
}
