public class Main {
    public static void main(String[] args) {

        Vehicle_Layer model = retriveVehicleFromDatabase();
        Vehicle_View view = new Vehicle_View();

       //Vehicle_Controller controller = new Vehicle_Controller(model, view);

        //controller.updateView();

        //update model data
        //controller.setName("Passat");
        System.out.println("nAfter updating, Vehicle Details are as follows");

        //controller.updateView();
    }

    private static Vehicle_Layer retriveVehicleFromDatabase()
    {
        Vehicle_Layer v = new Vehicle_Layer();
        v.set_name("Passat");
        v.set_Category("Blue");
        v.set_Year(2000);

        return v;
    }

}

