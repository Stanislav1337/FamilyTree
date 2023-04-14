package Presenter;

import UI.View;

public class Presenter {

    private View view;

    public Presenter(View view) {
        this.view = view;
        view.setPresenter(this);
    }

    public void HumanAdd(String nextLine) {
        System.out.println("Человек добавлен");
    }
}
