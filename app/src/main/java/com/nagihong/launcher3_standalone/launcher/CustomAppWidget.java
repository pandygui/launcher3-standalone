package com.nagihong.launcher3_standalone.launcher;

public interface CustomAppWidget {
    public String getLabel();
    public int getPreviewImage();
    public int getIcon();
    public int getWidgetLayout();

    public int getSpanX();
    public int getSpanY();
    public int getMinSpanX();
    public int getMinSpanY();
    public int getResizeMode();
}
