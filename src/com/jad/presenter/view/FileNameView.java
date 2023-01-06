package com.jad.presenter.view;

import java.util.Scanner;

public class FileNameView extends DecoratorPresenterView {
    public FileNameView() {
        super(new PresenterView());
    }

    @Override
    public String decoratedDisplay() {
        System.out.println("Entrez un nom de ficher :");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
