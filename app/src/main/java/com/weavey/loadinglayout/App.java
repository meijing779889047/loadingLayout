package com.weavey.loadinglayout;

import android.app.Application;

import com.project.webview.R;
import com.weavey.loading.lib.LoadingLayout;

/**
 * Created by weavey
 * on 2016-11-23.
 * todo
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LoadingLayout.getConfig()
                .setErrorText("出错啦~~请稍后重试！")
                .setEmptyText("暂无数据")
                .setNoNetworkText("无网络连接，请检查您的网络···")
                .setErrorImage(R.mipmap.define_error)
                .setEmptyImage(R.mipmap.define_empty)
                .setNoNetworkImage(R.mipmap.define_nonetwork)
                .setAllTipTextColor(R.color.gray)
                .setAllTipTextSize(14)
                .setReloadButtonText("点击重试")
                .setReloadButtonTextSize(14)
                .setReloadButtonTextColor(R.color.gray)
                .setReloadButtonWidthAndHeight(150,40)
                .setAllPageBackgroundColor(R.color.background)
                .setLoadingPageLayout(R.layout.define_loading_page);
    }
}
