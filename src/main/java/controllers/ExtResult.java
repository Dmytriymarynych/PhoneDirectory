package controllers;

import model.Phone;
/**
 * Created with IntelliJ IDEA.
 * User: d.marynych
 * Date: 17.09.2017
 * Time: 6:32
 * To change this template use File | Settings | File Templates.
 */

public class ExtResult {
    private boolean success;
    private Phone data;


    public ExtResult(boolean success, Phone data) {
        this.success = success;
        this.data = data;
    }

    public ExtResult() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Phone getData() {
        return data;
    }

    public void setData(Phone data) {
        this.data = data;
    }
}
