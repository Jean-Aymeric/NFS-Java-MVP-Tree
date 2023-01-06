package com.jad;

import com.jad.controller.Controller;
import com.jad.model.Model;
import com.jad.presenter.Presenter;
import com.jad.share.IController;

public class Main {

    public static void main(String[] args) {
        IController controller = new Controller(new Presenter(), new Model());

        controller.start();
    }
}
