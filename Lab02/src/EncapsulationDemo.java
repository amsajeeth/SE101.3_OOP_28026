public class EncapsulationDemo{
    private String empName;

    /* The getEmpName() method is a public getter that allows other classes to retrieve the value of empName. */

    public String getEmpName(){
        return empName;
    }

    /* The setEmpName() method is a public setter that allows other classes to set a new value for empName.*/

    public void setEmpName(String newValue){
        empName = newValue;
    }
}