package UI;

import Presenter.Presenter;
public interface View {
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
}
