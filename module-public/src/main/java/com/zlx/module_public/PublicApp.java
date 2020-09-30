package com.zlx.module_public;

import com.zlx.module_base.BaseApplication;
import com.zlx.module_base.config.ModuleLifecycleConfig;

/**
 * Created by zlx on 2020/9/30 13:31
 * Email: 1170762202@qq.com
 * Description:
 */
public class PublicApp extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
    }
}
