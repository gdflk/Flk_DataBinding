package com.flk.databind;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flk.databind.databinding.ItemRecyclerViewBinding;
import com.flk.databind.recycler.ListEntity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private List<ListEntity> list;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        list = createList();


        recyclerView.setAdapter(new RecyclerView.Adapter() {
            ItemRecyclerViewBinding binding;
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                binding = DataBindingUtil.inflate(LayoutInflater.from(RecyclerViewActivity.this),R.layout.item_recycler_view, parent, false);
                return new RecyclerView.ViewHolder(binding.getRoot()) {
                };
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                binding = DataBindingUtil.getBinding(holder.itemView);
                binding.setItem(list.get(position));
            }

            @Override
            public int getItemCount() {
                return list.size();
            }
        });

    }

    public void upDataTop(View v) {
        int top = ((LinearLayoutManager)recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        list.get(top).setContent("upData time : " + new SimpleDateFormat("yyyy-MM-dd : hh.mm.ss").format(new Date()));
    }
    public void upDataAll(View v) {
        String data = "upData time : " + new SimpleDateFormat("yyyy-MM-dd : hh.mm.ss").format(new Date());
        for (ListEntity entity : list) {
            entity.setContent(data);
        }

    }
    public void reset(View v) {
        for (ListEntity entity : list) {
            entity.setContent(entity.getUrl());
        }
    }



    private final List<ListEntity> createList(){
        final List<ListEntity> list = new ArrayList<>();
        ListEntity entity = new ListEntity();

        entity.setTitle("蓝色背景图片");
        entity.setContent("http://pic40.nipic.com/20140414/11963028_164038012000_2.jpg");
        entity.setUrl("http://pic40.nipic.com/20140414/11963028_164038012000_2.jpg");
        list.add(entity);

        entity = new ListEntity();
        entity.setTitle("枯叶绿叶ppt背景图片");
        entity.setContent("http://www.pptbz.com/pptpic/UploadFiles_6909/201203/2012031220134655.jpg");
        entity.setUrl("http://www.pptbz.com/pptpic/UploadFiles_6909/201203/2012031220134655.jpg");
        list.add(entity);

        entity = new ListEntity();
        entity.setTitle("宇宙星空图片");
        entity.setContent("http://scimg.jb51.net/allimg/160815/103-160Q509544OC.jpg");
        entity.setUrl("http://scimg.jb51.net/allimg/160815/103-160Q509544OC.jpg");
        list.add(entity);

        entity = new ListEntity();
        entity.setTitle("森林精灵");
        entity.setContent("http://www.xxjxsj.cn/article/UploadPic/2009-5/2009530163624615.jpg");
        entity.setUrl("http://www.xxjxsj.cn/article/UploadPic/2009-5/2009530163624615.jpg");
        list.add(entity);

        entity = new ListEntity();
        entity.setTitle("抽象科技背");
        entity.setContent("http://www.taopic.com/uploads/allimg/110812/1820-110Q20HA296.jpg");
        entity.setUrl("http://www.taopic.com/uploads/allimg/110812/1820-110Q20HA296.jpg");
        list.add(entity);

        entity = new ListEntity();
        entity.setTitle("蝴蝶图片");
        entity.setContent("http://scimg.jb51.net/allimg/160805/103-160P511403X58.jpg");
        entity.setUrl("http://scimg.jb51.net/allimg/160805/103-160P511403X58.jpg");
        list.add(entity);

        entity = new ListEntity();
        entity.setTitle("儿童插画矢量图");
        entity.setContent("http://pic27.nipic.com/20130201/1773545_002859086000_2.jpg");
        entity.setUrl("http://pic27.nipic.com/20130201/1773545_002859086000_2.jpg");
        list.add(entity);

        entity = new ListEntity();
        entity.setTitle("圣诞背景图片");
        entity.setContent("http://pic11.nipic.com/20101111/2531170_134602927000_2.jpg");
        entity.setUrl("http://pic11.nipic.com/20101111/2531170_134602927000_2.jpg");
        list.add(entity);

        entity = new ListEntity();
        entity.setTitle("动漫桌面壁纸");
        entity.setContent("http://img2.niutuku.com/desk/anime/3354/3354-4958.jpg");
        entity.setUrl("http://img2.niutuku.com/desk/anime/3354/3354-4958.jpg");
        list.add(entity);

        return list;
    }


}
