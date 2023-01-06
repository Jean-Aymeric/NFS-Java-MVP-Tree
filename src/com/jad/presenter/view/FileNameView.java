package com.jad.presenter.view;

import java.util.Scanner;

public class FileNameView implements IPresenterView {
    @Override
    public String display() {
        System.out.println("Entrez un nom de ficher :");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
