package com.weavey.loadinglayout;

import android.app.Application;

import com.project.webview.R;
import com.weavey.loading.lib.LoadingLayout;

/**
 * Created by weavey
 * on 2016-11-23.  ��һ�θ���
 * todo
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
       //��application�г�ʼ����ͼ
        LoadingLayout.getConfig()
                .setErrorText("������~~���Ժ����ԣ�")
                .setEmptyText("��������")
                .setNoNetworkText("���������ӣ������������硤����")
                .setErrorImage(R.mipmap.define_error)
                .setEmptyImage(R.mipmap.define_empty)
                .setNoNetworkImage(R.mipmap.define_nonetwork)
                .setAllTipTextColor(R.color.gray)
                .setAllTipTextSize(14)
                .setReloadButtonText("�������")
                .setReloadButtonTextSize(14)
                .setReloadButtonTextColor(R.color.gray)
                .setReloadButtonWidthAndHeight(150,40)
                .setAllPageBackgroundColor(R.color.background)
                .setLoadingPageLayout(R.layout.define_loading_page);
        
    }
}
