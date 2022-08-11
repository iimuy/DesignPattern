package com.lmch.Adapter;

public class PrinterBanner extends Banner implements Print {
    public PrinterBanner(String string) {
        super(string);
    }

    @Override
    public void pringWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithStrong();
    }
}
