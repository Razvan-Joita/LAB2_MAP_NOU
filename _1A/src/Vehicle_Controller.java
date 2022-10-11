public class Vehicle_Controller {
    private Vehicle_Controller model;
    private Vehicle_View view;
     public Vehicle_Controller(Vehicle_Controller model,Vehicle_View view)
     {
         this.model=model;
         this.view=view;
     }

    public Vehicle_Controller() {

    }

    public Vehicle_Controller(Vehicle_Layer model, Vehicle_View view) {
    }


    public void setName(String name){
        model.setName(name);
    }

    public String getName(){
        return model.getName();
    }

    public void setYear(int year){
        model.setYear(year);
    }

    public String getYear(){
        return model.getYear();

    }

    public void set_Category(String category){
        model.set_Category(category);
    }

    public int get_Category(){
        return model.get_Category();
    }
    public void updateView(){
        view.printCourseDetails(model.getName(), model.get_Category(), model.getYear());

    }



}
