package com.flk.databind.recycler;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.flk.databind.BR;
import com.squareup.picasso.Picasso;

/**
 * Created by flk on 2016/9/22.
 * BaseObservable 数据更新
 * getter方式使用 @Bindable 编译 BR与R文件类似的静态类 BR类是在@Bindable编译后才会产生
 * notifyPropertyChanged(id) 在setter中调用可更新UI中的数据，无需调用notifyDataSetChanged更新数据
 */
public class ListEntity extends BaseObservable{
    private final ObservableField<String> title = new ObservableField<>();
    private final ObservableField<String> content = new ObservableField<>();
    private final ObservableField<String> url = new ObservableField<>();

    @BindingAdapter("bind:url")
    public static void setImageUrl(ImageView iv, String url){
        Picasso.with(iv.getContext()).load(url).into(iv);
    }

    //item点击事件，在xml的中调用
    public void itemClick(View v){
        Toast.makeText(v.getContext(), title.get(), Toast.LENGTH_SHORT).show();
    }
    public String getTitle() {
        return title.get();
    }
    public void setTitle(String title) {
        this.title.set(title);
    }

    @Bindable
    public String getContent() {
        return content.get();
    }

    public void setContent(String content) {
        this.content.set(content);
        notifyPropertyChanged(BR.content);
    }

    public String getUrl() {
        return url.get();
    }

    public void setUrl(String url) {
        this.url.set(url);
    }
}
