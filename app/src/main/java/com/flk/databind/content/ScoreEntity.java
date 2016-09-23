package com.flk.databind.content;

/**
 * Created by flk on 2016/9/23.
 */
public class ScoreEntity {
    private String score;
    private int chinese;
    private int math;
    private int english;

    public void setScore(String score) {
        this.score = score;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
