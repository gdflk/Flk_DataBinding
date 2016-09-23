package com.flk.databind;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.flk.databind.content.UserEntity;
import com.flk.databind.databinding.ActivityContentBinding;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityContentBinding contentBinding = DataBindingUtil.setContentView(this, R.layout.activity_content);

        UserEntity userEntity = new UserEntity();

        userEntity.setSex("男");
        userEntity.setAge(24);
        userEntity.setIconUrl("http://img5.imgtn.bdimg.com/it/u=1610859883,1281972556&fm=21&gp=0.jpg");
        userEntity.setUserDesn("I am Android developer");
        userEntity.setUserName("flk");

        contentBinding.setUser(userEntity);
        contentBinding.setScore("优秀");

//        ScoreEntity scoreEntity = new ScoreEntity();
//
//        scoreEntity.setChinese(88);
//        scoreEntity.setMath(99);
//        scoreEntity.setEnglish(77);
//        scoreEntity.setScore("优秀");

    }
}
