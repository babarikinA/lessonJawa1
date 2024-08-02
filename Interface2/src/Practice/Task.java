package Practice;

public class Task {
    public static void main(String[] args) {

        Legkovoi legkovoi = new Legkovoi("BMW", 120, 180, 1300, 4, 10,"Sedan", 4, 200, 2);
        System.out.println("За время" + legkovoi.gettime()+"ч, автомобиль " + legkovoi.getMarka() +"двигаясь с максимальной скоростью:" + legkovoi.getMaxspeed()+"км/ч проедет" + legkovoi.distance +"км и израсходует"+ legkovoi.toplivo+"литров топлива.");

    }

     public void example1{

        Voenii voenii = new Voenii("toyota", 13, 12, 43, 12, 23, false, 42);
        System.out.println(voenii.isKatapult());
        voenii.katapult();
    }

     public void example2{
        Gryzovoi gryzovoi = new Gryzovoi("Kamaz", 150, 120, 3500, 8, 24,3200);
        System.out.println(gryzovoi.gryzik();

    }

     public void example3{
        Grazdanski grazdanski = new Grazdanski("Boeing",2000, 1300, 5000, 30, 3, 400, false);
        System.out.println(grazdanski.kolichestvo());
    }
}
