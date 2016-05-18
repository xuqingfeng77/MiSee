package com.eposp.misee;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.cropper.ui.AssetsAct;
import com.eposp.bean.Person;
import com.eposp.bean.UserB;
import com.jni.samples.HelloJniTest;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {
Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=MainActivity.this;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // 初始化 Bmob SDK
        // 使用时请将第二个参数Application ID替换成你在Bmob服务器端创建的Application ID
        Bmob.initialize(this, "a012d5e483e186b251b7645fd9c0a387");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void InsertClick(View v){
        toast("开始点击事件");


        Person p2 = new Person();
        p2.setName("lucky");
        p2.setAddress("北京海淀");
        p2.save(this, new SaveListener() {
            @Override
            public void onSuccess() {
                // TODO Auto-generated method stub
                toast("亲, 小菜拿到身份证了, 一起登陆辽宁号去吧");
            }

            @Override
            public void onFailure(int code, String msg) {
                // TODO Auto-generated method stub
                toast("创建数据失败：" + msg);
            }
        });


// 开始提交注册信息
//        UserB bu = new UserB();
//        bu.setName("xqf");
//        bu.setPwd("123456");
//        bu.save(this, new SaveListener() {
//            @Override
//            public void onSuccess() {
//                toast("亲, 小菜拿到身份证了, 一起登陆辽宁号去吧");
//            }
//
//            @Override
//            public void onFailure(int arg0, String msg) {
//                toast("亲, 被人捷足先登了, 换个名字吧.");
//            }
//
//        });
    }
    public void AssetsClick(View view){
        intentAssets();
    }
    private void intentAssets(){
//        Intent intent =new Intent (mContext, AssetsAct.class);//
//        startActivity(intent);
        Toast.makeText(mContext, HelloJniTest.getPassFromJNI(),Toast.LENGTH_LONG).show();//获取aar文件中jni测试
    }

    public void toast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    };
}
