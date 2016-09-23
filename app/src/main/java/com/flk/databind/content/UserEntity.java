package com.flk.databind.content;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by flk on 2016/9/22.
 */
public class UserEntity {
    private String userName;
    private String userDesn;
    private String iconUrl;

    private int age;
    private String sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDesn() {
        return userDesn;
    }

    public void setUserDesn(String userDesn) {
        this.userDesn = userDesn;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 使用Picasso加载网络图片，可替换自己的加载图片写法
     * imageLoad是xml布局中的定义
     */
    @BindingAdapter("bind:imageLoad")
    public static void
    setImageView(ImageView view, String url){
        Picasso.with(view.getContext()).load(url).into(view);
    }
}
