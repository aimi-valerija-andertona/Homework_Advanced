package Exception.Task_6;


import Exception.Task_2.MyBestException;

public class ClassTwoMethodsR {
    public void f() {
        try {
            g();
        } catch (NullPointerException | MyBestException e) {
            throw new NullPointerException("exc!!!");
        }

    }

    public void g() throws MyBestException {
        throw new MyBestException("thrown cause it was needed");
    }


}
