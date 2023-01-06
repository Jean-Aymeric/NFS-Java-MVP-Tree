package com.jad.presenter.view;

public abstract class DecoratorPresenterView implements IPresenterView {
    private final IPresenterView decorated;

    protected DecoratorPresenterView(final IPresenterView decorated) {
        this.decorated = decorated;
    }

    @Override
    public String display() {
        this.decorated.display();
        return this.decoratedDisplay();
    }

    protected abstract String decoratedDisplay();
}
